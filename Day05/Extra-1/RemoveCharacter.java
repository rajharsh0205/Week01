import java.util.Scanner;

public class RemoveCharacter {

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to input a string
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();
        
        // Prompt the user to input the character to remove
        System.out.println("Enter the character to remove:");
        char charToRemove = scanner.next().charAt(0);
        
        // Close the scanner
        scanner.close();
        
        // Call the removeCharacter method to remove all occurrences of the character
        String modifiedString = removeCharacter(inputString, charToRemove);
        
        // Print the result
        System.out.println("Modified String: \"" + modifiedString + "\"");
    }

    // Method to remove all occurrences of a specific character from the string
    public static String removeCharacter(String str, char charToRemove) {
        // Use StringBuilder to construct the result string
        StringBuilder result = new StringBuilder();
        
        // Loop through the string and append characters that are not the one to remove
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != charToRemove) {
                result.append(str.charAt(i));
            }
        }
        
        return result.toString();  // Return the modified string
    }
}
