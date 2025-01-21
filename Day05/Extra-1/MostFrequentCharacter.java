import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFrequentCharacter {

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to input a string
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();
        
        // Close the scanner
        scanner.close();
        
        // Call the findMostFrequentChar method to find the most frequent character
        char mostFrequentChar = findMostFrequentChar(inputString);
        
        // Print the result
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
    }

    // Method to find the most frequent character in a string
    public static char findMostFrequentChar(String str) {
        // Create a map to store character frequencies
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        // Loop through each character in the string and count the occurrences
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        
        // Variable to store the most frequent character and its count
        char mostFrequentChar = str.charAt(0);
        int maxCount = 0;
        
        // Loop through the map to find the character with the highest frequency
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequentChar = entry.getKey();
            }
        }
        
        return mostFrequentChar;  // Return the most frequent character
    }
}
