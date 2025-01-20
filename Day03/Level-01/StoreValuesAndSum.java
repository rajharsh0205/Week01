import java.util.Scanner;

public class StoreValuesAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double number = scanner.nextDouble();

            if (number <= 0) {
                break;
            }

            if (index == 10) {
                System.out.println("Array is full.");
                break;
            }

            numbers[index] = number;
            index++;
        }

        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        System.out.println("The total sum is: " + total);

        scanner.close();
    }
}
