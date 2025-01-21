import java.util.Scanner;

public class VotingEligibility {

    // Method to generate random 2-digit ages for the given number of students
    public static int[] generateAges(int numberOfStudents) {
        int[] ages = new int[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            ages[i] = (int) (Math.random() * 90 + 10); // Generate random age between 10 and 99
        }
        return ages;
    }

    // Method to check voting eligibility and return 2D String array
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            result[i][0] = String.valueOf(age);
            if (age < 0) {
                result[i][1] = "Cannot Vote (Invalid Age)";
            } else if (age >= 18) {
                result[i][1] = "Can Vote";
            } else {
                result[i][1] = "Cannot Vote";
            }
        }
        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayEligibility(String[][] eligibility) {
        System.out.println("\nAge\t\tEligibility");
        System.out.println("-------------------------");
        for (String[] entry : eligibility) {
            System.out.println(entry[0] + "\t\t" + entry[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for number of students (assuming 10)
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Generate random ages for the students
        int[] ages = generateAges(numberOfStudents);

        // Check voting eligibility
        String[][] eligibility = checkVotingEligibility(ages);

        // Display the results
        displayEligibility(eligibility);

        scanner.close();
    }
}
