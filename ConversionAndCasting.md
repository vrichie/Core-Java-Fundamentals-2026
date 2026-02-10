# Type Conversion, Casting, and Promotion in Java

## Overview

Java allows you to convert values from one data type to another. There are three main mechanisms:
1. **Automatic Conversion (Widening)** - Safe, implicit conversion
2. **Explicit Casting (Narrowing)** - Manual conversion, may lose data
3. **Type Promotion** - Automatic promotion in expressions

---

## 1. Automatic Type Conversion (Widening Conversion)

### What Is It?
Automatic conversion happens when you assign a smaller data type to a larger data type. Java handles this automatically without requiring explicit casting.

### Type Hierarchy (Smaller → Larger)
```
byte → short → int → long → float → double
       ↘                    ↗
         char → int
```

### Why It's Safe
- No data loss occurs
- The smaller type fits completely into the larger type
- Memory space increases, so no overflow

### Examples

```java
// Converting byte to int (automatic)
byte b = 127;
int a = b;              // Automatically converted, no casting needed
System.out.println(a);  // Output: 127

// Converting int to long (automatic)
int num = 1000000;
long bigNum = num;      // No casting required
System.out.println(bigNum);  // Output: 1000000

// Converting float to double (automatic)
float f = 3.14f;
double d = f;           // Automatic conversion
System.out.println(d);  // Output: 3.14

// Chaining conversions (byte → short → int → long)
byte small = 50;
long large = small;     // Works through the hierarchy
System.out.println(large);  // Output: 50
```

### Best Practices
- ✅ Automatic conversion is always safe
- ✅ Use for widening conversions (smaller → larger)
- ✅ No data loss in automatic conversions

---

## 2. Explicit Type Casting (Narrowing Conversion)

### What Is It?
Explicit casting is when you manually convert a larger data type to a smaller one. This requires the `(type)` syntax and **may result in data loss**.

### Syntax
```java
targetType variableName = (targetType) sourceVariable;
```

### Why It's Risky
- Data loss can occur (bits are truncated)
- Overflow/underflow can happen
- Requires programmer responsibility

### Examples

```java
// Casting int to byte (narrowing)
int c = 12;
byte k = (byte) c;      // Explicit cast required
System.out.println(k);  // Output: 12

// Casting float to int (loses decimal part)
float f = 5.6f;
int t = (int) f;        // Explicit cast required
System.out.println(t);  // Output: 5 (decimal part lost!)

// Casting with data loss
int largeNum = 300;
byte smallByte = (byte) largeNum;  // byte range: -128 to 127
System.out.println(smallByte);     // Output: 44 (overflow!)
// Explanation: 300 in binary exceeds byte range, wraps around

// Casting double to float
double preciseNum = 3.14159265359;
float lessPercise = (float) preciseNum;
System.out.println(lessPercise);   // Output: 3.1415927 (precision lost)
```

### Data Loss Examples

```java
// Float to int - loses decimal places
float price = 19.99f;
int wholeDollars = (int) price;
System.out.println(wholeDollars);  // Output: 19 (not 20!)

// Long to int - overflow
long bigNumber = 3000000000L;      // Larger than int max (2.1 billion)
int smaller = (int) bigNumber;     // Unpredictable result!
System.out.println(smaller);       // Output: -1294967296 (overflow!)

// Double to float - precision loss
double pi = 3.141592653589793;
float piFloat = (float) pi;
System.out.println(piFloat);       // Output: 3.1415927 (less precise)
```

### Best Practices
- ⚠️ Use only when necessary
- ⚠️ Be aware of data loss potential
- ✅ Document why casting is needed
- ✅ Validate bounds before casting if possible
- ⚠️ Never cast down without understanding the consequences

### When to Use Explicit Casting
1. Converting float/double to int (when you want to discard decimals)
2. Narrowing int to byte/short (for memory efficiency)
3. Converting between numeric types with known safe ranges

---

## 3. Type Promotion in Expressions

### What Is It?
When Java evaluates expressions with mixed data types, it automatically promotes smaller types to larger types to perform the operation safely.

### Promotion Rules

1. **In Arithmetic Operations**: All byte, short, and char are promoted to `int`
2. **Mixed Operations**: If one operand is long, the result is long
3. **Mixed Operations**: If one operand is double, the result is double
4. **Otherwise**: Result type matches the larger operand

### Examples

```java
// Byte promoted to int in multiplication
byte d = 10;
byte e = 30;
int result = d * e;     // d and e promoted to int before multiplication
System.out.println(result);  // Output: 300

// Why? Try assigning directly to byte:
// byte result = d * e;  // ❌ COMPILATION ERROR!
// The result of byte * byte is int, not byte

// Integer promoted to long
int num = 1000000;
long bigNum = (long) num;  // Conversion to long
long product = num * 10L;  // num promoted to long for operation

// Double promoted in mixed operation
int intVal = 10;
double doubleVal = 5.5;
double result = intVal + doubleVal;  // intVal promoted to double
System.out.println(result);  // Output: 15.5

// Float promoted to double
float f = 3.14f;
double d = 2.71;
double sum = f + d;  // f promoted to double
System.out.println(sum);  // Output: 5.85
```

