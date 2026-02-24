# Booleans and Conditional Logic in Java

## Overview

A **boolean** is a primitive data type that holds one of two values: `true` or `false`. Booleans are the foundation of all decision-making and control flow in Java.

**Declaration:**
```java
boolean isOnline = true;
boolean isStudent = false;
```

---

## 1. Boolean Expressions

A boolean expression evaluates to `true` or `false`. You can store the result in a boolean variable.

```java
int age = 8;
int limit = 21;
boolean isAllowed = age > limit;   // false (8 is not greater than 21)

boolean isAdult = age >= 18;       // false
boolean isTeenager = age >= 13;    // false
boolean isSameAge = age == 8;      // true
```

### Comparison Operators That Produce Booleans

| Operator | Meaning | Example | Result |
|----------|---------|---------|--------|
| `>` | Greater than | `8 > 21` | `false` |
| `<` | Less than | `8 < 21` | `true` |
| `>=` | Greater than or equal | `21 >= 21` | `true` |
| `<=` | Less than or equal | `8 <= 21` | `true` |
| `==` | Equal to | `8 == 21` | `false` |
| `!=` | Not equal to | `8 != 21` | `true` |

---

## 2. If/Else Statement

The `if/else` statement executes different blocks of code based on a condition.

### Syntax
```java
if (condition) {
    // Runs when condition is true
} else {
    // Runs when condition is false
}
```

### Examples from the Code
```java
int age = 8;
int limit = 21;

if (age > limit) {
    System.out.println("They're old enough");
} else {
    System.out.println("They are too young");
}
// Output: They are too young
```

```java
boolean hasDrivingLicense = true;

if (hasDrivingLicense) {
    System.out.println("Can rent a car.");
} else {
    System.out.println("Cannot rent a car.");
}
// Output: Can rent a car.
```

### More Examples
```java
// Check if a number is positive or negative
int number = -5;
if (number > 0) {
    System.out.println("Positive");
} else {
    System.out.println("Negative or zero");
}

// Check even or odd
int value = 14;
if (value % 2 == 0) {
    System.out.println(value + " is even");
} else {
    System.out.println(value + " is odd");
}
```

---

## 3. Ternary Operator

A shorthand for simple if/else statements. Returns one of two values based on a condition.

### Syntax
```java
// condition ? valueIfTrue : valueIfFalse
```

### Examples from the Code
```java
int age = 8;
int limit = 21;

// Inline usage
System.out.println(age > limit ? "Old enough" : "Not old enough");
// Output: Not old enough

// Assigned to a variable
boolean hasDrivingLicense = true;
String output = hasDrivingLicense ? "Can rent a car." : "Cannot rent a car.";
System.out.println(output);
// Output: Can rent a car.
```

### More Examples
```java
// Determine pass/fail
int score = 72;
String result = score >= 50 ? "Pass" : "Fail";
System.out.println(result);  // Pass

// Find the larger of two numbers
int x = 15, y = 20;
int max = x > y ? x : y;
System.out.println("Larger: " + max);  // 20

// Set a default value
String username = null;
String displayName = username != null ? username : "Guest";
System.out.println(displayName);  // Guest
```

### When to Use Ternary vs If/Else
- **Ternary**: Simple, single-value decisions — assigning a variable or printing
- **If/Else**: Complex logic, multiple statements, or side effects

```java
// Good: Simple assignment
String status = isActive ? "Online" : "Offline";

// Bad: Too complex for ternary, use if/else instead
// String msg = a > b ? (a > c ? "a wins" : "c wins") : (b > c ? "b wins" : "c wins");
```

---

## 4. If/Else If Chain

Use when you have multiple conditions to check in sequence.

### Syntax
```java
if (condition1) {
    // Runs if condition1 is true
} else if (condition2) {
    // Runs if condition2 is true
} else if (condition3) {
    // Runs if condition3 is true
} else {
    // Runs if none of the above are true
}
```

### Example from the Code — Grading System
```java
// 0-39 => F, 40-49 => D, 50-59 => C, 60-69 => B, 70-100 => A
int marks = 65;

if (marks >= 0 && marks < 40) {
    System.out.println("Grade: F");
} else if (marks >= 40 && marks < 50) {
    System.out.println("Grade: D");
} else if (marks >= 50 && marks < 60) {
    System.out.println("Grade: C");
} else if (marks >= 60 && marks < 70) {
    System.out.println("Grade: B");
} else if (marks >= 70 && marks <= 100) {
    System.out.println("Grade: A");
} else {
    System.out.println("Invalid marks");
}
// Output: Grade: B
```

### More Examples
```java
// Temperature check
int temp = 30;

if (temp >= 35) {
    System.out.println("Hot");
} else if (temp >= 25) {
    System.out.println("Warm");
} else if (temp >= 15) {
    System.out.println("Cool");
} else {
    System.out.println("Cold");
}
// Output: Warm

// Ticket pricing by age
int age = 25;
double price;

if (age < 5) {
    price = 0;         // Free
} else if (age < 13) {
    price = 5.50;      // Child
} else if (age < 65) {
    price = 12.00;     // Adult
} else {
    price = 7.00;      // Senior
}
System.out.println("Ticket price: $" + price);
// Output: Ticket price: $12.0
```

---

## 5. Logical Operators with Booleans

Combine multiple boolean expressions using logical operators.

| Operator | Name | Description |
|----------|------|-------------|
| `&&` | AND | Both conditions must be true |
| `\|\|` | OR | At least one condition must be true |
| `!` | NOT | Reverses the boolean value |

### Examples
```java
int age = 25;
boolean hasID = true;
boolean isMember = false;

// AND — both must be true
if (age >= 18 && hasID) {
    System.out.println("Entry allowed");
}

// OR — at least one must be true
if (isMember || age >= 21) {
    System.out.println("Discount applied");
}

// NOT — reverses the value
if (!isMember) {
    System.out.println("Not a member yet");
}

// Combined
if (age >= 18 && (hasID || isMember)) {
    System.out.println("Can proceed");
}
```

---

## 6. Common Patterns

### Boolean as a Toggle
```java
boolean isDarkMode = true;
isDarkMode = !isDarkMode;  // Toggles to false
isDarkMode = !isDarkMode;  // Toggles back to true
```

### Using Boolean Methods
```java
String email = "user@example.com";

if (email.contains("@")) {
    System.out.println("Valid email format");
}

String input = "";
if (input.isEmpty()) {
    System.out.println("No input provided");
}
```

### Simplifying Boolean Expressions
```java
// Don't do this
if (isActive == true) { ... }

// Do this instead
if (isActive) { ... }

// Don't do this
if (isActive == false) { ... }

// Do this instead
if (!isActive) { ... }
```

---

## Output

Running the Booleans.java program produces:
```
=== Boolean Expressions ===
isAllowed (age > limit): false

=== If/Else Statement ===
They are too young

=== Ternary Operator ===
Not old enough

=== Boolean Variable in If/Else ===
Can rent a car.
Ternary result: Can rent a car.

=== If/Else If Chain (Grading) ===
Grade: B

The end
```
