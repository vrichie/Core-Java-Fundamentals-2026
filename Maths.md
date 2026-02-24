# Math Class in Java

## Overview

The `Math` class (from `java.lang`) provides built-in methods for common mathematical operations. All methods are **static**, so you call them directly on the class — no object creation needed.

```java
Math.methodName(arguments)
```

---

## 1. `Math.min(a, b)`

Returns the **smaller** of two values.

```java
int a = 10, b = 3;
System.out.println(Math.min(a, b));      // 3
System.out.println(Math.min(100, 200));   // 100
System.out.println(Math.min(-5, -10));    // -10
System.out.println(Math.min(3.5, 2.8));   // 2.8
```

Works with `int`, `long`, `float`, and `double`.

---

## 2. `Math.max(a, b)`

Returns the **larger** of two values.

```java
int a = 10;
float c = 5.5f;
System.out.println(Math.max(a, c));       // 10.0
System.out.println(Math.max(100, 200));    // 200
System.out.println(Math.max(-5, -10));     // -5
System.out.println(Math.max(3.14, 2.71)); // 3.14
```

### Finding Min/Max of Three or More Values
```java
int x = 5, y = 12, z = 8;
int largest = Math.max(x, Math.max(y, z));    // 12
int smallest = Math.min(x, Math.min(y, z));   // 5
```

---

## 3. `Math.sqrt(x)`

Returns the **square root** of a number.

```java
System.out.println(Math.sqrt(10));    // 3.1622776601683795
System.out.println(Math.sqrt(25));    // 5.0
System.out.println(Math.sqrt(144));   // 12.0
System.out.println(Math.sqrt(2));     // 1.4142135623730951
```

**Note:** Always returns a `double`. Returns `NaN` for negative numbers.

```java
System.out.println(Math.sqrt(-4));    // NaN
```

---

## 4. `Math.random()`

Returns a random `double` between **0.0 (inclusive)** and **1.0 (exclusive)**.

```java
System.out.println(Math.random());    // e.g., 0.7342...
System.out.println(Math.random());    // e.g., 0.1285...
```

### Generating Random Numbers in a Range

```java
// Random int from 0 to 9
int rand0to9 = (int) (Math.random() * 10);

// Random int from 1 to 10
int rand1to10 = (int) (Math.random() * 10) + 1;

// Random int from 1 to 100
int rand1to100 = (int) (Math.random() * 100) + 1;

// Random int between min and max (inclusive)
int min = 5, max = 20;
int randInRange = (int) (Math.random() * (max - min + 1)) + min;
```

### Formula
```
(int) (Math.random() * (max - min + 1)) + min
```

---

## 5. Other Useful Math Methods

### `Math.abs(x)` — Absolute Value
```java
System.out.println(Math.abs(-7));      // 7
System.out.println(Math.abs(7));       // 7
System.out.println(Math.abs(-3.14));   // 3.14
```

### `Math.pow(base, exponent)` — Power
```java
System.out.println(Math.pow(2, 3));    // 8.0  (2³)
System.out.println(Math.pow(5, 2));    // 25.0 (5²)
System.out.println(Math.pow(10, 0));   // 1.0  (anything to the power of 0)
```

### `Math.round(x)` — Rounding
```java
System.out.println(Math.round(4.3));   // 4
System.out.println(Math.round(4.5));   // 5
System.out.println(Math.round(4.7));   // 5
```

### `Math.ceil(x)` — Round Up
```java
System.out.println(Math.ceil(4.1));    // 5.0
System.out.println(Math.ceil(4.9));    // 5.0
System.out.println(Math.ceil(5.0));    // 5.0
```

### `Math.floor(x)` — Round Down
```java
System.out.println(Math.floor(4.1));   // 4.0
System.out.println(Math.floor(4.9));   // 4.0
System.out.println(Math.floor(5.0));   // 5.0
```

---

## 6. Math Constants

```java
System.out.println(Math.PI);    // 3.141592653589793
System.out.println(Math.E);     // 2.718281828459045
```

### Example: Area of a Circle
```java
double radius = 7.0;
double area = Math.PI * Math.pow(radius, 2);
System.out.println("Area: " + area);  // Area: 153.93804002589985
```

---

## Quick Reference Table

| Method | Description | Example | Result |
|--------|-------------|---------|--------|
| `Math.min(a, b)` | Smaller of two values | `Math.min(10, 3)` | `3` |
| `Math.max(a, b)` | Larger of two values | `Math.max(10, 5.5f)` | `10.0` |
| `Math.sqrt(x)` | Square root | `Math.sqrt(25)` | `5.0` |
| `Math.random()` | Random 0.0–1.0 | `Math.random()` | `0.xxx` |
| `Math.abs(x)` | Absolute value | `Math.abs(-7)` | `7` |
| `Math.pow(a, b)` | Power (a^b) | `Math.pow(2, 3)` | `8.0` |
| `Math.round(x)` | Round to nearest | `Math.round(4.5)` | `5` |
| `Math.ceil(x)` | Round up | `Math.ceil(4.1)` | `5.0` |
| `Math.floor(x)` | Round down | `Math.floor(4.9)` | `4.0` |
| `Math.PI` | Pi constant | `Math.PI` | `3.14159...` |
| `Math.E` | Euler's number | `Math.E` | `2.71828...` |

---

## Output

Running the Maths.java program produces:
```
=== Math Class Methods ===
a = 10, b = 3, c = 5.5

--- Min & Max ---
Min of a and b: 3
Max of a and c: 10.0

--- Square Root ---
Sqrt of 10: 3.1622776601683795

--- Random ---
Random number (0.0 to 1.0): 0.xxxxx (varies each run)
```
