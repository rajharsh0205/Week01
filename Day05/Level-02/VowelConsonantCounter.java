import java.util.Scanner;

public class VowelConsonantCounter {

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char ch) {
        // Convert uppercase to lowercase
        if (ch >= 'A' && ch <= 'Z') {
            ch += 32; // Adding 32 to convert to lowercase using ASCII
        }

        // Check if character is a letter
        if (ch >= 'a' && ch <= 'z') {
            // Check if character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Method to count vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String text) {
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            String result = checkCharacterType(ch);

            if ("Vowel".equals(result)) {
                vowels++;
            } else if ("Consonant".equals(result)) {
                consonants++;
            }
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Count vowels and consonants
        int[] counts = countVowelsAndConsonants(text);

        // Display the results
        System.out.println("\nNumber of Vowels: " + counts[0]);
        System.out.println("Number of Consonants: " + counts[1]);

        scanner.close();
    }
}
