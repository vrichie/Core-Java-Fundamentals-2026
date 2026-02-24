/**
 * Demonstrates Java Math class methods
 * Shows common mathematical operations using built-in functions
 */
public class Maths {

    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        float c = 5.5f;

        System.out.println("=== Math Class Methods ===");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

        // --- Min and Max ---
        System.out.println("\n--- Min & Max ---");
        System.out.println("Min of a and b: " + Math.min(a, b));       // 3
        System.out.println("Max of a and c: " + Math.max(a, c));       // 10.0

        // --- Square Root ---
        System.out.println("\n--- Square Root ---");
        System.out.println("Sqrt of 10: " + Math.sqrt(10));            // 3.1622...

        // --- Random Numbers ---
        System.out.println("\n--- Random ---");
        System.out.println("Random number (0.0 to 1.0): " + Math.random());
    }
}
