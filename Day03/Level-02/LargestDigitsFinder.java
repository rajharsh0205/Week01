import java.util.Scanner;

public class LargestDigitsFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Define the maximum number of digits
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits and store them in the array
        while (number != 0) {
            if (index == maxDigit) {
                System.out.println("Maximum digit limit reached.");
                break;
            }
            digits[index] = number % 10;  // Get the last digit
            number /= 10;  // Remove the last digit
            index++;
        }

        // Variables to store the largest and second largest digits
        int largest = 0;
        int secondLargest = 0;

        // Find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display the largest and second largest digits
        System.out.println("The largest digit is: " + largest);
        System.out.println("The second largest digit is: " + secondLargest);
    }
}
