import java.util.Scanner;

public class SumOfNaturalNumbersUsingMethod {

    // Method to calculate the sum of the first n natural numbers
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the number of natural numbers
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        if (n > 0) {
            // Calculating the sum of natural numbers
            int sum = calculateSum(n);

            // Displaying the result
            System.out.println("The sum of the first " + n + " natural numbers is " + sum + ".");
        } else {
            System.out.println("Please enter a positive integer.");
        }

        // Closing the scanner
        scanner.close();
    }
}
