# Core Java Fundamentals - 2026

A comprehensive learning resource for Java fundamentals, covering essential concepts from basic data types to operators and string manipulation.

---

## 📚 Table of Contents

1. [Variables](#variables) - Data types and variable declaration
2. [Casting](#casting) - Type conversion and casting
3. [Operators](#operators) - Arithmetic, logical, and comparison operators
4. [Strings](#strings) - String creation and manipulation
5. [Getting Started](#getting-started)
6. [Quick Reference](#quick-reference)

---

## Variables

**File:** [Variables.java](Variables.java) | **Documentation:** [Variables.md](Variables.md)

Learn about all Java primitive data types and how to declare and initialize variables.

### Topics Covered
- **Primitive Data Types:** byte, short, int, long, float, double, boolean, char
- **Reference Types:** String
- **Variable Declaration Syntax**
- **Type Ranges and Precision**
- **Final Variables (Constants)**

### Key Concepts
```java
int age = 49;                    // Integer type
double salary = 45000.50;        // Floating-point type
boolean isActive = true;         // Boolean type
String name = "James";           // String type (reference)
final float PI = 3.14f;          // Constant value
```

### Learning Points
- Use appropriate data types for your data
- Remember to add sufficient for long values: `483767839484L`
- Use `f` suffix for float values: `45.67f`
- Apply naming conventions: `camelCase` for variables

---

## Casting

**File:** [Casting.java](Casting.java) | **Documentation:** [Casting.md](Casting.md)

Understand how to convert between different data types safely.

### Topics Covered
- **Implicit Casting (Widening):** Automatic conversion from smaller to larger types
- **Explicit Casting (Narrowing):** Manual conversion from larger to smaller types
- **Conversion Order:** byte → short → int → long → float → double
- **Data Loss and Overflow**

### Key Concepts
```java
// Widening (automatic, no data loss)
byte b = 45;
int i = b;  // Automatic conversion

// Narrowing (manual, potential data loss)
double d = 743.4;
int i = (int) d;  // Explicit cast, loses decimal places → 743
```

### Learning Points
- Use implicit casting when expanding data types
- Be explicit about narrowing conversions
- Watch for overflow and precision loss
- Check range limits before narrowing to smaller types

---

## Operators

**File:** [Operators.java](Operators.java) | **Documentation:** [Operators.md](Operators.md)

Master the various operators available in Java for calculations and logical operations.

### Topics Covered

#### Arithmetic Operators
```java
+    // Addition
-    // Subtraction
*    // Multiplication
/    // Division
%    // Modulus (remainder)
++   // Increment
--   // Decrement
```

#### Assignment Operators
```java
=    // Assign value
+=   // Add and assign
-=   // Subtract and assign
*=   // Multiply and assign
/=   // Divide and assign
%=   // Modulo and assign
```

#### Comparison Operators (return boolean)
```java
==   // Equal to
!=   // Not equal to
>    // Greater than
<    // Less than
>=   // Greater than or equal
<=   // Less than or equal
```

#### Logical Operators
```java
&&   // AND (both conditions must be true)
||   // OR (at least one condition must be true)
!    // NOT (negates a condition)
```

### Key Concepts
```java
int x = 10;
x += 5;  // x becomes 15

int a = 3, b = 8;
System.out.println(a < b);  // true

boolean isActive = true;
boolean isValid = false;
System.out.println(isActive && isValid);  // false
System.out.println(isActive || isValid);  // true
```

### Learning Points
- Remember PEMDAS/BODMAS for operator precedence
- Use parentheses for clarity even when not required
- Use `==` for comparison, not `=` for assignment
- Use `&&` and `||` for logical operations, not `&` and `|` (bitwise)

---

## Strings

**File:** [Strings.java](Strings.java) | **Documentation:** [Strings.md](Strings.md)

Learn how to work with strings and use common string methods.

### Topics Covered
- **String Creation and Declaration**
- **String Methods:** length(), charAt(), toUpperCase(), toLowerCase(), equals(), trim()
- **String Comparison:** Using `.equals()` not `==`
- **String Concatenation:** Combining strings with `+` operator
- **Immutability:** Strings cannot be modified after creation

### Key Concepts
```java
String name = " doe ";
String name2 = "doe";

name.length();                      // 5
name.charAt(0);                     // ' ' (space)
name.toUpperCase();                 // " DOE "
name.toLowerCase();                 // " doe "
name.equals(name2);                 // false (spaces differ)
name.trim().equals(name2);          // true (spaces removed)
```

### Important Methods
| Method | Purpose | Example |
|--------|---------|---------|
| `length()` | Get string length | `"hello".length()` → `5` |
| `charAt(i)` | Get character at index | `"hello".charAt(0)` → `'h'` |
| `toUpperCase()` | Convert to uppercase | `"hello".toUpperCase()` → `"HELLO"` |
| `toLowerCase()` | Convert to lowercase | `"HELLO".toLowerCase()` → `"hello"` |
| `trim()` | Remove leading/trailing spaces | `" hello ".trim()` → `"hello"` |
| `equals(other)` | Compare strings | `"hello".equals("hello")` → `true` |
| `indexOf(char)` | Find first position | `"hello".indexOf('l')` → `2` |
| `substring(i, j)` | Get substring | `"hello".substring(1, 4)` → `"ell"` |
| `contains(str)` | Check if contains | `"hello".contains("ell")` → `true` |
| `replace(old, new)` | Replace characters | `"hello".replace('l', 'L')` → `"heLLo"` |

### Learning Points
- Strings are **immutable** - operations create new strings
- Use `.equals()` for comparison, **NOT** `==`
- `charAt()` uses 0-based indexing
- `trim()` only removes leading and trailing spaces, not middle ones
- Indices start at 0: `[0][1][2]...`

---

## Getting Started

### Prerequisites
- JDK 21 or higher installed
- Basic knowledge of Java syntax

### Running the Programs

1. **Compile all files:**
   ```bash
   javac *.java
   ```

2. **Run individual programs:**
   ```bash
   java Variables
   java Casting
   java Operators
   java Strings
   ```

3. **Or compile and run together:**
   ```bash
   javac Variables.java && java Variables
   javac Casting.java && java Casting
   javac Operators.java && java Operators
   javac Strings.java && java Strings
   ```

---

## Quick Reference

### Data Type Ranges
| Type | Size | Range |
|------|------|-------|
| byte | 1 byte | -128 to 127 |
| short | 2 bytes | -32,768 to 32,767 |
| int | 4 bytes | -2.1B to 2.1B |
| long | 8 bytes | -9.2E18 to 9.2E18 |
| float | 4 bytes | ~6-7 decimals |
| double | 8 bytes | ~15-17 decimals |

### Operator Precedence (High to Low)
1. `()` - Parentheses
2. `++`, `--` - Increment/Decrement
3. `!` - Logical NOT
4. `*`, `/`, `%` - Multiplication, Division, Modulus
5. `+`, `-` - Addition, Subtraction
6. `<`, `<=`, `>`, `>=` - Comparison
7. `==`, `!=` - Equality
8. `&&` - Logical AND
9. `||` - Logical OR
10. `=`, `+=`, `-=`, etc. - Assignment

### Common Mistakes to Avoid
| ❌ Wrong | ✅ Correct |
|---------|-----------|
| `float price = 45.67;` | `float price = 45.67f;` |
| `long num = 123456;` | `long num = 123456L;` |
| `char grade = "A";` | `char grade = 'A';` |
| `if (a = 5)` | `if (a == 5)` |
| `name == "James"` | `name.equals("James")` |
| `" hello ".length()` → `7` | Check with `trim()`: `.trim().length()` → `5` |

---

## Learning Path

### Beginner Level
1. Start with **Variables** - understand data types
2. Move to **Strings** - learn text manipulation
3. Learn **Operators** - practice calculations and logic

### Intermediate Level
1. Study **Casting** - type conversions
2. Combine multiple operators
3. Create programs using all concepts

### Advanced Practice
1. Modify the examples with your own data
2. Combine multiple concepts in single programs
3. Handle edge cases and errors

---

## Resources

### Official Documentation
- [Java Documentation](https://docs.oracle.com/en/java/)
- [Java String API](https://docs.oracle.com/javase/21/docs/api/java.base/java/lang/String.html)

### Related Files
- [ConversionAndCasting.md](ConversionAndCasting.md) - Detailed casting information
- [DataType.md](DataType.md) - Data type specifications

---

## Tips for Success

1. **Practice:** Run the programs and modify the values to see different outputs
2. **Experiment:** Change operators and see how results change
3. **Document:** Add comments to understand what each line does
4. **Debug:** Use print statements to understand code flow
5. **Ask Questions:** Understanding WHY is more important than memorizing

---

## Project Structure

```
Core-Java-Fundamentals-2026/
├── README.md                      # This file
├── Variables.java                 # Variable declaration program
├── Variables.md                   # Variables documentation
├── Casting.java                   # Type casting program
├── Casting.md                     # Casting documentation
├── Operators.java                 # Operators program
├── Operators.md                   # Operators documentation
├── Strings.java                   # String manipulation program
├── Strings.md                     # Strings documentation
├── Test.java                      # Test file (empty)
├── ConversionAndCasting.md        # Additional casting reference
└── DataType.md                    # Data type specifications
```

---

## Version History

- **2026-02-17:** Initial project structure with 4 core concepts
  - Added comprehensive documentation for each topic
  - Improved code structure with better comments
  - Created detailed markdown guides with examples

---

## Author Notes

This project is designed to provide a solid foundation in Java basics. Each file can be studied independently, but they build upon each other:

- **Variables** → foundation for understanding data storage
- **Casting** → essential for type conversions
- **Operators** → needed for problem-solving
- **Strings** → practical for text processing

Complete all exercises and understand each concept thoroughly before moving on to more advanced topics.

---

**Happy Learning! 🚀**
