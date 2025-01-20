import java.util.Arrays;

public class RandomNumberStats {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = 1000 + (int)(Math.random() * 9000); // Generates a number between 1000 and 9999
        }
        return randomNumbers;
    }

    // Method to find the average, minimum, and maximum of an array of numbers
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        double sum = 0;

        for (int number : numbers) {
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        double average = sum / numbers.length;
        return new double[] {average, min, max};
    }

    public static void main(String[] args) {
        int size = 5;

        // Generate random numbers
        int[] randomNumbers = generate4DigitRandomArray(size);
        System.out.println("Generated 4-digit random numbers: " + Arrays.toString(randomNumbers));

        // Calculate average, min, and max
        double[] results = findAverageMinMax(randomNumbers);
        System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }
}
