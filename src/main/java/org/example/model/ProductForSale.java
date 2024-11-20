package org.example.model;

public abstract class ProductForSale {

    private ProductType type;
    private int price;
    private String description;

    public ProductForSale(ProductType type, int price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }
    public ProductType getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public int getSalesPrice(int quantity){
        return quantity*price;
    }
    public abstract void showDetails();
}