### Complete Expression Evaluation Example

```java
byte a = 5;
float b = 10.5f;
long c = 100L;

// Expression: a + b + c
// Step 1: a (byte) promoted to float to match b
// Step 2: result (float) promoted to double (part of float-long interaction)
// Step 3: Final result is double
double result = a + b + c;
System.out.println(result);  // Output: 115.5
```

### Best Practices
- ✅ Understand automatic promotion in expressions
- ✅ Assign expression results to appropriately sized types
- ✅ Don't expect `byte * byte` to return `byte`
- ✅ Be aware of overflow in large calculations

---

## Quick Comparison Table

| Concept | Direction | Type | Required? | Data Loss | Safety |
|---------|-----------|------|-----------|-----------|--------|
| **Automatic Conversion** | Small → Large | Widening | No | None | ✅ Safe |
| **Explicit Casting** | Large → Small | Narrowing | Yes | Possible | ⚠️ Risky |
| **Type Promotion** | Expression mix | Both | Automatic | Possible | ⚠️ Check types |

---

## Real-World Examples from Code

### Example 1: Safe Automatic Conversion
```java
byte b = 127;
int a = b;           // ✅ Safe - byte fits in int
System.out.println(a);  // Output: 127
```
**Why it works:** byte range (-128 to 127) fits completely in int range.

### Example 2: Necessary Explicit Casting
```java
int c = 12;
byte k = (byte) c;   // ⚠️ Need explicit cast
System.out.println(k);  // Output: 12
```
**Why casting is needed:** Assigning int to byte without casting causes compilation error.

### Example 3: Decimal Loss in Casting
```java
float f = 5.6f;
int t = (int) f;     // ⚠️ Decimal part discarded
System.out.println(t);  // Output: 5 (not 6!)
```
**Why data is lost:** int doesn't store decimal values; they're truncated.

### Example 4: Type Promotion in Arithmetic
```java
byte d = 10;
byte e = 30;
int result = d * e;  // d and e promoted to int
System.out.println(result);  // Output: 300
```
**Why promotion happens:** Java promotes operands to int for safety in expressions.

---

## Common Mistakes & Solutions

### ❌ Mistake 1: Missing Explicit Cast
```java
int age = 25;
byte b = age;  // ❌ Compilation error!
```
**Solution:**
```java
byte b = (byte) age;  // ✅ Explicit cast
```

### ❌ Mistake 2: Expecting Automatic Narrowing
```java
double price = 19.99;
int dollars = price;  // ❌ Compilation error!
```
**Solution:**
```java
int dollars = (int) price;  // ✅ Explicit cast
```

### ❌ Mistake 3: Overflow Without Checking
```java
long huge = 99999999999L;
int smaller = (int) huge;  // ⚠️ Unpredictable overflow!
```
**Solution:**
```java
// Check bounds first
if (huge <= Integer.MAX_VALUE && huge >= Integer.MIN_VALUE) {
    int smaller = (int) huge;
} else {
    System.out.println("Value too large for int!");
}
```

### ❌ Mistake 4: Unexpected Type Promotion
```java
byte a = 50;
byte b = 30;
byte result = a + b;  // ❌ Compilation error!
```
**Solution:**
```java
int result = a + b;   // ✅ Correct - result is int
```

---

## Type Conversion Rules Summary

### Widening (Automatic - Safe)
```
byte → short → int → long
                    ↓
                  float → double
char → int ————————↗
```

### Narrowing (Explicit - Check for Loss)
```
double → float → long → int → short
                                ↓
                              byte
int → char (becomes unsigned)
```

### Key Takeaways
1. **Automatic conversion** = smaller → larger (safe, no casting needed)
2. **Explicit casting** = larger → smaller (risky, requires `(type)` syntax)
3. **Type promotion** = automatic in expressions (understand the result type)
4. **Check bounds** before narrowing conversions to prevent overflow
5. **Be aware** of decimal loss when casting float/double to int

---

## Practice Questions

1. Will this compile? `float f = 5.5; double d = f;`
   - **Answer:** ✅ Yes (automatic widening)

2. Will this compile? `int i = 10; byte b = i;`
   - **Answer:** ❌ No (need explicit cast: `byte b = (byte) i;`)

3. What is the output? `int result = 5 + 3.5f;`
   - **Answer:** The result could assign to double: ~8.5 (float promoted to double in mixed expression)

4. What is the output of `int x = (int) 5.7;`?
   - **Answer:** 5 (decimal part truncated, not rounded)

5. Why doesn't `byte b = 50 + 50;` work?
   - **Answer:** Byte literals promoted to int in expression; result is int, not byte
   - **Solution:** `byte b = (byte) (50 + 50);` or `byte b = 100;` (if it fits)
