package strategies;

import java.io.IOException;

public interface PaymentStrategy {
    boolean processPayment(int amount);
    void collectPaymentDetails() throws IOException;
}
