import java.util.Scanner;

public class BMICalculatorUsingmethod {

    // Method to calculate BMI
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100; // Convert cm to meters
            double bmi = weight / (heightInMeters * heightInMeters);
            data[i][2] = bmi;
        }
    }

    // Method to determine BMI status
    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][3]; // Array to store weight, height, and BMI

        // Input for weight and height
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Enter height (in cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
        }

        // Calculate BMI and populate the array
        calculateBMI(data);

        // Determine BMI status
        String[] bmiStatus = determineBMIStatus(data);

        // Display the results
        System.out.println("\nPerson | Weight (kg) | Height (cm) | BMI       | Status");
        System.out.println("------------------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("  Weight (kg): " + data[i][0]);
            System.out.println("  Height (cm): " + data[i][1]);
            System.out.println("  BMI: " + data[i][2]);
            System.out.println("  Status: " + bmiStatus[i]);
        }

        scanner.close();
    }
}
