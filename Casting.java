/**
 * Demonstrates type casting in Java
 * Shows both implicit (widening) and explicit (narrowing) casting
 */
public class Casting {

    public static void main(String[] args) {
        System.out.println("=== Implicit Casting (Widening) ===");
        // Automatic conversion: smaller type to larger type
        // No data loss occurs
        byte byteValue = 45;
        short shortValue = byteValue;  // byte → short (automatic)
        int intValue = byteValue;      // byte → int (automatic)
        long longValue = byteValue;    // byte → long (automatic)

        System.out.println("Byte: " + byteValue);
        System.out.println("Short: " + shortValue);
        System.out.println("Int: " + intValue);
        System.out.println("Long: " + longValue);

        System.out.println("\n=== Explicit Casting (Narrowing) ===");
        // Manual conversion: larger type to smaller type
        // Requires explicit cast operator, may lose precision
        double doubleValue = 743.4;
        int narrowedInt = (int) doubleValue;  // double → int (explicit)
        byte narrowedByte = (byte) doubleValue;  // double → byte (explicit)

        System.out.println("Original Double: " + doubleValue);
        System.out.println("Cast to Int: " + narrowedInt);
        System.out.println("Cast to Byte: " + narrowedByte);
    }
}
