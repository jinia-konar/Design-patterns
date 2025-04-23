import strategies.PaymentStrategy;

import java.io.IOException;

public class Payment {

    private final PaymentStrategy paymentStrategy;

    public Payment(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public boolean processPayment(int amount) {
        return paymentStrategy.processPayment(amount);
    }

    public void collectPaymentDetails() throws IOException {
        paymentStrategy.collectPaymentDetails();
    }
}
