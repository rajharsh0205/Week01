import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer to count its digits: ");
        int number = scanner.nextInt();

        // Initialize count to 0 to store the number of digits
        int count = 0;

        // If the number is 0, it has exactly one digit
        if (number == 0) {
            count = 1;
        } else {
            // Loop to count the number of digits
            while (number != 0) {
                // Remove the last digit from number
                number /= 10;

                // Increment the count
                count++;
            }
        }

        // Display the total number of digits
        System.out.println("The number of digits is: " + count);
    }
}
