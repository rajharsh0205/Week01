import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a date in the format "yyyy-MM-dd"
        System.out.println("Enter a date (yyyy-MM-dd): ");
        String dateInput = scanner.nextLine();
        
        // Close the scanner
        scanner.close();
        
        // Define the date format for parsing
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        // Parse the input date into a LocalDate object
        LocalDate date = LocalDate.parse(dateInput, formatter);
        
        // Perform the operations: Add 7 days, 1 month, 2 years, and then subtract 3 weeks
        LocalDate modifiedDate = date.plusDays(7)          // Add 7 days
                                    .plusMonths(1)       // Add 1 month
                                    .plusYears(2)        // Add 2 years
                                    .minusWeeks(3);      // Subtract 3 weeks
        
        // Print the modified date
        System.out.println("Modified Date: " + modifiedDate);
    }
}
