import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        // Taking input from the user for temperature and conversion choice
        double temperature = getInput("Enter the temperature: ");
        String choice = getConversionChoice();

        // Performing the conversion based on the user's choice
        if (choice.equals("F")) {
            double celsius = fahrenheitToCelsius(temperature);
            System.out.println(temperature + " Fahrenheit is equal to " + celsius + " Celsius.");
        } else if (choice.equals("C")) {
            double fahrenheit = celsiusToFahrenheit(temperature);
            System.out.println(temperature + " Celsius is equal to " + fahrenheit + " Fahrenheit.");
        } else {
            System.out.println("Invalid choice. Please enter 'F' for Fahrenheit to Celsius or 'C' for Celsius to Fahrenheit.");
        }
    }

    // Function to take input from the user
    public static double getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    // Function to get the conversion choice from the user
    public static String getConversionChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 'F' to convert from Fahrenheit to Celsius or 'C' to convert from Celsius to Fahrenheit: ");
        return scanner.next().toUpperCase();
    }

    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
