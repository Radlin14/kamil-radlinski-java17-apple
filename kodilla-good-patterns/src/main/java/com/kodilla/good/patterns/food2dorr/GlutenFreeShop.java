package com.kodilla.good.patterns.food2dorr;

public class GlutenFreeShop implements Producer{
    @Override
    public boolean process(Order order) {
        System.out.println("GlutenFreeShop:");
        for(Product prod: order.getOrderList()){
            System.out.println(prod.getName() + " (" + prod.getQuantity() + " sztuk)");
        }
        for(Product product : order.getOrderList()){
            if(product.getName().contains("bułki") && product.getQuantity()>=10){
                System.out.println("Niewystarczająca ilość bułek na stanie!");
            }
        }
        return true;
    }
}