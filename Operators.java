/**
 * Demonstrates various operators in Java
 * Includes arithmetic, comparison, logical, and assignment operators
 */
public class Operators {

    public static void main(String[] args) {
        System.out.println("=== Arithmetic Operators ===");
        int a = 3;
        int b = 8;
        
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Addition (a + b): " + (a + b));
        System.out.println("Subtraction (a - b): " + (a - b));
        System.out.println("Multiplication (a * b): " + (a * b));
        System.out.println("Division (b / a): " + (b / a));
        System.out.println("Modulus (b % a): " + (b % a));

        System.out.println("\n=== Order of Operations ===");
        System.out.println("2 + 3 * 2 = " + (2 + 3 * 2));  // Multiplication first: 2 + 6 = 8
        System.out.println("(2 + 3) * 2 = " + ((2 + 3) * 2));  // Parentheses first: 5 * 2 = 10

        System.out.println("\n=== Assignment Operators ===");
        int x = 10;
        System.out.println("Initial x = " + x);
        x += 5;  // x = x + 5
        System.out.println("After x += 5: " + x);
        x -= 3;  // x = x - 3
        System.out.println("After x -= 3: " + x);
        x *= 2;  // x = x * 2
        System.out.println("After x *= 2: " + x);

        System.out.println("\n=== Comparison Operators ===");
        System.out.println("a (" + a + ") == b (" + b + "): " + (a == b));
        System.out.println("a (" + a + ") != b (" + b + "): " + (a != b));
        System.out.println("a (" + a + ") < b (" + b + "): " + (a < b));
        System.out.println("a (" + a + ") > b (" + b + "): " + (a > b));
        System.out.println("a (" + a + ") <= b (" + b + "): " + (a <= b));
        System.out.println("a (" + a + ") >= b (" + b + "): " + (a >= b));

        System.out.println("\n=== Logical Operators ===");
        boolean isActive = true;
        boolean isInSession = false;
        int age = 17;
        boolean isNotHome = true;

        // AND operator (&&)
        System.out.println("isActive (" + isActive + ") && isInSession (" + isInSession + "): "
                + (isActive && isInSession));
        System.out.println("Should they register? " + (isActive && isInSession));

        // OR operator (||)
        System.out.println("age > 18: " + (age > 18) + " || !isNotHome: " + (!isNotHome));
        System.out.println("Should go out? " + (age > 18 || !isNotHome));

        // NOT operator (!)
        System.out.println("isNotHome: " + isNotHome + ", !isNotHome: " + (!isNotHome));
    }
}
