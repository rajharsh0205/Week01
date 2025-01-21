import java.util.Scanner;

public class SubstringCounter {

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to input the main string
        System.out.println("Enter the main string:");
        String mainString = scanner.nextLine();
        
        // Prompt the user to input the substring
        System.out.println("Enter the substring to count:");
        String substring = scanner.nextLine();
        
        // Close the scanner
        scanner.close();
        
        // Call the countOccurrences method to get the count
        int count = countOccurrences(mainString, substring);
        
        // Print the result
        System.out.println("The substring \"" + substring + "\" occurs " + count + " times.");
    }

    // Method to count occurrences of a substring in a string
    public static int countOccurrences(String mainString, String substring) {
        // Initialize variables
        int count = 0;
        int index = 0;
        
        // Loop to find all occurrences of the substring
        while ((index = mainString.indexOf(substring, index)) != -1) {
            count++;  // Increment count when the substring is found
            index += substring.length();  // Move the index to the end of the found substring
        }
        
        return count;  // Return the final count
    }
}
