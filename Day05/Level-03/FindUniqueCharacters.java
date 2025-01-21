import java.util.Scanner;

public class FindUniqueCharacters {

    // Method to find the length of the string without using length()
    private static int findLength(String str) {
        int length = 0;
        for (char ch : str.toCharArray()) {
            length++;
        }
        return length;
    }

    // Method to find unique characters in the string
    private static char[] findUniqueCharacters(String str) {
        int length = findLength(str); // Custom length method
        char[] result = new char[length];
        int index = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            boolean isUnique = true;

            // Check if the current character is repeated in the string
            for (int j = 0; j < length; j++) {
                if (i != j && currentChar == str.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            // Add to result if the character is truly unique
            if (isUnique) {
                result[index++] = currentChar;
            }
        }

        // Create a new array to store only the unique characters
        char[] uniqueChars = new char[index];
        for (int i = 0; i < index; i++) {
            uniqueChars[i] = result[i];
        }

        return uniqueChars;
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Sentence: ");
        String string = input.nextLine();

        char[] uniqueChars = findUniqueCharacters(string);

        System.out.println("Unique characters in the string:");
        for (char ch : uniqueChars) {
            System.out.print(ch + " ");
        }

        input.close();
    }
}
