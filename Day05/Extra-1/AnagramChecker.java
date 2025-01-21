import java.util.Scanner;

public class AnagramChecker {

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
        
        // Check if the strings are anagrams and print the result
        if (areAnagrams(string1, string2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }

    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        // If lengths are different, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }
        
        // Convert both strings to lower case and convert them to character arrays
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        // Convert both strings to character arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        
        // Sort the character arrays
        java.util.Arrays.sort(charArray1);
        java.util.Arrays.sort(charArray2);
        
        // Compare the sorted character arrays
        return java.util.Arrays.equals(charArray1, charArray2);
    }
}
