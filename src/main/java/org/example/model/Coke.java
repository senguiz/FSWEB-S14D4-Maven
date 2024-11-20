package org.example.model;

public class Coke extends ProductForSale{

    private CokeType cokeType;
    private String name;

    public Coke(ProductType type, int price, String description, CokeType cokeType, String name) {
        super(type, price, description);
        this.cokeType = cokeType;
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println(cokeType+" "+name);
    }
}
