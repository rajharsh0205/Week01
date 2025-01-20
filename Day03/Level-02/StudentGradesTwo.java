import java.util.Scanner;

public class StudentGradesTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();
		
        // Step 2: Create a 2D array to store marks for Physics, Chemistry, and Maths
        int[][] marks = new int[numberOfStudents][3]; // [Physics, Chemistry, Maths]
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];
		
        // Step 3: Take input for marks in Physics, Chemistry, and Maths
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
			
            // Input for Physics marks
            System.out.print("Enter Physics marks: ");
            marks[i][0] = sc.nextInt();
            while (marks[i][0] < 0) {  // Validate for negative marks
                System.out.print("Marks cannot be negative. Enter Physics marks again: ");
                marks[i][0] = sc.nextInt();
			}
			
            // Input for Chemistry marks
            System.out.print("Enter Chemistry marks: ");
            marks[i][1] = sc.nextInt();
            while (marks[i][1] < 0) {  // Validate for negative marks
                System.out.print("Marks cannot be negative. Enter Chemistry marks again: ");
                marks[i][1] = sc.nextInt();
			}
			
            // Input for Maths marks
            System.out.print("Enter Maths marks: ");
            marks[i][2] = sc.nextInt();
            while (marks[i][2] < 0) {  // Validate for negative marks
                System.out.print("Marks cannot be negative. Enter Maths marks again: ");
                marks[i][2] = sc.nextInt();
			}
			
            // Step 4: Calculate percentage
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks / 300) * 100;
			
            // Step 5: Calculate grade based on the percentage and provide feedback
            double percent = percentages[i];
			
            if (percent >= 80) {
                grades[i] = "Grade A, Level 4: above agency-normalized standards";
				} else if (percent >= 70 && percent <= 79) {
                grades[i] = "Grade B, Level 3: at agency-normalized standards";
				} else if (percent >= 60 && percent <= 69) {
                grades[i] = "Grade C, Level 2: below, but approaching agency-normalized standards";
				} else if (percent >= 50 && percent <= 59) {
                grades[i] = "Grade D, Level 1: well below agency-normalized standards";
				} else if (percent >= 40 && percent <= 49) {
                grades[i] = "Grade E, Level 1: too below agency-normalized standards";
				} else {
                grades[i] = "Grade R: Remedial standards";
			}
		}
		
        // Step 6: Display the marks, percentage, and grade for each student
        System.out.println("\nStudent Report:");
        System.out.println("Physics  Chemistry  Maths  Percentage  Grade");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(marks[i][0] + "        " + marks[i][1] + "        " + marks[i][2] + "        " + percentages[i] + "        " + grades[i]);
		}
		
        sc.close();
	}
}