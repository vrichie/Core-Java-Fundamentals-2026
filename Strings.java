/**
 * Demonstrates common String operations and methods in Java
 * Shows string manipulation, comparison, and utility methods
 */
public class Strings {

    public static void main(String[] args) {
        String name = " doe ";   // String with spaces
        String name2 = "doe";    // String without spaces

        // --- String Basics ---
        System.out.println("=== String Basics ===");
        System.out.println("Original String: '" + name + "'");
        System.out.println("String Length: " + name.length());

        // --- Case Conversion ---
        System.out.println("\n=== String Case Conversion ===");
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());

        // --- Character Access ---
        System.out.println("\n=== Character Access ===");
        System.out.println("Character at index 0: '" + name.charAt(0) + "'");
        System.out.println("Character at index 2: '" + name.charAt(2) + "'");
        System.out.println("Character at index 4: '" + name.charAt(4) + "'");

        // --- String Comparison ---
        System.out.println("\n=== String Comparison ===");
        System.out.println("name.equals(name2): " + name.equals(name2));
        System.out.println("Reason: '" + name + "' has leading/trailing spaces");

        // --- String Trimming ---
        System.out.println("\n=== String Trimming ===");
        System.out.println("With spaces: '" + name + "'");
        System.out.println("Without spaces: '" + name.trim() + "'");
        System.out.println("After trim, equals name2: " + name.trim().equals(name2));

        // --- String Concatenation ---
        System.out.println("\n=== String Concatenation ===");
        String a = "Hello";
        String b = "20";
        int c = 10;
        String x = b + c;  // "20" + 10 = "2010" (String + int = String)

        System.out.println("a.concat(b): " + a.concat(b));     // Hello20
        System.out.println("b + c: " + x);                      // 2010
        System.out.println("He said, \"Hello\" and then left."); // Escape quotes
    }
}
