import java.util.*;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
public class CurrentTime{
	public static void main(String[] args){
		//GMT (Greenwich Mean Time)
		ZonedDateTime gmtTime=ZonedDateTime.now(ZoneId.of("GMT"));
		// IST (Indian Standard Time)
        ZonedDateTime pstTime=ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		// PST (Pacific Standard Time)
        ZonedDateTime istTime=ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));	
        // Formatter to display the time in a readable format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");   
        // Print the times
        System.out.println("Current Time in GMT: " + gmtTime.format(formatter));
        System.out.println("Current Time in IST: " + istTime.format(formatter));
        System.out.println("Current Time in PST: " + pstTime.format(formatter));
    }
}
