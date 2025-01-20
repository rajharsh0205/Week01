import java.util.Scanner;

class BmiIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        System.out.println("Enter weight in kg:");
        double weight = input.nextDouble();
		
        System.out.println("Enter height in cm:");
        double heightInCm = input.nextDouble();
		
        // Convert height to meters
        double heightInM = heightInCm / 100;
		
        // Calculate BMI
        double bmi = weight / (heightInM * heightInM);
		
        // Display BMI
        System.out.println("Your BMI is: " + bmi);
		
        // Determine weight status based on BMI
        if (bmi < 18.5) {
            System.out.println("You are underweight ");
			} else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("You have a normal weight ");
			} else if (bmi >= 25 && bmi < 39.9) {
            System.out.println("You are overweight ");
			}  else {
            System.out.println("You are Obese ");
		}
		
        input.close();
	}
}