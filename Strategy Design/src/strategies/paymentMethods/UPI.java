package strategies.paymentMethods;

import dtos.UPIDetails;
import strategies.PaymentStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UPI implements PaymentStrategy {
    private UPIDetails upiDetails;
    Scanner scanner;

    public UPI() {
        this.upiDetails = new UPIDetails();
        this.scanner = new Scanner(System.in);
    }

    @Override
    public boolean processPayment(int amount) {
        if (upiDetails.isVerified()) {
            System.out.println("Process UPI payment to " + upiDetails.getUpiId() + " with amount: " + amount);
            return true;
        }
        return false;
    }

    @Override
    public void collectPaymentDetails() throws IOException {
        System.out.println("Add your UPI Id: ");
        upiDetails.setUpiId(scanner.nextLine());
        System.out.println("Is upi Id verified?"); //This can have different logic
        upiDetails.setVerified(Boolean.parseBoolean(scanner.nextLine()));
    }
}
