import java.util.Scanner;

public class StringComparison {

    // Method to compare two strings using charAt() method
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for two strings
        System.out.print("Enter the first string: ");
        String string1 = scanner.next();

        System.out.print("Enter the second string: ");
        String string2 = scanner.next();

        // Comparing strings using charAt() method
        boolean resultUsingCharAt = compareStringsUsingCharAt(string1, string2);

        // Comparing strings using String equals() method
        boolean resultUsingEquals = string1.equals(string2);

        // Displaying the results
        System.out.println("Result using charAt() method: " + resultUsingCharAt);
        System.out.println("Result using String equals() method: " + resultUsingEquals);

        // Checking if the results are the same
        if (resultUsingCharAt == resultUsingEquals) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("The methods give different results.");
        }

        scanner.close();
    }
}
