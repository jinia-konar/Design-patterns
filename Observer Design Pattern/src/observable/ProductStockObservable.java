package observable;

import dto.Product;
import observers.UpdateObserver;

public interface ProductStockObservable {
    void add(UpdateObserver observer);
    void remove(UpdateObserver observer);
    void notifyObservers();
    void setStock(int stock);
    Product getData();
}
