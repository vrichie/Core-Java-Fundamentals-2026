/**
 * Demonstrates common String operations and methods in Java
 * Shows string manipulation, comparison, and utility methods
 */
public class Strings {

    public static void main(String[] args) {
        String name = " doe ";   // String with spaces
        String name2 = "doe";    // String without spaces

        System.out.println("=== String Basics ===");
        System.out.println("Original String: '" + name + "'");
        System.out.println("String Length: " + name.length());

        System.out.println("\n=== String Case Conversion ===");
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());

        System.out.println("\n=== Character Access ===");
        System.out.println("Character at index 0: '" + name.charAt(0) + "'");
        System.out.println("Character at index 2: '" + name.charAt(2) + "'");
        System.out.println("Character at index 4: '" + name.charAt(4) + "'");

        System.out.println("\n=== String Comparison ===");
        System.out.println("name.equals(name2): " + name.equals(name2));
        System.out.println("Reason: '" + name + "' has leading/trailing spaces");
        System.out.println("name2 = '" + name2 + "'");

        System.out.println("\n=== String Trimming ===");
        System.out.println("With spaces: '" + name + "'");
        System.out.println("Without spaces: '" + name.trim() + "'");
        System.out.println("After trim, equals name2: " + name.trim().equals(name2));

        System.out.println("\n=== String Concatenation ===");
        String greeting = "Hi my name is " + name;
        System.out.println(greeting);
        System.out.println(name + "has " + name.length() + " characters (including spaces)");
    }
}
