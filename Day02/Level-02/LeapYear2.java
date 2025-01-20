import java.util.Scanner;

public class LeapYear2 {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Get the year from the user
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Single if condition using logical && and || operators
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }
}
