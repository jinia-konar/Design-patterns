package strategies.paymentMethods;

import dtos.CardDetails;
import strategies.PaymentStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DebitCard implements PaymentStrategy {

    private CardDetails cardDetails;
    Scanner scanner;

    public DebitCard() {
        this.cardDetails = new CardDetails();
        this.scanner = new Scanner(System.in);;
    }

    @Override
    public boolean processPayment(int amount) {
        if (cardDetails.isVerified()) {
            System.out.println("Process card payment for " + cardDetails.getAccountHolderName() + " with amount: " + amount);
            return true;
        }
        return false;
    }

    @Override
    public void collectPaymentDetails() throws IOException {
        System.out.println("Add your Account number: ");
        cardDetails.setAccountNumber(scanner.nextLine());
        System.out.println("Add your Account ifsc: ");
        cardDetails.setIfsc(scanner.nextLine());
        System.out.println("Add your Account holder name: ");
        cardDetails.setAccountHolderName(scanner.nextLine());
        System.out.println("Add your Account cvv: ");
        cardDetails.setCvv(scanner.nextLine());
        System.out.println("Is card verified?"); //This can have different logic on the basis of OTP
        cardDetails.setVerified(Boolean.parseBoolean(scanner.nextLine()));
    }
}
