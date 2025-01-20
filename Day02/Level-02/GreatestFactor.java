import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Variable to store the greatest factor
        int greatestFactor = 1;

        // Loop to find the greatest factor of the number (excluding the number itself)
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break; // Break the loop once the greatest factor is found
            }
        }

        // Display the greatest factor
        System.out.println("The greatest factor of " + number + " (other than itself) is: " + greatestFactor);
    }
}
