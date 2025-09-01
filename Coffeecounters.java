package Workshop;
import java.util.Scanner;

public class Coffeecounters {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String coffeeType;
        int quantity;
        double price = 0.0;
        final double GST_RATE = 0.18; // 18% GST

        System.out.println("Welcome to Ravi's Café ☕");
        System.out.println("Available Coffee Types: Espresso, Latte, Cappuccino");
        System.out.println("Type 'exit' to stop.");

        while (true) {
            System.out.print("\nEnter coffee type: ");
            coffeeType = scanner.nextLine().trim().toLowerCase();

            if (coffeeType.equals("exit")) {
                System.out.println("Thank you for visiting cafe");
                break;
            }

            switch (coffeeType) {
                case "espresso":
                    price = 100.0;
                    break;
                case "latte":
                    price = 120.0;
                    break;
                case "cappuccino":
                    price = 150.0;
                    break;
                default:
                    System.out.println("Invalid coffee type. Please try again.");
                    continue;
            }

            System.out.print("Enter quantity: ");
            quantity = scanner.nextInt();
            scanner.nextLine(); // consume leftover newline

            double subtotal = price * quantity;
            double gst = subtotal * GST_RATE;
            double totalBill = subtotal + gst;

            System.out.printf("Subtotal" subtotal);
            System.out.printf("GST (18%%)", gst);
            System.out.printf("Total Bill", totalBill);
        }

        scanner.close();

	}

}
