package org.example.model;

public class Store {


    public static void main(String[] args) {
        ProductForSale[] products = { new Chocolate(ProductType.DESSERT,10,"chocolate",ChocolateType.MILK,"Milka")
                ,new Coke(ProductType.DRINK,15,"coke",CokeType.REGULAR,"Coca Cola"),
                new Bread(ProductType.SIDE,2,"bread",BreadType.MULTIGRAIN)};
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {

        for(ProductForSale product : products){
            product.showDetails();
        }
    }
}