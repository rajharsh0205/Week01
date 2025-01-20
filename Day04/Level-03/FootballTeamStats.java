import java.util.Arrays;

public class FootballTeamStats {

    // Method to generate random heights between 150 cm and 250 cm for the players
    public static int[] generateRandomHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = 150 + (int)(Math.random() * 101); // Random height between 150 and 250
        }
        return heights;
    }

    // Method to calculate the sum of all elements in the array
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int height : array) {
            sum += height;
        }
        return sum;
    }

    // Method to calculate the mean height
    public static double calculateMean(int[] array) {
        int sum = calculateSum(array);
        return (double) sum / array.length;
    }

    // Method to find the shortest height
    public static int findShortest(int[] array) {
        int min = array[0];
        for (int height : array) {
            min = Math.min(min, height);
        }
        return min;
    }

    // Method to find the tallest height
    public static int findTallest(int[] array) {
        int max = array[0];
        for (int height : array) {
            max = Math.max(max, height);
        }
        return max;
    }

    public static void main(String[] args) {
        int size = 11;

        // Generate random heights for the players
        int[] heights = generateRandomHeights(size);
        System.out.println("Heights of the players: " + Arrays.toString(heights));

        // Calculate sum, mean, shortest, and tallest heights
        double meanHeight = calculateMean(heights);
        int shortestHeight = findShortest(heights);
        int tallestHeight = findTallest(heights);

        // Display the results
        System.out.println("Mean height: " + meanHeight + " cm");
        System.out.println("Shortest height: " + shortestHeight + " cm");
        System.out.println("Tallest height: " + tallestHeight + " cm");
    }
}
