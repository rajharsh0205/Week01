import java.util.Random;

public class EmployeeBonusCalculatorUsingMethod {

    // Method to generate salaries and years of service
    public static int[][] generateEmployeeData(int numEmployees) {
        Random rand = new Random();
        int[][] employeeData = new int[numEmployees][2]; // [salary, yearsOfService]

        for (int i = 0; i < numEmployees; i++) {
            employeeData[i][0] = 10000 + rand.nextInt(90000); // 5-digit salary
            employeeData[i][1] = rand.nextInt(10) + 1; // Years of service between 1 and 10
        }

        return employeeData;
    }

    // Method to calculate new salary and bonus
    public static double[][] calculateNewSalaryAndBonus(int[][] employeeData) {
        double[][] resultData = new double[employeeData.length][3]; // [oldSalary, bonus, newSalary]

        for (int i = 0; i < employeeData.length; i++) {
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonusPercentage = (yearsOfService > 5) ? 0.05 : 0.02;
            double bonus = oldSalary * bonusPercentage;
            double newSalary = oldSalary + bonus;

            resultData[i][0] = oldSalary;
            resultData[i][1] = bonus;
            resultData[i][2] = newSalary;
        }

        return resultData;
    }

    // Method to calculate and display the sum of old salary, new salary, and total bonus
    public static void displaySummary(double[][] salaryData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.printf("%-10s %-10s %-10s %-10s\n", "Employee", "Old Salary", "Bonus", "New Salary");
        for (int i = 0; i < salaryData.length; i++) {
            totalOldSalary += salaryData[i][0];
            totalBonus += salaryData[i][1];
            totalNewSalary += salaryData[i][2];

            System.out.printf("%-10d %-10.2f %-10.2f %-10.2f\n", (i + 1), salaryData[i][0], salaryData[i][1], salaryData[i][2]);
        }

        System.out.println("----------------------------------------------------");
        System.out.printf("%-10s %-10.2f %-10.2f %-10.2f\n", "Total", totalOldSalary, totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        int numEmployees = 10;

        // Generate employee data
        int[][] employeeData = generateEmployeeData(numEmployees);

        // Calculate new salary and bonus
        double[][] salaryData = calculateNewSalaryAndBonus(employeeData);

        // Display the summary
        displaySummary(salaryData);
    }
}
