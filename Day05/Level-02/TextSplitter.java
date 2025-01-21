import java.util.Scanner;
import java.util.Arrays;

public class TextSplitter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[] customSplitWords = splitTextIntoWords(input);
        String[] builtInSplitWords = input.split(" ");

        boolean areEqual = compareStringArrays(customSplitWords, builtInSplitWords);

        System.out.println("Custom split words: " + Arrays.toString(customSplitWords));
        System.out.println("Built-in split words: " + Arrays.toString(builtInSplitWords));
        System.out.println("Are both splits equal? " + areEqual);
    }

    public static int findStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception indicates we've reached the end of the string
        }
        return count;
    }

    public static String[] splitTextIntoWords(String str) {
        int length = findStringLength(str);
        int[] spaceIndexes = new int[length];
        int spaceCount = 0;

        // Collecting indexes of spaces
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndexes[spaceCount++] = i;
            }
        }

        // Creating array for words
        String[] words = new String[spaceCount + 1];
        int start = 0;
        for (int i = 0; i <= spaceCount; i++) {
            int end = (i == spaceCount) ? length : spaceIndexes[i];
            words[i] = str.substring(start, end);
            start = end + 1;
        }

        return words;
    }

    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
}