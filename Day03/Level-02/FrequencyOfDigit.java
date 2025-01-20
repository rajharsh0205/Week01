import java.util.Scanner;

public class FrequencyOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        // Step 1: Take input for a number
        System.out.print("Enter a number: ");
        long number = sc.nextLong();
		
        // Step 2: Initialize a frequency array of size 10
        int[] frequency = new int[10];
		
        // Step 3: Find the digits in the number and update the frequency array
        while (number > 0) {
            int digit = (int) (number % 10); // Extract the last digit
            frequency[digit]++; // Increase the frequency of the digit
            number /= 10; // Remove the last digit
		}
		
        // Step 4: Display the frequency of each digit
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
			}
		}
		
        sc.close();
	}
}