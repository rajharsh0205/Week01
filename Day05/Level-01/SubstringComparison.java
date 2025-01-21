import java.util.Scanner;

public class SubstringComparison {

    // Method to create a substring using charAt() method
    public static String createSubstringUsingCharAt(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    // Method to compare two strings using charAt() method
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
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

        // Taking user input
        System.out.print("Enter a string: ");
        String inputString = scanner.next();
        System.out.print("Enter the start index: ");
        int startIndex = scanner.nextInt();
        System.out.print("Enter the end index: ");
        int endIndex = scanner.nextInt();

        // Creating substrings using both methods
        String substringUsingCharAt = createSubstringUsingCharAt(inputString, startIndex, endIndex);
        String substringUsingBuiltInMethod = inputString.substring(startIndex, endIndex);

        // Comparing the substrings
        boolean areSubstringsEqual = compareStringsUsingCharAt(substringUsingCharAt, substringUsingBuiltInMethod);

        // Displaying the results
        System.out.println("Substring using charAt(): " + substringUsingCharAt);
        System.out.println("Substring using substring(): " + substringUsingBuiltInMethod);
        System.out.println("Are both substrings equal? " + areSubstringsEqual);
    }
}
