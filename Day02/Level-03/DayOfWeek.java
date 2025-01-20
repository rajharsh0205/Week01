public class DayOfWeek {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Please provide month, day, and year as command-line arguments.");
            return;
        }

        // Parse the command-line arguments as integers
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        // Calculate y0
        int y0 = y - (14 - m) / 12;

        // Calculate x
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

        // Calculate m0
        int m0 = m + 12 * ((14 - m) / 12) - 2;

        // Calculate d0
        int d0 = (d + x + 31 * m0 / 12) % 7;

        // Output the day of the week as an integer (0 = Sunday, 1 = Monday, etc.)
        System.out.println("The day of the week is: " + d0);
    }
}
