import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is greater than 1
        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
        } else {
            // Initialize a boolean variable to check if the number is prime
            boolean isPrime = true;

            // Loop through all numbers from 2 to the square root of the number
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;  // The number is divisible by 'i' and thus not prime
                    break;  // No need to check further, we found a divisor
                }
            }

            // Output the result
            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }
    }
}
