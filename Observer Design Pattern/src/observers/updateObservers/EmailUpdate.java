package observers.updateObservers;

import dto.Product;
import observable.ProductStockObservable;
import observers.UpdateObserver;

public class EmailUpdate implements UpdateObserver {
    private final String emailId;

    public EmailUpdate(String emailId) {
        this.emailId = emailId;
    }


    @Override
    public void update(ProductStockObservable observable) {
        Product product = observable.getData();
        System.out.println("Stock update for " + product.getProductName() + " via email to " + emailId + " total stock in: " + product.getStock());
    }
}
