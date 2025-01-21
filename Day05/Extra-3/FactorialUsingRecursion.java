import java.util.Scanner;

public class FactorialUsingRecursion {

    public static void main(String[] args) {
        // Taking input from the user
        int number = getInput("Enter a number to calculate its factorial: ");
        
        // Calculating the factorial using recursion
        long factorial = calculateFactorial(number);
        
        // Displaying the result
        displayResult(number, factorial);
    }

    // Function to take input from the user
    public static int getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }

    // Recursive function to calculate the factorial of a number
    public static long calculateFactorial(int num) {
        // Base case: factorial of 0 or 1 is 1
        if (num == 0 || num == 1) {
            return 1;
        } else {
            // Recursive case: num * factorial of (num - 1)
            return num * calculateFactorial(num - 1);
        }
    }

    // Function to display the result
    public static void displayResult(int num, long factorial) {
        System.out.println("The factorial of " + num + " is: " + factorial);
    }
}
