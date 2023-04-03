import java.util.HashMap;
import java.util.Scanner;

public class Payment {
    private double amount;
    private String phone;
    private String paymentMethod;
    private String qrCode;

    public Payment(double amount, String phone, String paymentMethod, String qrCode) {
        this.amount = amount;
        this.phone = phone;
        this.paymentMethod = paymentMethod;
        this.qrCode = qrCode;
    }



    switch (choice) {
        case 1:
            System.out.print("Enter customer name: ");
            String name = scanner.nextLine();
            System.out.print("Enter customer phone number: ");
            String phone = scanner.nextLine();
            app.registerCustomer(name, phone);
            break;

        case 2:
            System.out.print("Enter customer phone number: ");
            phone = scanner.nextLine();
            System.out.print("Enter items to be laundered (comma separated): ");
            String[] items = scanner.nextLine().split(",");
            app.placeOrder(phone, items);
            break;
        case 3:
            System.out.print("Enter customer phone number: ");
            phone = scanner.nextLine();
            System.out.print("Enter payment method (QR code): ");
            String paymentMethod = scanner.nextLine();
            System.out.print("scanner QR code: ");
            String qrCode = scanner.nextLine();
            double amount = orders.get(phone);
            Payment payment = new Payment(amount, phone, paymentMethod, qrCode);
            payment.processPayment();
            orders.put(phone, 0.0);
            break;

        case 4:
            System.out.println("Exiting...");
            System.exit(0);
        default:
            System.out.println("Invalid choice.");
    }




    public void processPayment() {
        // Code to process payment using the QR code
        System.out.println("Payment processed for amount RM" + amount + " using QR code " + qrCode);
    }
}