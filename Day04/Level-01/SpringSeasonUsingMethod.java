public class SpringSeasonUsingMethod {

    // Method to check if the date is in Spring season
    public static boolean isSpringSeason(int month, int day) {
        if (month == 3 && day >= 20 && day <= 31) {
            return true;  // March 20 to March 31
        } else if (month == 4 && day >= 1 && day <= 30) {
            return true;  // April 1 to April 30
        } else if (month == 5 && day >= 1 && day <= 31) {
            return true;  // May 1 to May 31
        } else if (month == 6 && day >= 1 && day <= 20) {
            return true;  // June 1 to June 20
        } else {
            return false; // Not in Spring season
        }
    }

    public static void main(String[] args) {
        // Check if the correct number of arguments are provided
        if (args.length != 2) {
            System.out.println("Please provide exactly two arguments: month and day.");
            return;
        }

        // Parsing command-line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Checking if it's Spring season
        boolean isSpring = isSpringSeason(month, day);

        // Displaying the result
        if (isSpring) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
    }
}
