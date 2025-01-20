import java.util.*;
public class SpringSeason {
    public static void main(String[] args) {
        System.out.println("Please provide both month and day as numbers in input in command line arguments.");
        
		Scanner sc= new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();

        if ((month == 3 && day >= 20 && day <= 31) ||  // March 20 to 31
            (month == 4 && day >= 1 && day <= 30) ||   // April 1 to 30
            (month == 5 && day >= 1 && day <= 31) ||   // May 1 to 31
            (month == 6 && day >= 1 && day <= 20)) {   // June 1 to 20
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
    }
}
