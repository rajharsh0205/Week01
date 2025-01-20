import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Initialize factorial to 1 (as 0! = 1)
            long factorial = 1;
            int i = 1;

            // Calculate factorial using a while loop
            while (i <= number) {
                factorial *= i;  // Multiply factorial by i
                i++;  // Increment i
            }

            // Print the factorial
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
    }
}
