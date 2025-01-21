import java.util.Scanner;

public class StudentRemarks {
	
    public static int[][] generateScores(int numberOfStudents) {
        int[][] scores = new int[numberOfStudents][3];
        
        for (int i = 0; i < numberOfStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int) (Math.random() * 100) + 1;
			}
		}
        return scores;
	}
    
    public static double[][] calculateResults(int[][] scores) {
        int numberOfStudents = scores.length;
        double[][] results = new double[numberOfStudents][4];
        
        for (int i = 0; i < numberOfStudents; i++) {
            double total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
			}
            double average = total / 3;
            double percentage = (total / 300) * 100;
            
            results[i][0] = Math.round(total * 100.0) / 100.0; // Total, rounded to 2 decimal places
            results[i][1] = Math.round(average * 100.0) / 100.0; // Average, rounded to 2 decimal places
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Percentage, rounded to 2 decimal places
		}
        return results;
	}
    
    public static String[][] calculateGrades(double[][] results) {
        int numberOfStudents = results.length;
        String[][] grades = new String[numberOfStudents][1];
        
        for (int i = 0; i < numberOfStudents; i++) {
            double percentage = results[i][2];
            if (percentage >= 80) {
                grades[i][0] = "A";
				} else if (percentage >= 70) {
                grades[i][0] = "B";
				} else if (percentage >= 60) {
                grades[i][0] = "C";
				} else if (percentage >= 50) {
                grades[i][0] = "D";
				} else if (percentage >= 40) {
                grades[i][0] = "E";
				} else {
                grades[i][0] = "R";
			}
		}
        return grades;
	}
	
    // Method to display the scorecard in a tabular format
    public static void displayScorecard(int[][] scores, double[][] results, String[][] grades) {
        System.out.println("Student No | Physics | Chemistry | Math | Total | Average | Percentage | Grade");
        
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Student " + (i + 1) + " | ");
            for (int j = 0; j < 3; j++) {
                System.out.print(scores[i][j] + "    |    ");
			}
            System.out.print(results[i][0] + "    |    " + results[i][1] + "     |     " + results[i][2] + "     |     " + grades[i][0]);
            System.out.println();
		}
	}
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();
        
        int[][] scores = generateScores(numberOfStudents);
        
        double[][] results = calculateResults(scores);
        
        String[][] grades = calculateGrades(results);
        
        displayScorecard(scores, results, grades);
        
        input.close();
	}
}