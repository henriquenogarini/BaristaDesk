package br.com.baristaDesk.model;


public class Product extends Item {
    private String category;
    private int stockQuantity;
    private String productId;

    public Product(String name, String description, String category, double price, int stockQuantity, String productId) {
       super(name, description, price);
       this.category = category;
       this.stockQuantity = stockQuantity;
       this.productId = productId;
    }

    @Override
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "Product [ID=" + productId +
                ", Name=" + getName() +
                ", Description=" + getDescription() +
                ", Category=" + category +
                ", Price=" + getPrice() +
                ", Stock=" + stockQuantity + "]";
    }
}