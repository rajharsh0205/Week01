import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionDemo {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String input) {
        // Accessing index beyond string length
        char ch = input.charAt(input.length());  // This will throw StringIndexOutOfBoundsException
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String input) {
        try {
            // Attempt to access an index beyond the string length
            char ch = input.charAt(input.length());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String inputString = scanner.next();

        // Demonstrating StringIndexOutOfBoundsException
        try {
            generateException(inputString);  // This will throw an exception and stop the program if not caught
        } catch (Exception e) {
            System.out.println("Exception generated: " + e);
        }

        // Handling StringIndexOutOfBoundsException
        handleException(inputString);

        // Close the scanner to release resources
        scanner.close();
    }
}
