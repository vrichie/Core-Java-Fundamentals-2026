# Java Data Types

## Overview
Java has two main categories of data types:
1. **Primitive Types** - Basic building blocks for variables
2. **Reference Types** - Objects and arrays

---

## What Are Literals?

A **literal** is a fixed value written directly in your code. It's the actual value you assign to a variable, not a variable name or expression.

```java
int age = 25;           // 25 is a literal
String name = "Alice";  // "Alice" is a literal
boolean active = true;  // true is a literal
```

---

## Primitive Data Types

### Integer Types

| Type | Size | Min Value | Max Value | Use Case |
|------|------|-----------|-----------|----------|
| `byte` | 1 byte | -128 | 127 | Small numbers, memory constrained |
| `short` | 2 bytes | -32,768 | 32,767 | Small ranges |
| `int` | 4 bytes | -2,147,483,648 | 2,147,483,647 | **Default choice** |
| `long` | 8 bytes | -9,223,372,036,854,775,808 | 9,223,372,036,854,775,807 | Very large numbers |

#### Examples:
```java
byte age = 25;                    // Small positive number
short temperature = -15;          // Small range temperature
int population = 1000000;         // Standard integer
long fileSize = 9876543210L;      // Note the 'L' suffix for long
```

#### Integer Literal Formats:
```java
// Decimal (base 10) - most common
int decimal = 255;

// Binary (base 2) - prefix with 0b
int binary = 0b1111_1111;         // 255 in binary
int binNum = 0b1001;              // 9 in binary

// Hexadecimal (base 16) - prefix with 0x
int hexadecimal = 0xFF;           // 255 in hex
int hexNum = 0x7E;                // 126 in hex

// Octal (base 8) - prefix with 0 (rarely used)
int octal = 0377;                 // 255 in octal

// Readable format - use underscores (Java 7+)
int formattedNum = 10_749_739;    // Underscores ignored by compiler
long population = 1_000_000_000L; // Easy to read: 1 billion
```

#### When to Use Different Literals:
- **Decimal** - Default, for everyday numbers
- **Binary** - When working with bit operations or flags
- **Hexadecimal** - Color codes, memory addresses, bitwise operations
- **Octal** - Rare; file permissions in Unix/Linux
- **Underscores** - Always use for numbers > 999,999 for readability

#### Best Practices:
- Use `int` as your default choice for integers
- Use `long` when working with numbers larger than 2 billion
- Use `byte` or `short` only when memory is critical (rarely needed)
- Always suffix `long` literals with `L` (e.g., `100L`)

---

### Floating Point Types

| Type | Size | Min Value | Max Value | Precision | Use Case |
|------|------|-----------|-----------|-----------|----------|
| `float` | 4 bytes | ≈ ±1.4 × 10⁻⁴⁵ | ≈ ±3.4 × 10³⁸ | ~6-7 decimal digits | Graphics, less critical calculations |
| `double` | 8 bytes | ≈ ±4.9 × 10⁻³²⁴ | ≈ ±1.7 × 10³⁰⁸ | ~15-17 decimal digits | **Default choice**, financial calculations |

#### Examples:
```java
float height = 5.9f;              // Note the 'f' suffix (required for float)
double pi = 3.14159265359;        // Default for decimal numbers
double salary = 50000.50;          // No suffix needed - defaults to double
float temperature = -32.5f;        // Always use 'f' for float literals
```

#### Floating Point Literal Formats:
```java
// Standard decimal notation
double price = 19.99;
float distance = 3.14f;

// Scientific notation (useful for very large/small numbers)
double num1 = 12e10;              // 12 × 10^10 = 120,000,000,000
double num2 = 1.5e-3;             // 1.5 × 10^-3 = 0.0015
float small = 2.5e-4f;            // 2.5 × 10^-4 = 0.00025

// With underscore separators (Java 7+)
double largeAmount = 1_000_000.50;
float pi = 3.141_592_65f;
```

#### When to Use Different Literals:
- **Standard decimal** - Regular calculations and values
- **Scientific notation** - Very large numbers (distances, populations) or very small (measurements)
- **Underscores** - For readability when the number has many digits

#### Best Practices:
- Use `double` as your default for decimal numbers (Java defaults to this)
- **Always suffix float literals with 'f'** (e.g., `5.3f`) - this is critical!
- Use `float` only when memory is constrained
- Avoid `float` for financial calculations; use `BigDecimal` instead
- Be aware of floating-point precision issues for critical calculations

