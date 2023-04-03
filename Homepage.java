public class homepage {
    String customername;
    System.out.println("Welcome"+customername);

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == washerButton) {
            viewWashers();
        } else if (source == dryerButton) {
            viewDryers();
        } else if (source == profileButton) {
            viewProfile();
        } else if (source == paymentButton) {
            viewPayment();
        }
    }

    private void viewWashers() {
        // Code to handle viewing washers
        System.out.println("Viewing washers...");
        // Instantiate Washer class and call necessary methods
        Washer washer = new Washer();
        washer.viewAvailableWashers();
        washer.selectWasher();
        washer.scheduleWasher();
    }

    private void viewDryers() {
        // Code to handle viewing dryers
        System.out.println("Viewing dryers...");
        // Instantiate Dryer class and call necessary methods
        Dryer dryer = new Dryer();
        dryer.viewAvailableDryers();
        dryer.selectDryer();
        dryer.scheduleDryer();
    }

    private void viewProfile() {
        // Code to handle viewing profile
        System.out.println("Viewing profile...");
        // Instantiate Profile class and call necessary methods
        Profile profile = new Profile();
        profile.viewProfile();
        profile.editProfile();
    }

    private void viewPayment() {
        // Code to handle viewing payment
        System.out.println("Viewing payment...");
        // Instantiate Payment class and call necessary methods
        Payment payment = new Payment();
        payment.viewPaymentOptions();
        payment.selectPaymentMethod();
        payment.processPayment();
    }


}