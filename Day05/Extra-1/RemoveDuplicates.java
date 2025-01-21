import java.util.Scanner;
import java.util.HashSet;

public class RemoveDuplicates {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        
        // Close the scanner
        scanner.close();
        
        // Call the method to remove duplicates and get the result
        String result = removeDuplicateCharacters(input);
        
        // Print the modified string
        System.out.println("Modified string (without duplicates): " + result);
    }

    // Method to remove duplicate characters
    public static String removeDuplicateCharacters(String input) {
        // Create a HashSet to store characters that have already been seen
        HashSet<Character> seen = new HashSet<>();
        
        // StringBuilder to construct the result string
        StringBuilder result = new StringBuilder();
        
        // Loop through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            // If the character is not in the HashSet, add it to the result
            if (!seen.contains(ch)) {
                seen.add(ch);
                result.append(ch);
            }
        }
        
        // Return the modified string
        return result.toString();
    }
}
