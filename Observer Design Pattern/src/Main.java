import dto.Product;
import observable.ProductStockObservable;
import observable.impl.ProductStockImpl;
import observers.UpdateObserver;
import observers.updateObservers.EmailUpdate;
import observers.updateObservers.MobileUpdate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Behavioral Design Pattern: Notify on product Stock");

        Product iPhone = new Product("IPhone", 0);
        Product juicer = new Product("Juicer", 0);

        ProductStockObservable iPhoneObservable = new ProductStockImpl(iPhone);
        ProductStockObservable juicerObservable = new ProductStockImpl(juicer);

        UpdateObserver emailObserver = new EmailUpdate("abcd@gmail.com");
        UpdateObserver mobileObserver = new MobileUpdate("798301830");

        iPhoneObservable.add(emailObserver);
        iPhoneObservable.add(mobileObserver);

        juicerObservable.add(emailObserver);
        juicerObservable.add(mobileObserver);

        iPhoneObservable.setStock(10);
        juicerObservable.setStock(11);
        iPhoneObservable.setStock(0);

        iPhoneObservable.remove(mobileObserver);
        iPhoneObservable.setStock(12);
    }
}