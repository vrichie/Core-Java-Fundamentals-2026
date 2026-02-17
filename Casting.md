# Type Casting in Java

## Overview

Type casting is the process of converting one data type to another. Java supports two types of casting:
1. **Implicit Casting (Automatic/Widening)** - No data loss
2. **Explicit Casting (Manual/Narrowing)** - Potential data loss

---

## Widening Conversion (Implicit/Automatic)

Automatic conversion from a **smaller** data type to a **larger** data type.

### Conversion Order
```
byte → short → int → long → float → double
```

### Key Points
- **No explicit cast operator needed**
- **No data loss occurs**
- Smaller range type converts to larger range type
- Happens automatically

### Examples

```java
byte byteValue = 45;
short shortValue = byteValue;      // byte → short (automatic)
int intValue = byteValue;          // byte → int (automatic)
long longValue = byteValue;        // byte → long (automatic)
float floatValue = byteValue;      // byte → float (automatic)
double doubleValue = byteValue;    // byte → double (automatic)

// Output
// Byte: 45
// Short: 45
// Int: 45
// Long: 45
```

---

## Narrowing Conversion (Explicit/Manual)

Manual conversion from a **larger** data type to a **smaller** data type.

### Conversion Order (Reverse)
```
double → float → long → int → short → byte
```

### Key Points
- **Requires explicit cast operator: `(targetType)`**
- **May lose precision or data**
- Smaller range type cannot hold all values from larger type
- Developer is responsible for potential data loss

### Examples

```java
double doubleValue = 743.4;
int narrowedInt = (int) doubleValue;      // double → int: 743 (decimal lost)
byte narrowedByte = (byte) doubleValue;   // double → byte: -23 (overflow)

// Output
// Original Double: 743.4
// Cast to Int: 743
// Cast to Byte: -23 (data loss due to overflow)
```

---

## Comparison Table

| Casting Type | Direction | Data Loss | Syntax | Automatic |
|---|---|---|---|---|
| **Widening** | Small → Large | No | `int x = byteValue;` | ✅ Yes |
| **Narrowing** | Large → Small | Possible | `int x = (int) doubleValue;` | ❌ No |

---

## Practical Examples

### Example 1: Money Conversion
```java
// Store price as double (high precision)
double priceInDouble = 19.99;

// Convert to int for display (loses decimal places)
int priceInInt = (int) priceInDouble;  // Result: 19
```

### Example 2: User Input Processing
```java
// Read age as long from user
long ageFromInput = 1234567890L;

// Convert to int for processing
int userAge = (int) ageFromInput;
```

### Example 3: Floating-Point to Integer
```java
// Calculate score as double
double scorePercentage = 95.75;

// Convert to int for reporting
int wholeScore = (int) scorePercentage;  // Result: 95
```

---

## Common Pitfalls

### ❌ Overflow
```java
double largeNumber = 500.5;
byte smallByte = (byte) largeNumber;  // Unexpected result due to overflow
```

### ❌ Precision Loss
```java
double pi = 3.14159265359;
int roundedPi = (int) pi;  // Result: 3 (decimal places lost)
```

### ✅ Safe Casting Pattern
```java
double value = 743.4;
if (value <= Integer.MAX_VALUE && value >= Integer.MIN_VALUE) {
    int safeInt = (int) value;
}
```

---

## Best Practices

1. **Use automatic widening** whenever possible
2. **Be explicit about narrowing** conversions to show intent
3. **Check range limits** before narrowing to prevent overflow
4. **Use appropriate data types** from the start to minimize casting
5. **Document why casting is needed** in your code comments

---

## Output from Casting.java

```
=== Implicit Casting (Widening) ===
Byte: 45
Short: 45
Int: 45
Long: 45

=== Explicit Casting (Narrowing) ===
Original Double: 743.4
Cast to Int: 743
Cast to Byte: -23
```

---

## Practice Exercises

1. Create a long value and cast it down to an int
2. Compare the original and casted values
3. Cast a float to an int and observe the decimal loss
4. Create a double value > Integer.MAX_VALUE and cast it to int (observe overflow)
5. Write code to safely cast a double to byte with range checking
