import java.util.Scanner;

public class WordLengthAnalysis {

    // Method to split text into words without using String.split()
    public static String[] splitTextIntoWords(String text) {
        int n = text.length();
        int wordCount = 0;
        boolean isWord = false;

        // Count the number of words to initialize the array
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

    // Method to find the shortest and longest words
    public static int[] findShortestAndLongest(String[][] wordLengthArray) {
        int shortestIndex = 0;
        int longestIndex = 0;

        for (int i = 1; i < wordLengthArray.length; i++) {
            int currentLength = Integer.parseInt(wordLengthArray[i][1]);
            int shortestLength = Integer.parseInt(wordLengthArray[shortestIndex][1]);
            int longestLength = Integer.parseInt(wordLengthArray[longestIndex][1]);

            if (currentLength < shortestLength) {
                shortestIndex = i;
            }
            if (currentLength > longestLength) {
                longestIndex = i;
            }
        }

        return new int[]{shortestIndex, longestIndex};
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

        // Find shortest and longest words
        int[] indices = findShortestAndLongest(wordLengthArray);
        String shortestWord = wordLengthArray[indices[0]][0];
        String longestWord = wordLengthArray[indices[1]][0];

        // Display the results
        System.out.println("\nShortest word: " + shortestWord + " (Length: " + wordLengthArray[indices[0]][1] + ")");
        System.out.println("Longest word: " + longestWord + " (Length: " + wordLengthArray[indices[1]][1] + ")");

        scanner.close();
    }
}
