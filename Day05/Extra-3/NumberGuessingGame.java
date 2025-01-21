import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Start the game
        System.out.println("Think of a number between 1 and 100, and I will try to guess it.");
        System.out.println("Please provide feedback for my guesses. Type 'high' if the guess is too high, 'low' if it's too low, and 'correct' if it's correct.");
        
        // Initialize the range for guesses
        int lowerBound = 1;
        int upperBound = 100;
        String feedback = "";
        
        // Repeat until the guess is correct
        while (!feedback.equals("correct")) {
            // Generate the computer's guess
            int guess = generateGuess(lowerBound, upperBound);
            System.out.println("Is your number " + guess + "?");
            
            // Get the feedback from the user
            feedback = getFeedback(scanner);
            
            // Determine the next guess based on the feedback
            if (feedback.equals("high")) {
                upperBound = guess - 1;
            } else if (feedback.equals("low")) {
                lowerBound = guess + 1;
            } else if (!feedback.equals("correct")) {
                System.out.println("Invalid input! Please enter 'high', 'low', or 'correct'.");
            }
        }
        
        // End of the game
        System.out.println("Yay! I guessed your number correctly!");
        
        // Close the scanner
        scanner.close();
    }

    // Function to generate a random guess within the given range
    public static int generateGuess(int lowerBound, int upperBound) {
        Random random = new Random();
        return random.nextInt(upperBound - lowerBound + 1) + lowerBound;
    }

    // Function to get feedback from the user
    public static String getFeedback(Scanner scanner) {
        System.out.println("Enter feedback (high, low, or correct):");
        return scanner.nextLine().toLowerCase().trim();
    }
}
