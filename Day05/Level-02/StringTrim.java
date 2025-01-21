import java.util.Scanner;

public class StringTrim {

    // Method to trim leading and trailing spaces using charAt()
    public static int[] trimSpaces(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Trim leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end + 1}; // end + 1 because end is inclusive
    }

    // Method to create a substring using charAt()
    public static String substringUsingCharAt(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
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
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Trim spaces using custom method
        int[] indices = trimSpaces(text);
        String trimmedText = substringUsingCharAt(text, indices[0], indices[1]);

        // Trim spaces using built-in trim() method
        String trimmedTextBuiltIn = text.trim();

        // Compare the results
        boolean areEqual = compareStrings(trimmedText, trimmedTextBuiltIn);

        // Display the results
        System.out.println("\nCustom Trimmed Text: '" + trimmedText + "'");
        System.out.println("Built-in Trimmed Text: '" + trimmedTextBuiltIn + "'");
        System.out.println("Are both results equal? " + areEqual);

        scanner.close();
    }
}
