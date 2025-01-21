import java.util.Scanner;

public class NumberFormatExceptionDemo {
	
    // Method to generate the NumberFormatException
    public static void generateNumberFormatException(String text) {
        // This will throw a NumberFormatException if text is not a valid integer
        int number = Integer.parseInt(text);  // Attempting to convert the string to an integer
        System.out.println("Converted number: " + number);  // Will not be executed if exception occurs
	}
	
    // Method to handle the NumberFormatException
    public static void handleNumberFormatException(String text) {
		try {
            // Calling the method that generates the exception
            generateNumberFormatException(text);
			} catch (NumberFormatException e) {
            // Handling the NumberFormatException specifically
            System.out.println("Error: NumberFormatException occurred. Invalid input: " + text);
			} catch (RuntimeException e) {
            // Handling other runtime exceptions
            System.out.println("Error: RuntimeException occurred. " + e.getMessage());
	        }
	}
	
	
	public static void main(String[] args) {
		// Taking user input as a string
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		String userInput = scanner.nextLine();  // Reading user input as a string
		
		try{generateNumberFormatException(userInput);}
		catch(NumberFormatException e){
			System.out.println("Exception occurred: " + e);
		}
		// Call the method to handle the NumberFormatException
		handleNumberFormatException(userInput);
		
		// Closing the scanner
		scanner.close();
	}
}
