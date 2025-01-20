import java.util.Scanner;

public class FizzBuzz2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the number is a positive integer
        if (number > 0) {
            // Initialize the counter variable for the while loop
            int i = 1;

            // Use the while loop to iterate from 1 to the entered number
            while (i <= number) {
                // Check if the number is divisible by both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // Check if the number is divisible by 3
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // Check if the number is divisible by 5
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                // If the number is neither divisible by 3 nor 5, print the number
                else {
                    System.out.println(i);
                }
                // Increment the counter
                i++;
            }
        } else {
            // If the user entered a non-positive number
            System.out.println("Please enter a positive integer.");
        }
    }
}
