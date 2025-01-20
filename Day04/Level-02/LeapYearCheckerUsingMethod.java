import java.util.Scanner;

public class LeapYearCheckerUsingMethod{

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Leap year conditions
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the year
        System.out.print("Enter a year (>= 1582): ");
        int year = scanner.nextInt();

        // Check if the year is valid for Gregorian calendar
        if (year < 1582) {
            System.out.println("The entered year is not valid. Please enter a year >= 1582.");
        } else {
            // Checking if the year is a leap year
            if (isLeapYear(year)) {
                System.out.println("The year " + year + " is a Leap Year.");
            } else {
                System.out.println("The year " + year + " is not a Leap Year.");
            }
        }

        // Closing the scanner
        scanner.close();
    }
}
