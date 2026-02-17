# Strings in Java

## Overview

A **String** is a sequence of characters in Java. Unlike other primitive data types, String is a **reference type** from the `java.lang` package. Strings are immutable, meaning once created, they cannot be changed.

**Declaration:**
```java
String name = "James";
```

---

## Key String Methods

### 1. `length()`
Returns the number of characters in the string (including spaces).

```java
String name = " doe ";
System.out.println(name.length());  // 5 (space + d + o + e + space)
```

**Common Mistake:** Don't use parentheses in properties, but do use them for methods.

---

### 2. `charAt(int index)`
Returns the character at a specific index position.
- **Index starts at 0**
- Characters are: `[' '][d][o][e][ ]` with indices `0 1 2 3 4`

```java
String name = " doe ";
System.out.println(name.charAt(0));    // ' ' (space)
System.out.println(name.charAt(1));    // 'd'
System.out.println(name.charAt(2));    // 'o'
System.out.println(name.charAt(3));    // 'e'
System.out.println(name.charAt(4));    // ' ' (space)
```

**Common Mistake:** Index out of bounds error if index >= length

---

### 3. `toUpperCase()`
Converts all characters to uppercase.

```java
String name = "doe";
System.out.println(name.toUpperCase());  // "DOE"
```

**Note:** Original string remains unchanged (Strings are immutable)

---

### 4. `toLowerCase()`
Converts all characters to lowercase.

```java
String name = "DOE";
System.out.println(name.toLowerCase());  // "doe"
```

---

### 5. `equals(String other)`
Compares two strings for exact equality (case-sensitive).
Returns `true` if strings are identical, `false` otherwise.

```java
String name = " doe ";
String name2 = "doe";
System.out.println(name.equals(name2));  // false
// They're different because name has spaces

System.out.println(name.trim().equals(name2));  // true
// After trimming, they're equal
```

**Important:** Use `.equals()` for string comparison, NOT `==`
- `==` compares memory references (addresses)
- `.equals()` compares actual values

---

### 6. `trim()`
Removes leading and trailing whitespace (spaces, tabs, newlines).
Does NOT remove spaces in the middle of the string.

```java
String name = " doe ";
System.out.println("With spaces: '" + name + "'");           // ' doe '
System.out.println("Without spaces: '" + name.trim() + "'");  // 'doe'
System.out.println(name.length());        // 5
System.out.println(name.trim().length()); // 3
```

---

## String Concatenation

Combining multiple strings together.

### Method 1: Using `+` Operator
```java
String firstName = "John";
String lastName = "Doe";
String fullName = firstName + " " + lastName;
System.out.println(fullName);  // "John Doe"
```

### Method 2: String Builder (for performance)
```java
StringBuilder sb = new StringBuilder();
sb.append("Hello");
sb.append(" ");
sb.append("World");
System.out.println(sb.toString());  // "Hello World"
```

### Concatenation with Other Types
```java
int age = 25;
String message = "Age: " + age;  // "Age: 25"
```

---

## Useful String Methods Cheat Sheet

| Method | Purpose | Example | Result |
|--------|---------|---------|--------|
| `length()` | Get string length | `"hello".length()` | `5` |
| `charAt(i)` | Get character at index | `"hello".charAt(0)` | `'h'` |
| `substring(i, j)` | Get substring | `"hello".substring(1, 4)` | `"ell"` |
| `indexOf(char)` | Find first position | `"hello".indexOf('l')` | `2` |
| `toUpperCase()` | Convert to uppercase | `"hello".toUpperCase()` | `"HELLO"` |
| `toLowerCase()` | Convert to lowercase | `"HELLO".toLowerCase()` | `"hello"` |
| `trim()` | Remove spaces | `" hello ".trim()` | `"hello"` |
| `replace(old, new)` | Replace characters | `"hello".replace('l', 'L')` | `"heLLo"` |
| `equals(other)` | Compare strings | `"hello".equals("hello")` | `true` |
| `equalsIgnoreCase(other)` | Compare (ignore case) | `"hello".equalsIgnoreCase("HELLO")` | `true` |
| `startsWith(str)` | Check prefix | `"hello".startsWith("he")` | `true` |
| `endsWith(str)` | Check suffix | `"hello".endsWith("lo")` | `true` |
| `contains(str)` | Check if contains | `"hello".contains("ell")` | `true` |
| `split(regex)` | Split string | `"a,b,c".split(",")` | `["a","b","c"]` |

