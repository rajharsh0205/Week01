import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        // Create a scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        // Get salary and years of service from the user
        System.out.print("Enter the salary of the employee: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter the years of service: ");
        int yearsOfService = scanner.nextInt();

        // Calculate the bonus based on years of service
        double bonus = 0;

        // If the years of service is more than 5, give a 5% bonus
        if (yearsOfService > 5) {
            bonus = salary * 0.05;
        }

        // Print the bonus amount
        System.out.println("The bonus for the employee is INR " + bonus);
    }
}
