import java.util.Scanner;

public class CharacterTypeIdentifier {

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char ch) {
        // Convert uppercase to lowercase using ASCII values
        if (ch >= 'A' && ch <= 'Z') {
            ch += 32; // Convert to lowercase
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

    // Method to find vowels and consonants in a string and return the result in a 2D array
    public static String[][] findCharacterTypes(String text) {
        int length = text.length();
        String[][] result = new String[length][2];

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            String type = checkCharacterType(ch);
            result[i][0] = String.valueOf(ch);
            result[i][1] = type;
        }

        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayCharacterTypes(String[][] characterTypes) {
        System.out.println("\nCharacter\tType");
        System.out.println("------------------------");
        for (String[] pair : characterTypes) {
            System.out.println(pair[0] + "\t\t" + pair[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Find character types
        String[][] characterTypes = findCharacterTypes(text);

        // Display the results
        displayCharacterTypes(characterTypes);

        scanner.close();
    }
}
