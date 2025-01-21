import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
public class CurrentDate{
	public static void main(String[] args){
	// Get the current date
      LocalDate currentDate = LocalDate.now();
	// Formatter to display the time in a readable format
     DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy "); 
     DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd "); 
     DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy "); 	 
       // Print the different formats
        System.out.println("Format 1: " + currentDate.format(formatter1));
        System.out.println("Format 2: " + currentDate.format(formatter2));
        System.out.println("Format 3: " + currentDate.format(formatter3));
    }
}