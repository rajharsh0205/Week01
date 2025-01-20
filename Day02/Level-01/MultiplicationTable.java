import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        // Get the number from the user
        System.out.print("Enter a number to find its multiplication table: ");
        int number = scanner.nextInt();

        // Use a for loop to print the multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
