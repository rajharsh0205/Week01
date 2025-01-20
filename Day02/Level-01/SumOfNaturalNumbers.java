import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        // Check if the number is a natural number (positive integer)
        if (n > 0) {
            // Compute sum using the formula
            int sumFormula = n * (n + 1) / 2;

            // Compute sum using while loop
            int sumWhileLoop = 0;
            int counter = 1;
            while (counter <= n) {
                sumWhileLoop += counter;
                counter++;
            }

            // Compare results
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using while loop: " + sumWhileLoop);

            // Check if both sums are the same
            if (sumFormula == sumWhileLoop) {
                System.out.println("Both computations are correct and the results match.");
            } else {
                System.out.println("There is an error in the computation.");
            }
        } else {
            System.out.println("The number entered is not a natural number.");
        }
    }
}
