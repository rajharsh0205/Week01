import java.util.Scanner;

public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it is an Armstrong number: ");
        int number = scanner.nextInt();

        // Initialize sum to 0 and assign the input number to originalNumber
        int sum = 0;
        int originalNumber = number;

        // Loop to find the sum of the cubes of each digit
        while (originalNumber != 0) {
            // Find the remainder (last digit) of the originalNumber
            int remainder = originalNumber % 10;

            // Cube the remainder and add it to the sum
            sum += remainder * remainder * remainder;

            // Remove the last digit from the originalNumber
            originalNumber /= 10;
        }

        // Check if the sum of cubes is equal to the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
