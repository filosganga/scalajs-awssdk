import * as fs from "fs";
import * as path from "path";

// ─── Configuration ───────────────────────────────────────────────────────────

interface Config {
  /** Path to the AWS SDK client source, e.g. .../clients/client-s3/src */
  sdkSrcDir: string;
  /** AWS SDK npm package name, e.g. @aws-sdk/client-s3 */
  npmPackage: string;
  /** Scala package suffix, e.g. s3, dynamodb */
  scalaPackageSuffix: string;
  /** Client class name in the SDK, e.g. S3Client, DynamoDBClient */
  clientClassName: string;
  /** Which commands to generate (empty = all) */
  commands?: string[];
}

// ─── Type Mapping ────────────────────────────────────────────────────────────

/** Types that need human review */
const AMBIGUOUS_TYPES = new Set([
  "StreamingBlobTypes",
  "StreamingBlobPayloadOutputTypes",
  "StreamingBlobPayloadInputTypes",
  "Readable",
  "ReadableStream",
  "Blob",
  "Buffer",
]);

function mapTsTypeToScala(
  tsType: string,
  fieldName: string,
): { scalaType: string; todo?: string } {
  // Strip whitespace
  tsType = tsType.trim();

  // Handle union with undefined → js.UndefOr
  const undefinedUnion = tsType.match(/^(.+?)\s*\|\s*undefined$/);
  if (undefinedUnion) {
    const inner = mapTsTypeToScala(undefinedUnion[1].trim(), fieldName);
    return {
      scalaType: `js.UndefOr[${inner.scalaType}]`,
      todo: inner.todo,
    };
  }

  // Handle optional marker (from ?)
  // (handled at the field level, not here)

  // Primitives
  if (tsType === "string") return { scalaType: "String" };
  if (tsType === "boolean") return { scalaType: "Boolean" };
  if (tsType === "number") {
    // Heuristic: fields named *Count, *Number, *Max*, *Parts* are Int
    if (
      /Count|Parts|Number|MaxKeys|MaxItems|MaxUploads|MaxParts/i.test(fieldName)
    ) {
      return { scalaType: "Int" };
    }
    // Fields named *Size*, *Length*, *Offset* are Double (can exceed Int range)
    if (/Size|Length|Offset|Units/i.test(fieldName)) {
      return { scalaType: "Double" };
    }
    // Default: leave a TODO
    return {
      scalaType: "Double",
      todo: `number type for '${fieldName}' — verify if Int or Double is appropriate`,
    };
  }
  if (tsType === "Date") return { scalaType: "js.Date" };

  // Collections
  const arrayMatch = tsType.match(/^(.+)\[\]$/);
  if (arrayMatch) {
    const inner = mapTsTypeToScala(arrayMatch[1].trim(), fieldName);
    return {
      scalaType: `js.Array[${inner.scalaType}]`,
      todo: inner.todo,
    };
  }

  const recordMatch = tsType.match(/^Record<\s*string\s*,\s*(.+?)\s*>$/);
  if (recordMatch) {
    const inner = mapTsTypeToScala(recordMatch[1].trim(), fieldName);
    return {
      scalaType: `js.Dictionary[${inner.scalaType}]`,
      todo: inner.todo,
    };
  }

  // Streaming / ambiguous types
  if (AMBIGUOUS_TYPES.has(tsType)) {
    return {
      scalaType: "js.Any",
      todo: `streaming/binary type '${tsType}' — consider using SdkStream, io.Readable, or a more specific type`,
    };
  }

  // Uint8Array
  if (tsType === "Uint8Array") return { scalaType: "js.typedarray.Uint8Array" };

  // Anything else is assumed to be a named type (enum or interface)
  return { scalaType: tsType };
}

// ─── Parsing ─────────────────────────────────────────────────────────────────

interface ParsedField {
  name: string;
  tsType: string;
  optional: boolean;
  required: boolean; // explicitly required (no ?)
}

interface ParsedInterface {
  name: string;
  fields: ParsedField[];
  extends_: string[];
}

interface ParsedEnum {
  name: string;
  values: { key: string; value: string }[];
}

interface ParsedCommand {
  commandName: string; // e.g. GetObjectCommand
  inputTypeName: string; // e.g. GetObjectRequest
  outputTypeName: string; // e.g. GetObjectOutput
  inputOverrides: Map<string, string>; // field overrides from CommandInput
  outputOverrides: Map<string, string>; // field overrides from CommandOutput
  inputOmits: Set<string>; // fields omitted via Omit<> on input
  outputOmits: Set<string>; // fields omitted via Omit<> on output
}

