import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a natural number (greater than 0)
        if (number < 1) {
            System.out.println("Please enter a valid natural number greater than 0.");
        } else {
            // Using a for loop to iterate through numbers from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                // Check if the current number is even or odd
                if (i % 2 == 0) {
                    System.out.println(i + " is even.");
                } else {
                    System.out.println(i + " is odd.");
                }
            }
        }
    }
}
