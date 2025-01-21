import java.util.Scanner;

public class CreateCalendar {
	
    private static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
		};
        return months[month - 1];
	}
	
    private static int getDaysInMonth(int month, int year) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2) {
            if (isLeapYear(year)) {
                return 29;
				} else {
                return days[1];
			}
		}
        return days[month - 1];
	}
	
    private static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
		}
        return false;
	}
	
    private static int getFirstDayOfMonth(int month, int year) {
        int y = year;
        int m = month;
		
        if (m < 3) {
            m += 12;
            y--;
		}
		
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7;
		
        return d0;
	}
	
    public static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int daysInMonth = getDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(month, year);
		
        System.out.println("        " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
		
        // Print leading spaces for the first day of the month
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
		}
		
        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);
			
            // Move to the next line after Saturday
            if ((firstDay + day) % 7 == 0) {
                System.out.println();
			}
		}
        System.out.println(); 
	}
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter the month (1-12): ");
        int month = input.nextInt();
		
        System.out.print("Enter the year: ");
        int year = input.nextInt();
		
        displayCalendar(month, year);
		
        input.close();
	}
}
