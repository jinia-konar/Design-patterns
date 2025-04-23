package observers.updateObservers;

import dto.Product;
import observable.ProductStockObservable;
import observers.UpdateObserver;

public class MobileUpdate implements UpdateObserver {
    private final String mobileNumber;

    public MobileUpdate(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }


    @Override
    public void update(ProductStockObservable observable) {
        Product product = observable.getData();
        System.out.println("Stock update for " + product.getProductName() + " via mobile to " + mobileNumber + " total stock in: " + product.getStock());
    }
}
