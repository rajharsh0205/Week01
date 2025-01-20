import java.util.Scanner;

public class ChocolateDistributionUsingMethod {

    // Method to find the number of chocolates each child gets and the remaining chocolates
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;
        return new int[] {chocolatesPerChild, remainingChocolates};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the number of chocolates and number of children
        System.out.print("Enter the total number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        if (numberOfChildren > 0) {
            // Finding the number of chocolates each child gets and the remaining chocolates
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            // Displaying the result
            System.out.println("Each child will get " + result[0] + " chocolates.");
            System.out.println("The number of remaining chocolates is " + result[1] + ".");
        } else {
            System.out.println("Number of children must be greater than zero.");
        }

        // Closing the scanner
        scanner.close();
    }
}
