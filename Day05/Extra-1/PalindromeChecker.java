import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        
        // Close the scanner
        scanner.close();
        
        // Normalize the string (convert to lowercase for case insensitivity)
        input = input.toLowerCase();
        
        // Remove spaces to handle palindrome cases with spaces
        input = input.replaceAll("\\s", "");
        
        // Check if the string is a palindrome
        boolean isPalindrome = true;
        
        // Loop through the string and compare characters from both ends
        int left = 0;
        int right = input.length() - 1;
        
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        
        // Output the result
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
