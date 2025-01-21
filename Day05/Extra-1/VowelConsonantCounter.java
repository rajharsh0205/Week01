import java.util.Scanner;

public class VowelConsonantCounter {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        
        // Close the scanner
        scanner.close();
        
        // Initialize counters for vowels and consonants
        int vowelCount = 0;
        int consonantCount = 0;
        
        // Convert the string to lowercase for easy comparison
        input = input.toLowerCase();
        
        // Loop through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
            // Check if the character is a consonant (i.e., a letter that is not a vowel)
            else if (ch >= 'a' && ch <= 'z') {
                consonantCount++;
            }
        }
        
        // Print the results
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }
}
