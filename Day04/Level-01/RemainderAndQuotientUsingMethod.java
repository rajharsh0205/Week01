import java.util.Scanner;

public class RemainderAndQuotientUsingMethod {

    // Method to find the remainder and quotient of a number
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[] {quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the two numbers
        System.out.print("Enter the dividend (number): ");
        int number = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        if (divisor != 0) {
            // Finding the remainder and quotient
            int[] result = findRemainderAndQuotient(number, divisor);

            // Displaying the result
            System.out.println("The quotient is " + result[0] + ".");
            System.out.println("The remainder is " + result[1] + ".");
        } else {
            System.out.println("Divisor cannot be zero.");
        }

        // Closing the scanner
        scanner.close();
    }
}
