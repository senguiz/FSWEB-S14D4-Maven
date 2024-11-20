package org.example.model;

public class Bread extends ProductForSale{
    private BreadType breadType;


    public Bread(ProductType type, int price, String description, BreadType breadType) {
        super(type, price, description);
        this.breadType = breadType;

    }

    @Override
    public void showDetails() {
        System.out.println(breadType);
    }
}
