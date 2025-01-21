import java.util.Scanner;

public class WordLengthSplitter {

    // Method to split text into words without using String.split() or StringBuilder
    public static String[] splitTextIntoWords(String text) {
        int n = text.length();
        int wordCount = 0;

        // Count the number of words to initialize the array
        boolean isWord = false;
        for (int i = 0; i < n; i++) {
            char ch = text.charAt(i);
            if (Character.isWhitespace(ch)) {
                if (isWord) {
                    wordCount++;
                    isWord = false;
                }
            } else {
                isWord = true;
            }
        }
        if (isWord) {
            wordCount++;
        }

        // Initialize the array
        String[] words = new String[wordCount];
        char[] temp = new char[n];
        int wordStart = 0, index = 0;
        isWord = false;

        for (int i = 0; i < n; i++) {
            char ch = text.charAt(i);
            if (Character.isWhitespace(ch)) {
                if (isWord) {
                    words[index++] = new String(temp, wordStart, i - wordStart);
                    wordStart = 0;
                    isWord = false;
                }
            } else {
                if (!isWord) {
                    wordStart = i;
                }
                temp[i] = ch;
                isWord = true;
            }
        }
        if (isWord) {
            words[index] = new String(temp, wordStart, n - wordStart);
        }

        return words;
    }

    // Method to find length of a string without using length() method
    public static int findStringLength(String word) {
        int length = 0;
        for (char ignored : word.toCharArray()) {
            length++;
        }
        return length;
    }

    // Method to convert words and their lengths into a 2D String array
    public static String[][] convertTo2DArray(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String length = String.valueOf(findStringLength(word));
            result[i][0] = word;
            result[i][1] = length;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        // Split text into words
        String[] words = splitTextIntoWords(text);

        // Convert to 2D array with word and length
        String[][] wordLengthArray = convertTo2DArray(words);

        // Display in tabular format
        System.out.println("\nWord\tLength");
        System.out.println("----------------");
        for (String[] pair : wordLengthArray) {
            System.out.println(pair[0] + "\t" + Integer.parseInt(pair[1]));
        }

        scanner.close();
    }
}
