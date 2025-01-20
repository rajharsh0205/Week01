import java.util.Scanner;

public class HandshakeCalculatorUsingMethod {

    // Method to calculate the maximum number of handshakes
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Calculating the maximum number of handshakes
        int maxHandshakes = calculateHandshakes(numberOfStudents);

        // Displaying the result
        System.out.println("The maximum number of handshakes among " + numberOfStudents + 
                           " students is " + maxHandshakes + ".");

        scanner.close();
    }
}
