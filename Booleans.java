/**
 * Demonstrates booleans, conditional logic, and the ternary operator in Java
 * Shows if/else statements and boolean expressions
 */
public class Booleans {

    public static void main(String[] args) {
        // --- Boolean Variables ---
        boolean isOnline = true;
        boolean isStudent = false;
        int age = 8;
        int limit = 21;
        boolean isAllowed = age > limit;
        boolean hasDrivingLicense = true;

        System.out.println("=== Boolean Expressions ===");
        System.out.println("isAllowed (age > limit): " + isAllowed);

        // --- If/Else Statement ---
        System.out.println("\n=== If/Else Statement ===");
        if (age > limit) {
            // Runs when condition is true
            System.out.println("They're old enough");
        } else {
            // Runs when condition is false
            System.out.println("They are too young");
        }

        // --- Ternary Operator ---
        // Syntax: condition ? valueIfTrue : valueIfFalse
        System.out.println("\n=== Ternary Operator ===");
        System.out.println(age > limit ? "Old enough" : "Not old enough");

        // --- If/Else with Boolean Variable ---
        System.out.println("\n=== Boolean Variable in If/Else ===");
        if (hasDrivingLicense) {
            System.out.println("Can rent a car.");
        } else {
            System.out.println("Cannot rent a car.");
        }

        // Ternary assigned to a variable
        String output = hasDrivingLicense ? "Can rent a car." : "Cannot rent a car.";
        System.out.println("Ternary result: " + output);

        // --- If/Else If Chain (Grading System) ---
        System.out.println("\n=== If/Else If Chain (Grading) ===");
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

        System.out.println("\nThe end");
    }
}
