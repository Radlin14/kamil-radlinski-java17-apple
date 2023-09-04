package com.kodilla.good.patterns.food2dorr;

public class ExtraFoodShop implements Producer{
    @Override
    public boolean process(Order order) {
        System.out.println("ExtraFoodShop:");
        for(Product prod: order.getOrderList()){
            System.out.println(prod.getName() + " (" + prod.getQuantity() + " sztuk)");
        }
        if(order.getOrderList().size()>10){
            System.out.println("Dodatkowy rabat -10%");
        }
        return true;
    }
}
