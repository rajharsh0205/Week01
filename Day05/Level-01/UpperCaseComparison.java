import java.util.Scanner;

public class UpperCaseComparison {

    // Method to convert each character to uppercase using ASCII values
    public static String convertToUpperCase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Check if the character is lowercase
            if (ch >= 'a' && ch <= 'z') {
                // Convert to uppercase by subtracting 32
                ch = (char) (ch - 32);
            }
            result.append(ch);
        }
        return result.toString();
    }

    // Method to compare two strings character by character
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Taking user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String userInput = scanner.nextLine();

        // Convert to uppercase using built-in method
        String upperCaseBuiltIn = userInput.toUpperCase();

        // Convert to uppercase using custom method
        String upperCaseCustom = convertToUpperCase(userInput);

        // Compare the two results
        boolean areEqual = compareStrings(upperCaseBuiltIn, upperCaseCustom);

        // Display results
        System.out.println("Built-in toUpperCase result: " + upperCaseBuiltIn);
        System.out.println("Custom convertToUpperCase result: " + upperCaseCustom);
        System.out.println("Are both results identical? " + areEqual);

        // Closing the scanner
        scanner.close();
    }
}
