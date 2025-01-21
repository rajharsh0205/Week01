import java.util.Scanner;

public class StringLengthFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();

        int customLength = findStringLength(input);
        int builtInLength = input.length();

        System.out.println("Custom method length: " + customLength);
        System.out.println("Built-in method length: " + builtInLength);
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
}
