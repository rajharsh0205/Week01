import java.util.Scanner;

public class CalculateStudentMarksUsingMethod {
	
    // Method to generate random marks between 0 and 100
    public static int generateRandomMarks() {
        return (int) Math.floor(Math.random() * 101);
	}
	
    // Method to calculate total, average, and percentage
    public static double[][] calculateResults(int[] physics, int[] chemistry, int[] maths) {
        int numberOfStudents = physics.length;
        double[][] results = new double[numberOfStudents][3];
        for (int i = 0; i < numberOfStudents; i++) {
            int total = physics[i] + chemistry[i] + maths[i];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
			
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
		}
        return results;
	}
	
    // Method to display the scorecard
    public static void displayScorecard(int[] physics, int[] chemistry, int[] maths, double[][] results) {
        System.out.println("\nScorecard:");
        System.out.println("Student\t\tPhysics\t\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        for (int i = 0; i < physics.length; i++) {
            System.out.println(
				"Student " + (i + 1) + "\t" +
				physics[i] + "\t\t" +
				chemistry[i] + "\t\t" +
				maths[i] + "\t" +
				(int) results[i][0] + "\t" +
				results[i][1] + "\t" +
			results[i][2] + "%");
		}
	}
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
		
        int[] physicsMarks = new int[numberOfStudents];
        int[] chemistryMarks = new int[numberOfStudents];
        int[] mathsMarks = new int[numberOfStudents];
		
        for (int i = 0; i < numberOfStudents; i++) {
            physicsMarks[i] = generateRandomMarks();
            chemistryMarks[i] = generateRandomMarks();
            mathsMarks[i] = generateRandomMarks();
		}
		
        double[][] results = calculateResults(physicsMarks, chemistryMarks, mathsMarks);
		
        displayScorecard(physicsMarks, chemistryMarks, mathsMarks, results);
	}
	
}