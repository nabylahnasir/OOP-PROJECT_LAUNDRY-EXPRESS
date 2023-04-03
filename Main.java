import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        new homepage();

        Customer[] customers = new Customer[3];
        customers[0] = new Customer(1, "Bella", "BellzRoyalez@gmail.com", "012-34567890","password123");
        customers[1] = new Customer(2, "Lily", "Lilytheflower@gmail.com", "017-56739042","flowerpot");
        customers[2] = new Customer(3, "Amir", "Amir123@gmail.com", "011-98765430","mysecretpassword");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        Customer customer = null;
        for (Customer c : customers) {
            if (c.getEmail().equals(email) && c.getPassword().equals(password)) {
                customer = c;
                break;
            }
        }

        if (customer != null) {
            System.out.println("Welcome, " + customer.getName() + "!");
            System.out.println("Customer ID: " + customer.getId());
            System.out.println("Customer Email: " + customer.getEmail());
            System.out.println("Customer Phone: " + customer.getPhone());
        } else {
            System.out.println("Invalid login information. Please try again.");
        }

        payment app = new payment();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Register customer");
            System.out.println("2. Place order");
            System.out.println("3. Process payment");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
        }
        // Customer customer = new Customer("123"); // replace with actual customer ID
        Washer washer1 = new Washer(1, "10", 5);
        washer1.start(30);
        System.out.println("Washer 1 is occupied: " + washer1.getStatus());
        System.out.println("Time left for washer 1 to finish: " + washer1.getTimeLeft() + " minutes");



        Dryer Dryer1 = new Dryer(true,8,"Medium",20);
        Dryer1.start(30);
        System.out.println( "Dryer 1: " + Dryer1.getStatus() + " TimeLeft: " + Dryer1.getTimeLeft() + " minutes.");

        Dryer Dryer2 = new Dryer(false,8,"Normal",0);
        Dryer2.start(0);
        System.out.println( "Dryer 2: " + Dryer2.getStatus() + " .TimeLeft: " + Dryer2.getTimeLeft() + " minutes.");

        Dryer Dryer3 = new Dryer(true,8,"Medium",20);
        Dryer3.start(30);
        System.out.println( "Dryer 3: " + Dryer3.getStatus() + " .TimeLeft: " + Dryer3.getTimeLeft() + " minutes.");
    }
}

