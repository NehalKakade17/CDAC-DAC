import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the total purchase amount
        System.out.print("Enter the total purchase amount (in Rs): ");
        double totalPurchase = scanner.nextDouble();

        // Prompt user to enter whether they have a membership card
        System.out.print("Do you have a membership card? (yes/no): ");
        String hasMembershipCard = scanner.next().trim().toLowerCase();

        // Calculate the discount based on the purchase amount
        double discount = 0.0;
        if (totalPurchase >= 1000) {
            discount = 20; // 20% discount
        } else if (totalPurchase >= 500) {
            discount = 10; // 10% discount
        } else {
            discount = 5; // 5% discount
        }

        // Check if the user has a membership card
        if (hasMembershipCard.equals("yes")) {
            discount += 5; // Increase discount by 5% if the user has a membership card
        }

        // Calculate the final amount after discount
        double discountAmount = totalPurchase * (discount / 100);
        double finalAmount = totalPurchase - discountAmount;

        // Print the discount details
        System.out.printf("Original amount: Rs. %.2f%n", totalPurchase);
        System.out.printf("Discount applied: %.2f%%%n", discount);
        System.out.printf("Discount amount: Rs. %.2f%n", discountAmount);
        System.out.printf("Final amount after discount: Rs. %.2f%n", finalAmount);

        // Close the scanner
        scanner.close();
    }
}