function parseEnumsFile(filePath: string): ParsedEnum[] {
  const content = fs.readFileSync(filePath, "utf-8");
  const enums: ParsedEnum[] = [];

  // Match: export const EnumName = { ... } as const;
  const enumRegex = /export\s+const\s+(\w+)\s*=\s*\{([^}]+)\}\s*as\s+const/g;
  let match;
  while ((match = enumRegex.exec(content)) !== null) {
    const name = match[1];
    const body = match[2];
    const values: { key: string; value: string }[] = [];

    const valueRegex = /(\w+)\s*:\s*"([^"]+)"/g;
    let valueMatch;
    while ((valueMatch = valueRegex.exec(body)) !== null) {
      values.push({ key: valueMatch[1], value: valueMatch[2] });
    }

    enums.push({ name, values });
  }

  return enums;
}

function parseModelsFile(filePath: string): ParsedInterface[] {
  const content = fs.readFileSync(filePath, "utf-8");
  const interfaces: ParsedInterface[] = [];

  // Split by export interface
  const interfaceRegex =
    /export\s+interface\s+(\w+)(?:\s+extends\s+([^{]+))?\s*\{/g;
  let match;
  while ((match = interfaceRegex.exec(content)) !== null) {
    const name = match[1];
    const extendsClause = match[2]?.trim() || "";
    const extends_ = extendsClause
      ? extendsClause
          .split(",")
          .map((s) => s.trim())
          .filter(Boolean)
      : [];

    // Find the matching closing brace
    let braceCount = 1;
    let pos = match.index + match[0].length;
    while (braceCount > 0 && pos < content.length) {
      if (content[pos] === "{") braceCount++;
      if (content[pos] === "}") braceCount--;
      pos++;
    }

    const body = content.slice(match.index + match[0].length, pos - 1);
    const fields = parseInterfaceFields(body);

    interfaces.push({ name, fields, extends_ });
  }

  return interfaces;
}

function parseInterfaceFields(body: string): ParsedField[] {
  const fields: ParsedField[] = [];

  // Match field declarations, handling multiline JSDoc comments
  // Pattern: fieldName?: Type | undefined;  or  fieldName: Type;
  const lines = body.split("\n");
  let inComment = false;

  for (const line of lines) {
    const trimmed = line.trim();

    // Skip JSDoc/comments
    if (trimmed.startsWith("/**") || trimmed.startsWith("/*")) {
      inComment = true;
    }
    if (inComment) {
      if (trimmed.includes("*/")) inComment = false;
      continue;
    }
    if (trimmed.startsWith("//") || trimmed.startsWith("*")) continue;
    if (!trimmed || trimmed === "") continue;

    // Match field: name?: Type | undefined;
    const fieldMatch = trimmed.match(/^(\w+)(\?)?:\s*(.+?)\s*;?\s*$/);
    if (fieldMatch) {
      const name = fieldMatch[1];
      const questionMark = !!fieldMatch[2];
      let tsType = fieldMatch[3];

      // Remove trailing semicolon if present
      tsType = tsType.replace(/;$/, "").trim();

      const optional = questionMark || tsType.includes("| undefined");

      fields.push({
        name,
        tsType: tsType.replace(/\|\s*undefined/, "").trim(),
        optional,
        required: !optional,
      });
    }
  }

  return fields;
}

function parseCommandInterface(
  content: string,
  suffix: "Input" | "Output",
): {
  name: string;
  extendsClause: string;
  body: string;
} | null {
  // Match: export interface XxxCommandInput/Output extends ... { ... }
  // Need to handle Omit<Type, "Field"> in extends, so can't just use [^{]
  const regex = new RegExp(
    `export\\s+interface\\s+(\\w+Command${suffix})\\s+extends\\s+`,
    "g",
  );
  const match = regex.exec(content);
  if (!match) return null;

  // Find the opening brace, collecting the extends clause
  let pos = match.index + match[0].length;
  let angleBrackets = 0;
  let extendsStart = pos;
  while (pos < content.length) {
    const ch = content[pos];
    if (ch === "<") angleBrackets++;
    else if (ch === ">") angleBrackets--;
    else if (ch === "{" && angleBrackets === 0) break;
    pos++;
  }
  const extendsClause = content.slice(extendsStart, pos).trim();

  // Find matching closing brace
  pos++; // skip opening {
  let braceCount = 1;
  const bodyStart = pos;
  while (braceCount > 0 && pos < content.length) {
    if (content[pos] === "{") braceCount++;
    if (content[pos] === "}") braceCount--;
    pos++;
  }
  const body = content.slice(bodyStart, pos - 1);

  return { name: match[1], extendsClause, body };
}

function parseOmitAndExtends(extendsClause: string): {
  typeName: string;
  omits: Set<string>;
} {
  const omits = new Set<string>();
  let typeName = "";

  // Split by comma, but respect angle brackets
  const parts: string[] = [];
  let depth = 0;
  let current = "";
  for (const ch of extendsClause) {
    if (ch === "<") depth++;
    else if (ch === ">") depth--;
    else if (ch === "," && depth === 0) {
      parts.push(current.trim());
      current = "";
      continue;
    }
    current += ch;
  }
  if (current.trim()) parts.push(current.trim());

  for (const part of parts) {
    if (part === "__MetadataBearer") continue;

    const omitMatch = part.match(/Omit<(\w+),\s*"(\w+)">/);
    if (omitMatch) {
      typeName = omitMatch[1];
      omits.add(omitMatch[2]);
    } else if (/^\w+$/.test(part) && part !== "__MetadataBearer") {
      typeName = part;
    }
  }

  return { typeName, omits };
}

function parseCommandFile(filePath: string): ParsedCommand | null {
  const content = fs.readFileSync(filePath, "utf-8");
  const fileName = path.basename(filePath, ".ts");

  const inputParsed = parseCommandInterface(content, "Input");
  const outputParsed = parseCommandInterface(content, "Output");

  if (!inputParsed || !outputParsed) return null;

  const commandName = fileName;

  const inputInfo = parseOmitAndExtends(inputParsed.extendsClause);
  const outputInfo = parseOmitAndExtends(outputParsed.extendsClause);

  // Parse field overrides in the command interfaces
  const inputOverrides = new Map<string, string>();
  const outputOverrides = new Map<string, string>();

  for (const field of parseInterfaceFields(inputParsed.body)) {
    inputOverrides.set(field.name, field.tsType);
  }
  for (const field of parseInterfaceFields(outputParsed.body)) {
    outputOverrides.set(field.name, field.tsType);
  }

  return {
    commandName,
    inputTypeName: inputInfo.typeName,
    outputTypeName: outputInfo.typeName,
    inputOverrides,
    outputOverrides,
    inputOmits: inputInfo.omits,
    outputOmits: outputInfo.omits,
  };
}

// ─── Scala Code Generation ──────────────────────────────────────────────────

interface ScalaField {
  name: string;
  scalaType: string;
  required: boolean;
  todo?: string;
}

function toScalaFields(fields: ParsedField[]): ScalaField[] {
  return fields.map((f) => {
    const mapped = mapTsTypeToScala(f.tsType, f.name);
    const scalaType = f.optional
      ? `js.UndefOr[${mapped.scalaType}]`
      : mapped.scalaType;
    return {
      name: f.name,
      scalaType,
      required: f.required,
      todo: mapped.todo,
    };
  });
}

function generateEnumCode(e: ParsedEnum): string {
  const lines: string[] = [];
  lines.push(`sealed trait ${e.name} extends js.Any`);
  lines.push(`object ${e.name} {`);
  for (const v of e.values) {
    // Use PascalCase for the Scala val name
    const valName = v.key.charAt(0).toUpperCase() + v.key.slice(1);
    lines.push(`  val ${valName} = "${v.value}".asInstanceOf[${e.name}]`);
  }
  lines.push(`}`);
  return lines.join("\n");
}

function generateTraitCode(
  name: string,
  fields: ScalaField[],
  extendsClause: string,
): string {
  const lines: string[] = [];

  // Collect TODOs
  const todos = fields.filter((f) => f.todo);
  for (const t of todos) {
    lines.push(`// TODO: ${t.name} — ${t.todo}`);
  }

  lines.push(`@js.native`);
  lines.push(`trait ${name} extends ${extendsClause} {`);

  for (const f of fields) {
    lines.push(`  val ${f.name}: ${f.scalaType} = js.native`);
  }

  lines.push(`}`);
  return lines.join("\n");
}

function generateCompanionApplyCode(
  name: string,
  fields: ScalaField[],
): string {
  const lines: string[] = [];
  const requiredFields = fields.filter((f) => f.required);
  const optionalFields = fields.filter((f) => !f.required);

  lines.push(`object ${name} {`);
  lines.push(`  def apply(`);

  const params: string[] = [];
  for (const f of requiredFields) {
    params.push(`      ${f.name}: ${f.scalaType}`);
  }
  for (const f of optionalFields) {
    params.push(`      ${f.name}: ${f.scalaType} = js.undefined`);
  }
  lines.push(params.join(",\n"));

  lines.push(`  ): ${name} = {`);
  lines.push(`    js.Dynamic`);
  lines.push(`      .literal(`);

  const assignments: string[] = [];
  for (const f of requiredFields) {
    assignments.push(`        ${f.name} = ${f.name}`);
  }
  for (const f of optionalFields) {
    assignments.push(`        ${f.name} = ${f.name}.asInstanceOf[js.Any]`);
  }
  lines.push(assignments.join(",\n"));

  lines.push(`      )`);
  lines.push(`      .asInstanceOf[${name}]`);
  lines.push(`  }`);
  lines.push(`}`);

  return lines.join("\n");
}

function generateCommandCode(
  commandName: string,
  npmPackage: string,
  inputType: string,
  outputType: string,
): string {
  const lines: string[] = [];
  lines.push(`@js.native`);
  lines.push(`@JSImport("${npmPackage}", "${commandName}")`);
  lines.push(`class ${commandName}(override val input: ${inputType})`);
  lines.push(`    extends Command[${inputType}, ${outputType}]`);
  lines.push(``);
  lines.push(`object ${commandName} {`);
  lines.push(`  def apply(input: ${inputType}): ${commandName} =`);
  lines.push(`    new ${commandName}(`);
  lines.push(`      input`);
  lines.push(`    )`);
  lines.push(`}`);
  return lines.join("\n");
}

// ─── Main Generation Logic ──────────────────────────────────────────────────

function generate(config: Config) {
  const { sdkSrcDir, npmPackage, scalaPackageSuffix, clientClassName } = config;

  console.log(`Generating Scala.js facades for ${npmPackage}...`);

  // 1. Parse enums
  const enumsFile = path.join(sdkSrcDir, "models", "enums.ts");
  const enums = fs.existsSync(enumsFile) ? parseEnumsFile(enumsFile) : [];
  console.log(`  Found ${enums.length} enums`);

  // 2. Parse models
  const modelsDir = path.join(sdkSrcDir, "models");
  const modelFiles = fs
    .readdirSync(modelsDir)
    .filter((f) => f.startsWith("models_") && f.endsWith(".ts"))
    .sort();
  const allInterfaces: ParsedInterface[] = [];
  for (const mf of modelFiles) {
    const parsed = parseModelsFile(path.join(modelsDir, mf));
    allInterfaces.push(...parsed);
    console.log(`  Parsed ${parsed.length} interfaces from ${mf}`);
  }

  // Build interface lookup
  const interfaceMap = new Map<string, ParsedInterface>();
  for (const iface of allInterfaces) {
    interfaceMap.set(iface.name, iface);
  }

  // 3. Parse commands
  const commandsDir = path.join(sdkSrcDir, "commands");
  const commandFiles = fs
    .readdirSync(commandsDir)
    .filter((f) => f.endsWith("Command.ts") && f !== "index.ts");

  const allCommands: ParsedCommand[] = [];
  for (const cf of commandFiles) {
    const cmd = parseCommandFile(path.join(commandsDir, cf));
    if (cmd) {
      if (!config.commands || config.commands.includes(cmd.commandName)) {
        allCommands.push(cmd);
      }
    }
  }
  console.log(`  Found ${allCommands.length} commands to generate`);

  // 4. Determine which interfaces and enums are needed
  const neededInterfaces = new Set<string>();
  const neededEnums = new Set<string>();
  const enumNames = new Set(enums.map((e) => e.name));

  function collectDeps(typeName: string) {
    if (
      !typeName ||
      neededInterfaces.has(typeName) ||
      neededEnums.has(typeName)
    )
      return;
    if (enumNames.has(typeName)) {
      neededEnums.add(typeName);
      return;
    }
    const iface = interfaceMap.get(typeName);
    if (iface) {
      neededInterfaces.add(typeName);
      for (const field of iface.fields) {
        // Extract base type from the field type
        const baseTypes = extractTypeRefs(field.tsType);
        for (const bt of baseTypes) {
          collectDeps(bt);
        }
      }
      // Also collect from extends
      for (const ext of iface.extends_) {
        collectDeps(ext);
      }
    }
  }

  for (const cmd of allCommands) {
    if (cmd.inputTypeName) collectDeps(cmd.inputTypeName);
    if (cmd.outputTypeName) collectDeps(cmd.outputTypeName);
    // Collect deps from overrides
    for (const tsType of cmd.inputOverrides.values()) {
      for (const bt of extractTypeRefs(tsType)) collectDeps(bt);
    }
    for (const tsType of cmd.outputOverrides.values()) {
      for (const bt of extractTypeRefs(tsType)) collectDeps(bt);
    }
  }

  // 5. Generate output
  const outputLines: string[] = [];

  // Header
  outputLines.push(`package com.filippodeluca.jsfacade.awssdk`);
  outputLines.push(`package client`);
  outputLines.push(`package ${scalaPackageSuffix}`);
  outputLines.push(`package models`);
  outputLines.push(``);
  outputLines.push(`import com.filippodeluca.jsfacade.awssdk.types.*`);
  outputLines.push(`import scalajs.js`);
  outputLines.push(``);

  // Generate command input/output types
  for (const cmd of allCommands) {
    // Input type
    const inputIface = cmd.inputTypeName
      ? interfaceMap.get(cmd.inputTypeName)
      : null;
    if (inputIface) {
      // Apply omits and overrides
      let fields = inputIface.fields.filter((f) => !cmd.inputOmits.has(f.name));
      for (const [name, tsType] of cmd.inputOverrides) {
        const existing = fields.find((f) => f.name === name);
        if (existing) {
          existing.tsType = tsType;
        } else {
          fields.push({ name, tsType, optional: true, required: false });
        }
      }

      const scalaFields = toScalaFields(fields);
      const inputName = `${cmd.commandName}Input`;

      outputLines.push(generateTraitCode(inputName, scalaFields, "js.Object"));
      outputLines.push(``);
      outputLines.push(generateCompanionApplyCode(inputName, scalaFields));
      outputLines.push(``);
    }

    // Output type
    const outputName = `${cmd.commandName}Output`;
    if (cmd.outputTypeName) {
      const outputIface = interfaceMap.get(cmd.outputTypeName);
      if (outputIface) {
        let fields = outputIface.fields.filter(
          (f) => !cmd.outputOmits.has(f.name),
        );
        // Apply overrides (e.g. Body type in GetObject)
        for (const [name, tsType] of cmd.outputOverrides) {
          const existing = fields.find((f) => f.name === name);
          if (existing) {
            existing.tsType = tsType;
          } else {
            fields.push({ name, tsType, optional: true, required: false });
          }
        }

        const scalaFields = toScalaFields(fields);
        outputLines.push(
          generateTraitCode(outputName, scalaFields, "MetadataBearer"),
        );
        outputLines.push(``);
      }
    } else {
      // Output only extends MetadataBearer
      outputLines.push(`@js.native`);
      outputLines.push(`trait ${outputName} extends MetadataBearer`);
      outputLines.push(``);
    }
  }

  // Generate dependency interfaces (non-command types like Owner, CommonPrefix etc.)
  for (const ifaceName of neededInterfaces) {
    // Skip command input/output types (already generated above)
    const isCommandType = allCommands.some(
      (c) => c.inputTypeName === ifaceName || c.outputTypeName === ifaceName,
    );
    if (isCommandType) continue;

    const iface = interfaceMap.get(ifaceName)!;
    const scalaFields = toScalaFields(iface.fields);
    const extendsClause = "js.Object";

    outputLines.push(generateTraitCode(ifaceName, scalaFields, extendsClause));
    outputLines.push(``);
    // Only generate companion if it has fields
    if (scalaFields.length > 0) {
      outputLines.push(generateCompanionApplyCode(ifaceName, scalaFields));
      outputLines.push(``);
    }
  }

  // Generate needed enums
  outputLines.push(`// Enum types`);
  outputLines.push(``);
  for (const e of enums) {
    if (neededEnums.has(e.name)) {
      outputLines.push(generateEnumCode(e));
      outputLines.push(``);
    }
  }

  // Generate commands file
  const commandLines: string[] = [];
  commandLines.push(`package com.filippodeluca.jsfacade.awssdk`);
  commandLines.push(`package client`);
  commandLines.push(`package ${scalaPackageSuffix}`);
  commandLines.push(`package commands`);
  commandLines.push(``);
  commandLines.push(
    `import com.filippodeluca.jsfacade.awssdk.client.${scalaPackageSuffix}.models.*`,
  );
  commandLines.push(`import scalajs.js`);
  commandLines.push(`import scalajs.js.annotation.JSImport`);
  commandLines.push(``);

  for (const cmd of allCommands) {
    const inputName = `${cmd.commandName}Input`;
    const outputName = `${cmd.commandName}Output`;
    commandLines.push(
      generateCommandCode(cmd.commandName, npmPackage, inputName, outputName),
    );
    commandLines.push(``);
  }

  // Print to stdout
  console.log(
    "\n// ═══════════════════════════════════════════════════════════",
  );
  console.log("// models.scala");
  console.log(
    "// ═══════════════════════════════════════════════════════════\n",
  );
  console.log(outputLines.join("\n"));

  console.log(
    "\n// ═══════════════════════════════════════════════════════════",
  );
  console.log("// commands.scala");
  console.log(
    "// ═══════════════════════════════════════════════════════════\n",
  );
  console.log(commandLines.join("\n"));

  // Also write to files
  const outDir = path.join("output", scalaPackageSuffix);
  fs.mkdirSync(path.join(outDir, "models"), { recursive: true });
  fs.mkdirSync(path.join(outDir, "commands"), { recursive: true });
  fs.writeFileSync(
    path.join(outDir, "models", "models.scala"),
    outputLines.join("\n"),
  );
  fs.writeFileSync(
    path.join(outDir, "commands", "commands.scala"),
    commandLines.join("\n"),
  );
  console.log(`\nOutput written to ${outDir}/`);
}

/** Extract type references from a TS type string */
function extractTypeRefs(tsType: string): string[] {
  const refs: string[] = [];
  // Remove undefined, array brackets, Record wrapper
  let cleaned = tsType
    .replace(/\|\s*undefined/g, "")
    .replace(/\[\]/g, "")
    .trim();

  // Record<string, X>
  const recordMatch = cleaned.match(/^Record<\s*string\s*,\s*(.+?)\s*>$/);
  if (recordMatch) {
    cleaned = recordMatch[1];
  }

  // If it looks like an identifier (not a primitive), it's a reference
  if (/^[A-Z]\w*$/.test(cleaned)) {
    // Skip primitives
    if (!["Date", "Uint8Array"].includes(cleaned)) {
      refs.push(cleaned);
    }
  }

  return refs;
}

// ─── CLI ─────────────────────────────────────────────────────────────────────

const args = process.argv.slice(2);

if (args.length < 1) {
  console.log(`Usage: node generate.js <sdk-client-src-dir> [command1,command2,...]

Examples:
  node generate.js ../path/to/aws-sdk-js-v3/clients/client-s3/src
  node generate.js ../path/to/clients/client-s3/src GetObjectCommand,PutObjectCommand
  node generate.js ../path/to/clients/client-dynamodb/src`);
  process.exit(1);
}

const sdkSrcDir = path.resolve(args[0]);
const commandFilter = args[1]?.split(",").filter(Boolean);

// Infer config from the directory name
const clientDirName = path.basename(path.dirname(sdkSrcDir)); // e.g. "client-s3"
const serviceName = clientDirName.replace("client-", ""); // e.g. "s3"
const npmPackage = `@aws-sdk/${clientDirName}`; // e.g. "@aws-sdk/client-s3"

// Infer client class name from the service
const serviceNamePascal = serviceName
  .split("-")
  .map((p) => p.charAt(0).toUpperCase() + p.slice(1))
  .join("");
const clientClassName = `${serviceNamePascal}Client`;

// Map service name to Scala package suffix
const packageMap: Record<string, string> = {
  s3: "s3",
  dynamodb: "dynamodb",
  ses: "ses",
  sns: "sns",
  kinesis: "kinesis",
};
const scalaPackageSuffix = packageMap[serviceName] || serviceName;

generate({
  sdkSrcDir,
  npmPackage,
  scalaPackageSuffix,
  clientClassName,
  commands: commandFilter,
});
