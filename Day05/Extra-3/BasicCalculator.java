import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        // Taking input from the user for two numbers and the operation
        double num1 = getInput("Enter the first number: ");
        double num2 = getInput("Enter the second number: ");
        
        // Displaying the menu of operations
        System.out.println("Select an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        
        // Taking the operation choice
        int choice = getChoice();
        
        // Performing the operation based on the user's choice
        double result = 0;
        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = subtract(num1, num2);
                break;
            case 3:
                result = multiply(num1, num2);
                break;
            case 4:
                if (num2 != 0) {
                    result = divide(num1, num2);
                } else {
                    System.out.println("Error! Division by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }
        
        // Displaying the result
        System.out.println("Result: " + result);
    }

    // Function to take input from the user
    public static double getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    // Function to display the menu and get the operation choice
    public static int getChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice (1-4): ");
        return scanner.nextInt();
    }

    // Function to perform addition
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Function to perform subtraction
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Function to perform multiplication
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Function to perform division
    public static double divide(double num1, double num2) {
        return num1 / num2;
    }
}
