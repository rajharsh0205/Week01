import java.util.Scanner;

public class NumberCheckUsingMethod {

    // Method to check whether the number is positive, negative, or zero
    public static int checkNumber(int number) {
        if (number > 0) {
            return 1;  // Positive number
        } else if (number < 0) {
            return -1; // Negative number
        } else {
            return 0;  // Zero
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Checking the number
        int result = checkNumber(number);

        // Displaying the result
        if (result == 1) {
            System.out.println("The number is positive.");
        } else if (result == -1) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        scanner.close();
    }
}
