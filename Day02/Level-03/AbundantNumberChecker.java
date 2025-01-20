import java.util.Scanner;

public class AbundantNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer to check if it's an Abundant Number: ");
        int number = scanner.nextInt();

        // Initialize sum to 0 to store the sum of divisors
        int sum = 0;

        // Loop to find and sum the divisors of the number
        for (int i = 1; i < number; i++) {
            // Check if i is a divisor of number
            if (number % i == 0) {
                // Add the divisor to sum
                sum += i;
            }
        }

        // Check if the sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }
    }
}
