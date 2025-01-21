import java.util.Scanner;

public class LowerCaseComparison {

    // Method to convert each character to lowercase using ASCII values
    public static String convertToLowerCase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Check if the character is uppercase
            if (ch >= 'A' && ch <= 'Z') {
                // Convert to lowercase by adding 32
                ch = (char) (ch + 32);
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

        // Convert to lowercase using built-in method
        String lowerCaseBuiltIn = userInput.toLowerCase();

        // Convert to lowercase using custom method
        String lowerCaseCustom = convertToLowerCase(userInput);

        // Compare the two results
        boolean areEqual = compareStrings(lowerCaseBuiltIn, lowerCaseCustom);

        // Display results
        System.out.println("Built-in toLowerCase result: " + lowerCaseBuiltIn);
        System.out.println("Custom convertToLowerCase result: " + lowerCaseCustom);
        System.out.println("Are both results identical? " + areEqual);

        // Closing the scanner
        scanner.close();
    }
}
