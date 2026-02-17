/**
 * Demonstrates Java primitive data types and variable declarations
 * Shows how to declare and initialize variables of different data types
 */
public class Variables {

    public static void main(String[] args) {
        // --- Numeric Data Types ---
        byte byteValue = 127;           // 1 byte: range -128 to 127
        short shortValue = 2000;        // 2 bytes: range -32,768 to 32,767
        int age = 49;                   // 4 bytes: range -2.1B to 2.1B
        long fileSize = 483767839484L;  // 8 bytes: large numbers (use L suffix)

        // --- Floating-Point Data Types ---
        float price = 45.67f;           // 4 bytes: ~6-7 decimal precision (use f suffix)
        double average = 34532.6363;    // 8 bytes: ~15-17 decimal precision
        final float pi = 3.14f;         // Constant value

        // --- Other Primitive Data Types ---
        boolean isStudent = true;       // true or false
        char grade = 'B';               // single character
        String name = "James";          // reference type (String)

        // Display information
        System.out.println("Student: " + name);
        System.out.println("Grade: " + grade + " | Age: " + age + " | Active: " + isStudent);
        System.out.println("Average Score: " + average);
        System.out.println("File Size: " + fileSize + " bytes");
    }
}
