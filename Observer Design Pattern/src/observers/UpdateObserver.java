package observers;

import observable.ProductStockObservable;

public interface UpdateObserver {
    void update(ProductStockObservable observable);
}
