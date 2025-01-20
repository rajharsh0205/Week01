import java.util.Scanner;

public class TriangularParkRunUsingMethod {

    // Method to calculate the perimeter of the triangular park
    public static double calculatePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    // Method to calculate the number of rounds needed for a 5 km run
    public static int calculateRounds(double perimeter) {
        final double distanceToRun = 5000.0; // 5 km in meters
        return (int) Math.ceil(distanceToRun / perimeter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the three sides of the triangular park
        System.out.print("Enter the first side of the triangle in meters: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the second side of the triangle in meters: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the third side of the triangle in meters: ");
        double side3 = scanner.nextDouble();

        // Calculating the perimeter of the triangle
        double perimeter = calculatePerimeter(side1, side2, side3);

        // Calculating the number of rounds needed
        int rounds = calculateRounds(perimeter);

        // Displaying the result
        System.out.println("The athlete needs to complete " + rounds + 
                           " rounds to cover 5 km.");

        scanner.close();
    }
}
