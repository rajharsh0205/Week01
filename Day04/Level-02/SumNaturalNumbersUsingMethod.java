import java.util.Scanner;

public class SumNaturalNumbersUsingMethod {

    // Recursive method to find the sum of n natural numbers
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumUsingRecursion(n - 1);
    }

    // Method to find the sum of n natural numbers using the formula
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the number
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        // Checking if the number is a natural number
        if (n <= 0) {
            System.out.println("The entered number is not a natural number.");
        } else {
            // Calculating the sum using recursion
            int sumRecursion = sumUsingRecursion(n);

            // Calculating the sum using the formula
            int sumFormula = sumUsingFormula(n);

            // Displaying the results
            System.out.println("Sum of first " + n + " natural numbers (using recursion): " + sumRecursion);
            System.out.println("Sum of first " + n + " natural numbers (using formula): " + sumFormula);

            // Comparing and confirming the results
            if (sumRecursion == sumFormula) {
                System.out.println("Both methods yield the same result.");
            } else {
                System.out.println("There is a discrepancy between the two methods.");
            }
        }

        // Closing the scanner
        scanner.close();
    }
}