---

## Complete Example from Strings.java

```java
String name = " doe ";   // String with leading and trailing spaces
String name2 = "doe";    // String without spaces

System.out.println("=== String Basics ===");
System.out.println("Original String: '" + name + "'");
System.out.println("String Length: " + name.length());  // 5

System.out.println("\n=== String Case Conversion ===");
System.out.println("Uppercase: " + name.toUpperCase());      // " DOE "
System.out.println("Lowercase: " + name.toLowerCase());      // " doe "

System.out.println("\n=== Character Access ===");
System.out.println("Character at index 0: '" + name.charAt(0) + "'");  // ' '
System.out.println("Character at index 2: '" + name.charAt(2) + "'");  // 'o'
System.out.println("Character at index 4: '" + name.charAt(4) + "'");  // ' '

System.out.println("\n=== String Comparison ===");
System.out.println("name.equals(name2): " + name.equals(name2));  // false
System.out.println("Why: '" + name + "' has leading/trailing spaces");
System.out.println("name2 = '" + name2 + "'");

System.out.println("\n=== String Trimming ===");
System.out.println("With spaces: '" + name + "'");     // ' doe '
System.out.println("Without spaces: '" + name.trim() + "'");  // 'doe'
System.out.println("After trim, equals name2: " + name.trim().equals(name2));  // true
```

**Output:**
```
=== String Basics ===
Original String: ' doe '
String Length: 5

=== String Case Conversion ===
Uppercase:  DOE 
Lowercase:  doe 

=== Character Access ===
Character at index 0: ' '
Character at index 2: 'o'
Character at index 4: ' '

=== String Comparison ===
name.equals(name2): false
Reason: ' doe ' has leading/trailing spaces
name2 = 'doe'

=== String Trimming ===
With spaces: ' doe '
Without spaces: 'doe'
After trim, equals name2: true

=== String Concatenation ===
Hi my name is  doe 
 doe has 5 characters (including spaces)
```

---

## Important Concepts

### Strings are Immutable
Once a String is created, it cannot be changed. Operations like `toUpperCase()` create a NEW string.

```java
String original = "hello";
String upper = original.toUpperCase();  // Creates NEW string
System.out.println(original);  // Still "hello"
System.out.println(upper);     // "HELLO"
```

### String vs String Builder
- **String:** Use for single operations or when the string doesn't change
- **StringBuilder:** Use in loops or when making many modifications

```java
// Bad: Creates many intermediate strings
String result = "";
for (int i = 0; i < 1000; i++) {
    result += "X";  // Creates new string each iteration
}

// Good: Efficient
StringBuilder result = new StringBuilder();
for (int i = 0; i < 1000; i++) {
    result.append("X");
}
```

---

## Common Mistakes

1. ❌ Using `==` to compare strings
   - ❌ `if (name == "doe")`
   - ✅ `if (name.equals("doe"))`

2. ❌ Forgetting indices start at 0
   - ❌ `name.charAt(1)` expecting the first character
   - ✅ `name.charAt(0)` for the first character

3. ❌ Assuming `trim()` removes all spaces
   - ❌ `"h e l l o".trim()` removes only leading/trailing spaces
   - Result: `"h e l l o"` (middle spaces remain)

4. ❌ Modifying the original when using methods
   - ❌ `name.toUpperCase()` without assigning: `name` is still lowercase
   - ✅ `String upper = name.toUpperCase()` to save the result

---

## Practice Exercises

1. **Create a program** that takes a name and displays:
   - The full name in uppercase
   - The full name in lowercase
   - The first 3 characters
   - The length of the name

2. **String comparison:** Create two variables with similar names but different cases, then compare them using `equals()` and `equalsIgnoreCase()`

3. **Trimming:** Create a string with extra spaces and demonstrate the difference between the original and trimmed versions

4. **Substitution:** Take a sentence and replace all spaces with hyphens using the `replace()` method

5. **Email validation:** Check if a string contains "@" and ends with ".com" using `contains()` and `endsWith()`
