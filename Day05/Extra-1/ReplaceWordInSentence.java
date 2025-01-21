import java.util.Scanner;

public class ReplaceWordInSentence {

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to input a sentence
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();
        
        // Prompt the user to input the word to replace
        System.out.println("Enter the word to replace:");
        String wordToReplace = scanner.nextLine();
        
        // Prompt the user to input the replacement word
        System.out.println("Enter the replacement word:");
        String replacementWord = scanner.nextLine();
        
        // Close the scanner
        scanner.close();
        
        // Call the replaceWord method to replace the word in the sentence
        String modifiedSentence = replaceWord(sentence, wordToReplace, replacementWord);
        
        // Print the modified sentence
        System.out.println("Modified Sentence: " + modifiedSentence);
    }

    // Method to replace all occurrences of a word with another word in a sentence
    public static String replaceWord(String sentence, String wordToReplace, String replacementWord) {
        // Replace the word in the sentence
        return sentence.replaceAll("\\b" + wordToReplace + "\\b", replacementWord);
    }
}