---

### Character Type

| Type | Size | Range | Use Case |
|------|------|-------|----------|
| `char` | 2 bytes | 0 to 65,535 (Unicode) | Single characters, symbols |

#### Examples:
```java
char initial = 'A';               // Single letter
char symbol = '@';                // Special character
char unicode = '\u0041';          // Unicode representation of 'A'
char digit = '5';                 // Character '5' (not the number 5)
```

#### Best Practices:
- Use single quotes for char literals (e.g., `'A'` not `"A"`)
- Remember: `'5'` (char) and `5` (int) are different
- Useful for storing single characters, not strings

---

### Boolean Type

| Type | Values | Size | Use Case |
|------|--------|------|----------|
| `boolean` | `true` or `false` | 1 byte | Conditional logic, flags |

#### Examples:
```java
boolean isActive = true;          // Flag variable
boolean isPrime = false;          // Boolean result
boolean isValid = age >= 18;      // Comparison result
if (isActive) { /* ... */ }       // Used in conditions
```

#### Best Practices:
- ⚠️ **Important:** Java does NOT accept 0 or 1 for boolean; use `true`/`false` only
- Use descriptive variable names (e.g., `isActive`, `hasPermission`, `canEdit`)
- Keep boolean logic simple and readable

---

## Literal Suffixes and Prefixes Reference

### Suffixes (Required for specific types)
| Suffix | Used For | Example | Notes |
|--------|----------|---------|-------|
| `L` or `l` | Long integers | `9876543210L` | Required for numbers > 2.1 billion; capital L preferred |
| `f` or `F` | Float numbers | `5.9f` | Required; omitting causes compiler error |
| (no suffix) | Int (default) | `42` | Default for whole numbers |
| (no suffix) | Double (default) | `3.14` | Default for decimal numbers |

### Prefixes (For different number bases)
| Prefix | Base | Example | Decimal Equivalent |
|--------|------|---------|-------------------|
| (none) | 10 (Decimal) | `255` | 255 |
| `0b` | 2 (Binary) | `0b1111_1111` | 255 |
| `0x` | 16 (Hexadecimal) | `0xFF` | 255 |
| `0` | 8 (Octal) | `0377` | 255 |
| `e` or `E` | Scientific notation | `1.5e2` | 150.0 |

### Readability Enhancement
```java
// Underscore separators (Java 7+)
int million = 1_000_000;          // Improves digit grouping
long billionL = 1_000_000_000L;   // Works with suffixes
double pi = 3.141_592_653_589;    // Works with decimals
int hex = 0xFF_FF_FF_FF;          // Works with prefixes
```

---

## Summary Table: All Primitive Types

| Type | Category | Size | Example |
|------|----------|------|---------|
| `byte` | Integer | 1 byte | `byte b = 100;` |
| `short` | Integer | 2 bytes | `short s = 1000;` |
| `int` | Integer | 4 bytes | `int i = 100000;` |
| `long` | Integer | 8 bytes | `long l = 100000L;` |
| `float` | Floating Point | 4 bytes | `float f = 3.14f;` |
| `double` | Floating Point | 8 bytes | `double d = 3.14159;` |
| `char` | Character | 2 bytes | `char c = 'A';` |
| `boolean` | Boolean | 1 byte | `boolean b = true;` |

---

## Key Takeaways

✅ **Default Choices:**
- Integers → use `int`
- Decimals → use `double`
- Single characters → use `char`
- True/False → use `boolean`

✅ **Literal Best Practices:**
- Always use `L` suffix for long literals (e.g., `100L`)
- Always use `f` suffix for float literals (e.g., `5.3f`)
- Use underscores for readability in large numbers (e.g., `1_000_000`)
- Binary (`0b`) for bit operations
- Hexadecimal (`0x`) for colors and bit patterns
- Scientific notation for very large/small numbers

⚠️ **Common Mistakes:**
1. Forgetting `L` suffix on large integer literals
2. Forgetting `f` suffix on float literals
3. Using 0/1 instead of false/true for booleans
4. Using `"A"` (string) instead of `'A'` (char)
5. Using `float` for financial calculations
6. Confusing literal formats: `0x7E` is not `7E`
7. Mixing up suffixes: `3.14L` is invalid (use `3.14d` for double or no suffix)