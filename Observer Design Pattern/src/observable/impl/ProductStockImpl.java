package observable.impl;

import dto.Product;
import observable.ProductStockObservable;
import observers.UpdateObserver;

import java.util.ArrayList;
import java.util.List;

public class ProductStockImpl implements ProductStockObservable {
    private final List<UpdateObserver> updateObservers = new ArrayList<>();
    private final Product product;

    public ProductStockImpl(Product product) {
        this.product = product;
    }

    @Override
    public void add(UpdateObserver observer) {
        updateObservers.add(observer);
    }

    @Override
    public void remove(UpdateObserver observer) {
        updateObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        updateObservers.forEach(updateObserver -> {
            updateObserver.update(this);
        });
    }

    @Override
    public void setStock(int stock) {
        int prevStockVal = product.getStock();
        product.setStock(stock);
        if (prevStockVal == 0) {
            notifyObservers();
        }
    }

    @Override
    public Product getData() {
        return product;
    }
}
