import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();
		
        // Step 2: Create arrays to store marks, percentages, and grades
        int[] physicsMarks = new int[numberOfStudents];
        int[] chemistryMarks = new int[numberOfStudents];
        int[] mathsMarks = new int[numberOfStudents];
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];
		
        // Step 3: Take input for marks in Physics, Chemistry, and Maths
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
			
            // Input for Physics marks
            System.out.print("Enter Physics marks: ");
            physicsMarks[i] = sc.nextInt();
            while (physicsMarks[i] < 0 || physicsMarks[i] > 100) {  // Validate for negative marks
                System.out.print("Marks cannot be negative or more than 100. Enter Physics marks again: ");
                physicsMarks[i] = sc.nextInt();
			}
			
            // Input for Chemistry marks
            System.out.print("Enter Chemistry marks: ");
            chemistryMarks[i] = sc.nextInt();
            while (chemistryMarks[i] < 0 || chemistryMarks[i] > 100) {  // Validate for negative marks
                System.out.print("Marks cannot be negative or more than 100. Enter Chemistry marks again: ");
                chemistryMarks[i] = sc.nextInt();
			}
			
            // Input for Maths marks
            System.out.print("Enter Maths marks: ");
            mathsMarks[i] = sc.nextInt();
            while (mathsMarks[i] < 0 || mathsMarks[i] > 100) {  // Validate for negative marks
                System.out.print("Marks cannot be negative or more than 100. Enter Maths marks again: ");
                mathsMarks[i] = sc.nextInt();
			}
			
            // Step 4: Calculate percentage
            double totalMarks = physicsMarks[i] + chemistryMarks[i] + mathsMarks[i];
            percentages[i] = (totalMarks / 300) * 100;
			
			
			// Step 5: Calculate grade based on the percentage and provide feedback
            double percent = percentages[i];
            
            if (percent >= 80) {
                System.out.println("Average marks obtained is " + percent);
                System.out.println("Grade A, Level 4: above agency-normalized standards");
				} else if (percent >= 70 && percent <= 79) {
                System.out.println("Average marks obtained is " + percent);
                System.out.println("Grade B, Level 3: at agency-normalized standards");
				} else if (percent >= 60 && percent <= 69) {
                System.out.println("Average marks obtained is " + percent);
                System.out.println("Grade C, Level 2: below, but approaching agency-normalized standards");
				} else if (percent >= 50 && percent <= 59) {
                System.out.println("Average marks obtained is " + percent);
                System.out.println("Grade D, Level 1: well below agency-normalized standards");
				} else if (percent >= 40 && percent <= 49) {
                System.out.println("Average marks obtained is " + percent);
                System.out.println("Grade E, Level 1: too below agency-normalized standards");
				} else {
                System.out.println("Average marks and percent obtained is " + percent);
                System.out.println("Grade R: Remedial standards");
			}
		}
		
        sc.close();
	}
}