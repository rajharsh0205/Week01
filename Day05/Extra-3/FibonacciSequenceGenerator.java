import java.util.Scanner;

public class FibonacciSequenceGenerator {

    public static void main(String[] args) {
        // Taking input from the user for the number of terms
        int terms = getInput("Enter the number of terms in the Fibonacci sequence: ");
        
        // Generating and printing the Fibonacci sequence
        printFibonacciSequence(terms);
    }

    // Function to take input from the user
    public static int getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }

    // Function to generate and print the Fibonacci sequence
    public static void printFibonacciSequence(int terms) {
        // Handling edge cases when terms is less than or equal to 0
        if (terms <= 0) {
            System.out.println("Please enter a positive integer for the number of terms.");
            return;
        }
        
        // Initializing the first two terms of the Fibonacci sequence
        long first = 0, second = 1;
        
        // Printing the Fibonacci sequence up to the specified number of terms
        System.out.println("Fibonacci sequence up to " + terms + " terms:");
        
        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            
            // Calculate the next term in the Fibonacci sequence
            long nextTerm = first + second;
            first = second;
            second = nextTerm;
        }
        
        System.out.println(); // New line after printing the sequence
    }
}
