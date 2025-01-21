import java.util.Scanner;

public class LexicographicalCompare {

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to input two strings
        System.out.println("Enter the first string:");
        String string1 = scanner.nextLine();
        
        System.out.println("Enter the second string:");
        String string2 = scanner.nextLine();
        
        // Close the scanner
        scanner.close();
        
        // Call the compareStrings method to compare the strings lexicographically
        int result = compareStrings(string1, string2);
        
        // Print the result
        if (result < 0) {
            System.out.println("\"" + string1 + "\" comes before \"" + string2 + "\" in lexicographical order");
        } else if (result > 0) {
            System.out.println("\"" + string1 + "\" comes after \"" + string2 + "\" in lexicographical order");
        } else {
            System.out.println("Both strings are identical.");
        }
    }

    // Method to compare two strings lexicographically
    public static int compareStrings(String str1, String str2) {
        // Find the length of the shorter string
        int length = Math.min(str1.length(), str2.length());
        
        // Compare the strings character by character
        for (int i = 0; i < length; i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            
            if (c1 < c2) {
                return -1;  // str1 comes before str2
            } else if (c1 > c2) {
                return 1;   // str1 comes after str2
            }
        }
        
        // If characters are equal, compare the lengths
        if (str1.length() < str2.length()) {
            return -1;  // str1 is shorter and comes first
        } else if (str1.length() > str2.length()) {
            return 1;   // str1 is longer and comes later
        }
        
        return 0;  // Both strings are equal
    }
}
