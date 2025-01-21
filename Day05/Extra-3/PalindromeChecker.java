import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        // Taking input from the user
        String inputString = getInput("Enter a string to check if it's a palindrome: ");
        
        // Checking if the input string is a palindrome
        boolean isPalindrome = isPalindrome(inputString);
        
        // Displaying the result
        displayResult(inputString, isPalindrome);
    }

    // Function to take input from the user
    public static String getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine();
    }

    // Function to check if a given string is a palindrome
    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase for a case-insensitive check
        str = str.replaceAll("\\s", "").toLowerCase();
        
        // Check if the string is equal to its reverse
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false; // Not a palindrome
            }
        }
        return true; // It's a palindrome
    }

    // Function to display the result
    public static void displayResult(String str, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }
    }
}
