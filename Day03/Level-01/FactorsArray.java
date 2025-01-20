import java.util.Scanner;

public class FactorsArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Error: Please enter a positive integer.");
            scanner.close();
            return;
        }

        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Loop to find factors and store them in the factors array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Add factor to the array
                factors[index] = i;
                index++;

                // Check if we need to increase the array size
                if (index == maxFactor) {
                    // Double the size of the factors array
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    // Copy existing factors to the new array
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
            }
        }

        // Display the factors
        System.out.print("Factors of " + number + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        // Close the scanner
        scanner.close();
    }
}
