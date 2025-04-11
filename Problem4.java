import java.util.HashMap;
import java.util.Map;

public class Problem4 {
    public static void main(String[] args) {
        // Input list of numbers
        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        // Call the method to get multiples count
        Map<Integer, Integer> multiplesCount = getMultiplesCount(numbers);

        // Print the result
        System.out.println("Output: " + multiplesCount);
    }

    public static Map<Integer, Integer> getMultiplesCount(int[] numbers) {
        // Create a map to store counts of multiples
        Map<Integer, Integer> multiplesMap = new HashMap<>();

        // Initialize counts for keys [1 to 9] to 0
        for (int i = 1; i <= 9; i++) {
            multiplesMap.put(i, 0);
        }

        // Iterate through each number in the input list
        for (int number : numbers) {
            // Check divisibility for numbers [1 to 9]
            for (int i = 1; i <= 9; i++) {
                if (number % i == 0) {
                    // Increment count for the corresponding key
                    multiplesMap.put(i, multiplesMap.get(i) + 1);
                }
            }
        }

        return multiplesMap;
    }
}
