import java.util.Scanner;

class Calculator {
    // Method to perform calculations based on operation type
    public double calculate(double a, double b, String operation) {
        switch(operation.toLowerCase()) {
            case "add":
            case "+":
                return add(a, b);
            case "subtract":
            case "-":
                return subtract(a, b);
            case "multiply":
            case "*":
                return multiply(a, b);
            case "divide":
            case "/":
                // Check for division by zero
                if(b == 0) {
                    System.out.println("Error! Cannot divide by zero");
                    return Double.NaN; // Not a Number
                }
                return divide(a, b);
            default:
                System.out.println("Invalid operation!");
                return Double.NaN;
        }
    }
    
    // Addition method
    private double add(double a, double b) {
        return a + b;
    }
    
    // Subtraction method
    private double subtract(double a, double b) {
        return a - b;
    }
    
    // Multiplication method
    private double multiply(double a, double b) {
        return a * b;
    }
    
    // Division method
    private double divide(double a, double b) {
        return a / b;
    }
}

public class Problem1 {
    public static void main(String[] args) {
        // Create scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Get first number
            System.out.print("Enter first number (a): ");
            double a = scanner.nextDouble();
            
            // Get second number
            System.out.print("Enter second number (b): ");
            double b = scanner.nextDouble();
            
            // Consume newline
            scanner.nextLine();
            
            // Get operation type
            System.out.print("Enter operation (add/+, subtract/-, multiply/*, divide/): ");
            String operation = scanner.nextLine();
            
            // Create calculator object
            Calculator calc = new Calculator();
            
            // Perform calculation and get result
            double result = calc.calculate(a, b, operation);
            
            // Display result if valid
            if(!Double.isNaN(result)) {
                System.out.println("Result: " + result);
            }
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
