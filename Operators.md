# Operators in Java

## Overview

Operators are symbols that perform operations on variables and values. Java has several categories of operators, each with specific purposes and behaviors.

---

## 1. Arithmetic Operators

Perform mathematical calculations on numeric values.

| Operator | Name | Example | Result |
|----------|------|---------|--------|
| `+` | Addition | `3 + 8` | `11` |
| `-` | Subtraction | `8 - 3` | `5` |
| `*` | Multiplication | `3 * 8` | `24` |
| `/` | Division | `8 / 3` | `2` (integer division) |
| `%` | Modulus (Remainder) | `8 % 3` | `2` |
| `++` | Increment | `a++` or `++a` | Increases by 1 |
| `--` | Decrement | `a--` or `--a` | Decreases by 1 |

### Examples
```java
int a = 3, b = 8;
System.out.println(a + b);      // 11
System.out.println(a * b);      // 24
System.out.println(b / a);      // 2 (integer division)
System.out.println(b % a);      // 2 (remainder)
```

---

## 2. Order of Operations (PEMDAS)

Operations follow standard mathematical precedence:

1. **Parentheses** `()`
2. **Exponents** (not in Java, but highest precedence)
3. **Multiplication, Division, Modulus** `*, /, %` (left to right)
4. **Addition, Subtraction** `+, -` (left to right)

### Examples
```java
System.out.println(2 + 3 * 2);      // 8 (multiplication first: 2 + 6)
System.out.println((2 + 3) * 2);    // 10 (parentheses first: 5 * 2)
System.out.println(10 - 3 - 2);     // 5 (left to right: 7 - 2)
```

---

## 3. Assignment Operators

Assign values to variables. Can be combined with arithmetic operators.

| Operator | Equivalent | Example | Meaning |
|----------|------------|---------|---------|
| `=` | N/A | `x = 10;` | Assign 10 to x |
| `+=` | `x = x + ` | `x += 5;` | `x = x + 5;` |
| `-=` | `x = x - ` | `x -= 3;` | `x = x - 3;` |
| `*=` | `x = x * ` | `x *= 2;` | `x = x * 2;` |
| `/=` | `x = x / ` | `x /= 2;` | `x = x / 2;` |
| `%=` | `x = x % ` | `x %= 3;` | `x = x % 3;` |

### Examples
```java
int x = 10;
x += 5;     // x is now 15
x -= 3;     // x is now 12
x *= 2;     // x is now 24
```

---

## 4. Comparison Operators

Compare two values and return a boolean result (`true` or `false`).

| Operator | Name | Example | Result |
|----------|------|---------|--------|
| `==` | Equal to | `3 == 3` | `true` |
| `!=` | Not equal to | `3 != 8` | `true` |
| `>` | Greater than | `8 > 3` | `true` |
| `<` | Less than | `3 < 8` | `true` |
| `>=` | Greater than or equal | `8 >= 8` | `true` |
| `<=` | Less than or equal | `3 <= 8` | `true` |

### Examples
```java
int a = 3, b = 8;
System.out.println(a == b);    // false
System.out.println(a != b);    // true
System.out.println(a < b);     // true
System.out.println(a >= b);    // false
```

---

## 5. Logical Operators

Combine boolean values and return a boolean result.

### AND Operator (`&&`)
- Returns `true` only if **both** conditions are true
- If the first condition is false, the second is not evaluated (short-circuit)

```java
boolean isActive = true;
boolean isInSession = false;

System.out.println(isActive && isInSession);    // false
// Explanation: true AND false = false
```

### OR Operator (`||`)
- Returns `true` if **at least one** condition is true
- If the first condition is true, the second is not evaluated (short-circuit)

```java
int age = 17;
boolean isNotHome = true;

System.out.println(age > 18 || !isNotHome);    // false
// Explanation: false OR false = false
```

### NOT Operator (`!`)
- Reverses/Negates a boolean value
- `true` becomes `false`, `false` becomes `true`

```java
boolean isNotHome = true;
System.out.println(!isNotHome);    // false
System.out.println(!!isNotHome);   // true (double negative)
```

### Truth Table
| A | B | A && B | A \|\| B | !A |
|---|---|--------|----------|-----|
| T | T | T | T | F |
| T | F | F | T | F |
| F | T | F | T | T |
| F | F | F | F | T |

---

## 6. Operator Precedence (Highest to Lowest)

1. `++`, `--` (Post/Pre-increment/decrement)
2. `!` (Logical NOT)
3. `*`, `/`, `%` (Multiplication, Division, Modulus)
4. `+`, `-` (Addition, Subtraction)
5. `<`, `<=`, `>`, `>=` (Comparison)
6. `==`, `!=` (Equality)
7. `&&` (Logical AND)
8. `||` (Logical OR)
9. `=`, `+=`, `-=`, etc. (Assignment)

---

## Complete Example

```java
int a = 3, b = 8;
boolean isActive = true;
boolean isInSession = false;

// Arithmetic
System.out.println("a + b = " + (a + b));           // 11

// Comparison
System.out.println("a < b = " + (a < b));           // true

// Logical
System.out.println("isActive && isInSession = " 
    + (isActive && isInSession));                   // false

System.out.println("isActive || isInSession = " 
    + (isActive || isInSession));                   // true
```

---

## Output from Operators.java

```
=== Arithmetic Operators ===
a = 3, b = 8
Addition (a + b): 11
Subtraction (a - b): -5
Multiplication (a * b): 24
Division (b / a): 2
Modulus (b % a): 2

=== Order of Operations ===
2 + 3 * 2 = 8
(2 + 3) * 2 = 10

=== Assignment Operators ===
Initial x = 10
After x += 5: 15
After x -= 3: 12
After x *= 2: 24

=== Comparison Operators ===
a (3) == b (8): false
a (3) != b (8): true
a (3) < b (8): true
a (3) > b (8): false
a (3) <= b (8): true
a (3) >= b (8): false

=== Logical Operators ===
isActive (true) && isInSession (false): false
Should they register? false
age > 18: false || !isNotHome: false
Should go out? false
isNotHome: true, !isNotHome: false
```

---

## Common Mistakes

1. ❌ Using `=` instead of `==` in comparisons
   - ❌ `if (a = 5)` assigns 5 to a
   - ✅ `if (a == 5)` compares a with 5

2. ❌ Forgetting parentheses for clarity
   - ❌ `int result = 2 + 3 * 2;` (unclear intent)
   - ✅ `int result = 2 + (3 * 2);` (clear intent)

3. ❌ Using `&` or `|` instead of `&&` or `||`
   - `&` and `|` are bitwise operators, not logical operators

---

## Practice Exercises

1. Calculate the average of three numbers using arithmetic operators
2. Check if a number is between 10 and 20 using comparison and logical operators
3. Determine if a person can vote (age >= 18) AND has a valid ID
4. Create a complex boolean expression using all three logical operators
5. Explain the output of: `System.out.println(10 - 5 - 2);` and `System.out.println(10 / 2 / 2);`
