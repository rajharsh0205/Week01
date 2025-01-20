import java.util.Scanner;

public class LargestDigitsFinder2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        // Initial size of the digits array
        int maxDigit = 10;
        long[] digits = new long[maxDigit];
        int index = 0;

        // Extract digits and store them in the array
        while (number != 0) {
            if (index == maxDigit) {
                // Increase the size of the array by 10
                maxDigit += 10;
                long[] temp = new long[maxDigit];
                
                // Copy elements from the old array to the new array
                System.arraycopy(digits, 0, temp, 0, digits.length);
                
                // Assign the new array to digits
                digits = temp;
            }
            digits[index] = number % 10;  // Get the last digit
            number /= 10;  // Remove the last digit
            index++;
        }

        // Variables to store the largest and second largest digits
        long largest = 0;
        long secondLargest = 0;

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
