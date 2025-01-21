import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {

    // Method to generate the ArrayIndexOutOfBoundsException
    public static void generateArrayIndexOutOfBoundsException(String[] names, int index) {
        // This will throw an ArrayIndexOutOfBoundsException if index is out of bounds
        System.out.println("Accessing index: " + index);
        String name = names[index];  // Attempting to access an element at the given index
        System.out.println("Name at index " + index + ": " + name);  // Will not be executed if exception occurs
    }

    // Method to handle the ArrayIndexOutOfBoundsException
    public static void handleArrayIndexOutOfBoundsException(String[] names, int index) {
        try {
            // Calling the method that generates the exception
            generateArrayIndexOutOfBoundsException(names, index);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling the ArrayIndexOutOfBoundsException specifically
            System.out.println("Error: ArrayIndexOutOfBoundsException occurred. Invalid index: " + index);
        } catch (RuntimeException e) {
            // Handling other runtime exceptions
            System.out.println("Error: RuntimeException occurred. " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Define an array of names
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};

        // Taking user input for the index
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an illegal index to access: ");
        int userInputIndex = scanner.nextInt();  // Reading user input as an integer

        // Call the method to handle the ArrayIndexOutOfBoundsException
        handleArrayIndexOutOfBoundsException(names, userInputIndex);

        // Closing the scanner
        scanner.close();
    }
}
