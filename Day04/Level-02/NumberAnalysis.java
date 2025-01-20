import java.util.Scanner;

public class NumberAnalysis {

    // Method to check if a number is positive
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    // Method to check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 < number2) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Taking input for 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();

            // Check if the number is positive or negative
            if (isPositive(numbers[i])) {
                System.out.println("The number " + numbers[i] + " is positive.");
                // Check if it is even or odd
                if (isEven(numbers[i])) {
                    System.out.println("The number " + numbers[i] + " is even.");
                } else {
                    System.out.println("The number " + numbers[i] + " is odd.");
                }
            } else {
                System.out.println("The number " + numbers[i] + " is negative.");
            }
        }

        // Compare the first and last element
        int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);
        if (comparisonResult == 1) {
            System.out.println("The first number is greater than the last number.");
        } else if (comparisonResult == -1) {
            System.out.println("The first number is less than the last number.");
        } else {
            System.out.println("The first number is equal to the last number.");
        }

        scanner.close();
    }
}
