import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {
        // Taking input from the user
        int number = getInput("Enter a number to check if it's prime: ");
        
        // Checking if the number is prime
        boolean isPrime = isPrime(number);
        
        // Output the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Function to take input from the user
    public static int getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        // Numbers less than 2 are not prime
        if (num <= 1) {
            return false;
        }
        
        // Check divisibility from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // If divisible, it's not a prime number
            }
        }
        
        return true; // If no divisors were found, it's a prime number
    }
}
