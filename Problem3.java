import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        // Set up scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a value for x: ");
        int x = scanner.nextInt();

        // Validate input
        if (x <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            generateSeries(x);
        }

        // Close scanner
        scanner.close();
    }

    public static void generateSeries(int x) {
        System.out.print("Output: ");

        // Determine how many numbers to print
        int countToPrint = (x % 2 == 0) ? x - 1 : x;

        // Generate and print the series
        for (int i = 0; i < countToPrint; i++) {
            int oddNumber = 2 * i + 1; // Formula for odd numbers: 2n + 1
            System.out.print(oddNumber);

            // Add a comma and space if not the last number
            if (i < countToPrint - 1) {
                System.out.print(", ");
            }
        }

        System.out.println(); // New line after the series
    }
}
