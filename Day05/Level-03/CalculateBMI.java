import java.util.Scanner;

public class CalculateBMI {
	
    // Method to calculate BMI and determine the status for each person
    public static String[][] calculateBMIAndStatus(double[][] data) {
        String[][] result = new String[data.length][4];
        
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100;
            double bmi = weight / (heightInMeters * heightInMeters);
            
            result[i][0] = String.format("%.2f", data[i][1]);  // height in cm
            result[i][1] = String.format("%.2f", data[i][0]);  // weight in kg
            result[i][2] = String.format("%.2f", bmi);         // BMI
            result[i][3] = determineBMIStatus(bmi);        // BMI status
		}
        
        return result;
	}
	
    private static String determineBMIStatus(double bmi) {
        if (bmi < 18.4) {
            return "Underweight";  
			} else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
			} else if (bmi >= 25.0 && bmi <= 39.9) {
            return "Overweight";
			} else if(bmi >= 40.0){
            return "Obese";
		}
		return "Invalid BMI";
	}
	
	public static void displayBMIResult(String[][] result) {
		System.out.println("\nPerson | Height (cm) | Weight (kg) | BMI    | Status");
		System.out.println("---------------------------------------------------------");
		
		for (int i = 0; i < result.length; i++) {
			System.out.println((i + 1) + "       | " + result[i][0] + "        | " 
			+ result[i][1] + "        | " + result[i][2] + "    | " + result[i][3]);
		}
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double[][] data = new double[10][2];
		
        for (int i = 0; i < 10; i++) {
			
            System.out.print("Enter weight (kg): ");
            data[i][0] = sc.nextDouble(); 
            System.out.print("Enter height (cm): ");
            data[i][1] = sc.nextDouble();
		}
        
        String[][] result = calculateBMIAndStatus(data);
        
        displayBMIResult(result);
        
        sc.close();
	}
}
