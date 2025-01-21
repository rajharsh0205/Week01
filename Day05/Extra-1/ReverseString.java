import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        
        // Close the scanner
        scanner.close();
        
        // Reverse the string without using built-in reverse functions
        String reversed = "";
        
        // Loop through the string from the end to the beginning
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        
        // Print the reversed string
        System.out.println("Reversed string: " + reversed);
    }
}
