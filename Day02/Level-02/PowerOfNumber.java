import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take integer input for the base number
        System.out.print("Enter the base number: ");
        int number = scanner.nextInt();

        // Take integer input for the power
        System.out.print("Enter the power: ");
        int power = scanner.nextInt();

        // Initialize the result variable to 1
        int result = 1;

        // Loop to calculate the power
        for (int i = 1; i <= power; i++) {
            result *= number; // Multiply the result by the number
        }

        // Print the final result
        System.out.println("The result of " + number + " raised to the power of " + power + " is: " + result);
    }
}
