import java.util.Scanner;

public class DisplayCalendarUsingMethod {

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    // Method to get the number of days in a month
    public static int getNumberOfDaysInMonth(int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // February check for leap year
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }

        return daysInMonth[month - 1];
    }

    // Method to get the first day of the month
    public static int getFirstDayOfMonth(int month, int year) {
        int y = year;
        int m = month;

        if (m < 3) {
            m += 12;
            y--;
        }

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (1 + x + (31 * m0) / 12) % 7;

        return d0;
    }

    // Method to display the calendar for a given month and year
    public static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int numDays = getNumberOfDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        System.out.println("        " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print the days of the month
        for (int day = 1; day <= numDays; day++) {
            System.out.print(String.format("%3d ", day));
            if ((firstDay + day) % 7 == 0) {
                System.out.println(); // Move to the next line
            }
        }

        System.out.println(); // Print a new line after the calendar
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // Display the calendar
        displayCalendar(month, year);
    }
}
