import dtos.CardDetails;
import strategies.PaymentStrategy;
import strategies.paymentMethods.DebitCard;
import strategies.paymentMethods.UPI;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Strategy Design Pattern: Different Payment methods");

        PaymentStrategy paymentStrategy = new DebitCard(); //Change this to cardDetails and check

        Payment payment = new Payment(paymentStrategy);

        try {
            payment.collectPaymentDetails();
            payment.processPayment(100);
        } catch (IOException e) {
            System.out.println("Unable to collect payment details");
        }
    }
}