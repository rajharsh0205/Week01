import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the first date
        System.out.println("Enter the first date (yyyy-MM-dd):");
        String firstDateInput = scanner.nextLine();
        
        // Prompt the user to enter the second date
        System.out.println("Enter the second date (yyyy-MM-dd):");
        String secondDateInput = scanner.nextLine();
        
        // Close the scanner
        scanner.close();
        
        // Define the date format for parsing
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        // Parse the input dates into LocalDate objects
        LocalDate firstDate = LocalDate.parse(firstDateInput, formatter);
        LocalDate secondDate = LocalDate.parse(secondDateInput, formatter);
        
        // Compare the two dates
        if (firstDate.isBefore(secondDate)) {
            System.out.println("The first date is before the second date.");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("The first date is after the second date.");
        } else if (firstDate.isEqual(secondDate)) {
            System.out.println("The first date is the same as the second date.");
        }
    }
}
