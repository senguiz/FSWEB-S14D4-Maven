package org.example.model;

import java.sql.SQLOutput;

public class Chocolate extends ProductForSale{

    private ChocolateType chocotype;
    private String name;

    public Chocolate(ProductType type, int price, String description, ChocolateType chocotype, String name) {
        super(type, price, description);
        this.chocotype = chocotype;
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println(chocotype +" "+name);
    }
}
