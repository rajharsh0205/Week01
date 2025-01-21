import java.util.Scanner;

public class GCDandLCMCalculator {

    public static void main(String[] args) {
        // Taking input from the user for two numbers
        int num1 = getInput("Enter the first number: ");
        int num2 = getInput("Enter the second number: ");
        
        // Calculating the GCD and LCM of the two numbers
        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2, gcd);
        
        // Displaying the results
        displayResults(gcd, lcm);
    }

    // Function to take input from the user
    public static int getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }

    // Function to calculate the Greatest Common Divisor (GCD)
    public static int calculateGCD(int num1, int num2) {
        // Using Euclidean algorithm to calculate GCD
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    // Function to calculate the Least Common Multiple (LCM)
    public static int calculateLCM(int num1, int num2, int gcd) {
        // Formula: LCM(a, b) = (a * b) / GCD(a, b)
        return (num1 * num2) / gcd;
    }

    // Function to display the results
    public static void displayResults(int gcd, int lcm) {
        System.out.println("Greatest Common Divisor (GCD): " + gcd);
        System.out.println("Least Common Multiple (LCM): " + lcm);
    }
}
