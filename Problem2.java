import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        // Set up scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter a value for x: ");
        int x = scanner.nextInt();
        
        if (x <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            generateOddSeries(x);
        }
        
        // Close scanner
        scanner.close();
    }
    
    public static void generateOddSeries(int count) {
        System.out.print("Output: ");
        
        // Start with first odd number
        int currentNumber = 1;
        
        for (int i = 0; i < count; i++) {
            // Print current odd number
            System.out.print(currentNumber);
            
            // Add comma and space if not the last number
            if (i < count - 1) {
                System.out.print(", ");
            }
            
            // Move to next odd number (increment by 2)
            currentNumber += 2;
        }
        
        System.out.println(); // New line after series
    }
}
