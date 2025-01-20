import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays to store ages and heights of the three friends
        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Input ages and heights for the three friends
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + names[i] + ":");

            // Input age
            System.out.print("Enter age: ");
            ages[i] = scanner.nextInt();

            // Input height
            System.out.print("Enter height (in cm): ");
            heights[i] = scanner.nextDouble();
        }

        // Initialize variables to find the youngest and tallest friend
        int youngestIndex = 0;
        int tallestIndex = 0;

        // Loop through the array to find the youngest and tallest
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display the results
        System.out.println("\nThe youngest friend is " + names[youngestIndex] + " with age " + ages[youngestIndex] + ".");
        System.out.println("The tallest friend is " + names[tallestIndex] + " with height " + heights[tallestIndex] + " cm.");
    }
}
