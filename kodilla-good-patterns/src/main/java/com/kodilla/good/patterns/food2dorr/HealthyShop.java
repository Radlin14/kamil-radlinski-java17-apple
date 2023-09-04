package com.kodilla.good.patterns.food2dorr;

public class HealthyShop implements Producer{
    @Override
    public boolean process(Order order) {
        System.out.println("HealthyShop:");
        for(Product prod: order.getOrderList()){
            System.out.println(prod.getName() + " (" + prod.getQuantity() + " sztuk)");
        }
        for(Product product : order.getOrderList()){
            if(product.getName().contains("warzywa")){
                System.out.println("Promocja -20% na dany produkt.");
            }
        }
        return true;
    }
}