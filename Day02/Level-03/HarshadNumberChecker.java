import java.util.Scanner;

public class HarshadNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer to check if it's a Harshad Number: ");
        int number = scanner.nextInt();

        // Store the original number for final comparison
        int originalNumber = number;

        // Initialize sum to 0 to store the sum of digits
        int sum = 0;

        // Loop to calculate the sum of digits of the number
        while (number != 0) {
            // Get the last digit using modulus operator
            int digit = number % 10;

            // Add the digit to the sum
            sum += digit;

            // Remove the last digit from number
            number /= 10;
        }

        // Check if the original number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number.");
        }
    }
}
