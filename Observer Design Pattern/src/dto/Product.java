package dto;

public class Product {
    private String productName;
    private int stock;

    public Product(String productName, int stock) {
        this.productName = productName;
        this.stock = stock;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
