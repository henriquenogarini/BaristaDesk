package br.com.baristaDesk.model;

public class Product {
    private String name;
    private String description;
    private String category;
    private double price;
    private int stockQuantity;
    private String productId;

    public Product(String name, String description, String category, double price, int stockQuantity, String productId) {
       this.name = name;
       this.description = description;
       this.category = category;
       this.price = price;
       this.stockQuantity = stockQuantity;
       this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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
                ", Name=" + name +
                ", Description=" + description +
                ", Category=" + category +
                ", Price=" + price +
                ", Stock=" + stockQuantity + "]";
    }
}