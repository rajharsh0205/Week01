import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constants
        int numEmployees = 10;
        double bonusMoreThan5Years = 0.05;
        double bonusLessThan5Years = 0.02;

        // Arrays to store data for each employee
        double[] salaries = new double[numEmployees];
        int[] yearsOfService = new int[numEmployees];
        double[] bonuses = new double[numEmployees];
        double[] newSalaries = new double[numEmployees];

        // Variables to store total amounts
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // Input loop for salaries and years of service
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter details for Employee " + (i + 1));

            // Input validation for salary
            while (true) {
                System.out.print("Enter salary: ");
                double salary = scanner.nextDouble();
                if (salary > 0) {
                    salaries[i] = salary;
                    break;
                } else {
                    System.out.println("Invalid salary. Please enter a positive number.");
                }
            }

            // Input validation for years of service
            while (true) {
                System.out.print("Enter years of service: ");
                int years = scanner.nextInt();
                if (years >= 0) {
                    yearsOfService[i] = years;
                    break;
                } else {
                    System.out.println("Invalid years of service. Please enter a non-negative number.");
                }
            }
        }

        // Calculating bonuses and new salaries
        for (int i = 0; i < numEmployees; i++) {
            double salary = salaries[i];
            int years = yearsOfService[i];

            // Determine bonus percentage
            double bonusPercentage = (years > 5) ? bonusMoreThan5Years : bonusLessThan5Years;

            // Calculate bonus and new salary
            double bonus = salary * bonusPercentage;
            double newSalary = salary + bonus;

            // Store results
            bonuses[i] = bonus;
            newSalaries[i] = newSalary;

            // Update totals
            totalBonus += bonus;
            totalOldSalary += salary;
            totalNewSalary += newSalary;
        }

        // Display results
        System.out.println("\nTotal bonus payout: " + totalBonus);
        System.out.println("Total old salary: " + totalOldSalary);
        System.out.println("Total new salary: " + totalNewSalary);

        // Display each employee's new salary and bonus
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Employee " + (i + 1) + ": Old Salary = " + salaries[i] +
                    ", Bonus = " + bonuses[i] + ", New Salary = " + newSalaries[i]);
        }
    }
}
