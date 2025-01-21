import java.util.Scanner;

public class ToggleCase {

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to input a string
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();
        
        // Close the scanner
        scanner.close();
        
        // Call the toggleCase method to toggle the case of the string
        String toggledString = toggleCase(inputString);
        
        // Print the result
        System.out.println("Toggled case string: " + toggledString);
    }

    // Method to toggle the case of each character in a string
    public static String toggleCase(String str) {
        // Create a StringBuilder to build the result string
        StringBuilder toggledString = new StringBuilder();
        
        // Loop through each character of the input string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            
            // Check if the character is lowercase or uppercase
            if (Character.isLowerCase(c)) {
                // Convert lowercase to uppercase
                toggledString.append(Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                // Convert uppercase to lowercase
                toggledString.append(Character.toLowerCase(c));
            } else {
                // For non-alphabet characters, keep them as is
                toggledString.append(c);
            }
        }
        
        // Return the toggled string
        return toggledString.toString();
    }
}
