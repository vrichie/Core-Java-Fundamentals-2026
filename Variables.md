# Variables in Java

## Overview

Variables are containers that hold data values. Every variable in Java must be declared with a specific data type before use.

**Syntax:**
```java
type variableName = value;
```

---

## Primitive Data Types

### Numeric Types

#### Integer Types
| Type | Size | Range | Example |
|------|------|-------|---------|
| **byte** | 1 byte | -128 to 127 | `byte by = 127;` |
| **short** | 2 bytes | -32,768 to 32,767 | `short sh = 2000;` |
| **int** | 4 bytes | -2,147,483,648 to 2,147,483,647 | `int age = 49;` |
| **long** | 8 bytes | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 | `long fileSize = 483767839484L;` |

**Note:** Use `L` suffix for long values (e.g., `483767839484L`)

#### Floating-Point Types
| Type | Size | Precision | Example |
|------|------|-----------|---------|
| **float** | 4 bytes | ~6-7 decimal places | `float price = 45.67f;` |
| **double** | 8 bytes | ~15-17 decimal places | `double avg = 34532.6363;` |

**Note:** Use `f` suffix for float values (e.g., `45.67f`)

### Boolean Type
- Holds `true` or `false` values
- Example: `boolean isStudent = true;`

### Character Type
- Holds a single character enclosed in single quotes
- Example: `char grade = 'B';`

### String Type
- Holds text values enclosed in double quotes
- This is a reference type (not a primitive type)
- Example: `String name = "James";`

---

## Examples from the Code

```java
// Numeric demonstrations
byte byteValue = 127;           // Maximum byte value
short shortValue = 2000;        // Short integer
int age = 49;                   // Standard integer
long fileSize = 483767839484L;  // Large number (with L suffix)

// Floating-point demonstrations
float price = 45.67f;           // Decimal with f suffix
double average = 34532.6363;    // More precise decimal
final float pi = 3.14f;         // Constant value

// Boolean and Character
boolean isStudent = true;       // Boolean value
char grade = 'B';               // Single character

// String (reference type)
String name = "James";          // Text value
```

---

## Key Concepts

### Variable Naming Conventions
- Use **camelCase** for variable names (e.g., `fileSize`, `isStudent`)
- Start with a letter, underscore, or dollar sign
- Contain only letters, digits, underscores, or dollar signs
- Are case-sensitive (`age` ≠ `Age`)

### Final Variables (Constants)
- Use the `final` keyword to create constants
- Cannot be changed after initialization
- Example: `final float pi = 3.14f;`

### Type Safety
- Java is strongly typed; every variable must have a declared type
- This provides compile-time error checking and prevents many bugs

---

## Output

Running the Variables.java program produces:
```
Student: James
Grade: B | Age: 49 | Active: true
Average Score: 34532.6363
File Size: 483767839484 bytes
```

---

## Common Mistakes

1. ❌ Missing type declaration: `name = "James";` 
   - ✅ Correct: `String name = "James";`

2. ❌ Wrong suffix for numeric types: `float price = 45.67;`
   - ✅ Correct: `float price = 45.67f;`

3. ❌ Single vs. double quotes: `char grade = "B";`
   - ✅ Correct: `char grade = 'B';`

---

## Practice Exercises

1. Declare a new byte variable with the value 100
2. Create a double variable and use it to store a temperature in Celsius
3. Create a final String variable with your name
4. Declare variables for: age (int), height (double), and isActive (boolean)
