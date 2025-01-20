import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of persons: ");
        int numPersons = scanner.nextInt();
        
        // Create arrays to store weight, height, BMI, and weight status
        double[] weights = new double[numPersons];
        double[] heights = new double[numPersons];
        double[] bmis = new double[numPersons];
        String[] weightStatus = new String[numPersons];
        
        // Input weight and height for each person
        for (int i = 0; i < numPersons; i++) {
            System.out.println("\nEnter details for person " + (i + 1) + ":");
            System.out.print("Enter weight (in kg): ");
            weights[i] = scanner.nextDouble();
            System.out.print("Enter height (in meters): ");
            heights[i] = scanner.nextDouble();
            
            // Calculate BMI (BMI = weight / (height * height))
            bmis[i] = weights[i] / (heights[i] * heights[i]);
            
            // Determine weight status based on BMI
            if (bmis[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmis[i] >= 18.5 && bmis[i] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmis[i] >= 25 && bmis[i] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }
        
        for (int i = 0; i < numPersons; i++) {
            System.out.println("\nPerson " + (i + 1) + " Details:");
            System.out.println("----------------------------------------");
            System.out.println("Height: " + heights[i] + " meters");
            System.out.println("Weight: " + weights[i] + " kg");
            System.out.println("BMI: " + String.format("%.2f", bmis[i]));
            System.out.println("Weight Status: " + weightStatus[i]);
            System.out.println();
        }
    }
}
