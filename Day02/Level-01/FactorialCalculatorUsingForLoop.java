import java.util.Scanner;

public class FactorialCalculatorUsingForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the number is positive
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Initialize factorial to 1 (as 0! = 1)
            long factorial = 1;

            // Calculate factorial using a for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i;  // Multiply factorial by i
            }

            // Print the factorial
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
    }
}
