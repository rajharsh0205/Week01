import java.util.Scanner;

public class LongestWordFinder {

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for a sentence
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();
        
        // Close the scanner
        scanner.close();
        
        // Split the sentence into words using space as a delimiter
        String[] words = sentence.split("\\s+");
        
        // Initialize variables to keep track of the longest word
        String longestWord = "";
        
        // Loop through all words and find the longest one
        for (String word : words) {
            // Update the longest word if the current word is longer
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        
        // Output the longest word
        System.out.println("The longest word is: " + longestWord);
    }
}
