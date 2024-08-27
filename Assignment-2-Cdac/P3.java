import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Prompt user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Prompt user to enter the operator
        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // Perform the calculation based on the operator
        double result = 0;
        boolean validOperation = true; // Flag to check if the operation is valid

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperation = false; // Set flag to false to indicate an invalid operation
                }
                break;
            default:
                System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
                validOperation = false; // Set flag to false to indicate an invalid operation
                break;
        }

        // Print the result if the operation was valid
        if (validOperation) {
            System.out.printf("Result: %.2f%n", result);
        }

        // Close the scanner
        scanner.close();
    }
}