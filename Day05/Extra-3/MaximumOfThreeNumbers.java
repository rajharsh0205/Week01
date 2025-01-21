import java.util.Scanner;

public class MaximumOfThreeNumbers {

    public static void main(String[] args) {
        // Taking three numbers as input from the user
        int num1 = getInput("Enter the first number: ");
        int num2 = getInput("Enter the second number: ");
        int num3 = getInput("Enter the third number: ");
        
        // Calculating the maximum of the three numbers
        int max = findMaximum(num1, num2, num3);
        
        // Display the maximum number
        System.out.println("The maximum number is: " + max);
    }

    // Function to take input from the user
    public static int getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }

    // Function to find the maximum of three numbers
    public static int findMaximum(int num1, int num2, int num3) {
        int max = num1;  // Assume num1 is the largest
        if (num2 > max) {
            max = num2;  // If num2 is larger, update max
        }
        if (num3 > max) {
            max = num3;  // If num3 is larger, update max
        }
        return max;
    }
}
