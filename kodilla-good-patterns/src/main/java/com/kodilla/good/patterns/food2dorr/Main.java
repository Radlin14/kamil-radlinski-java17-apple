package com.kodilla.good.patterns.food2dorr;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Producer extraFoodShop = new ExtraFoodShop();
        Producer healthyShop = new HealthyShop();
        Producer glutenFreeShop = new GlutenFreeShop();
        System.out.println("Podaj produkty i ilość, aby zakończyć wpisz 0, aby dodać nowy produkt podaj 1");
        Scanner scan = new Scanner(System.in);
        boolean list_making = true;
        String name;
        int quantity;
        Order order = new Order();
        while (list_making) {
            name = scan.nextLine();
            quantity = Integer.parseInt(scan.nextLine());
            order.addProduct(name, quantity);
            list_making = Integer.parseInt(scan.nextLine()) != 0;
        }
        extraFoodShop.process(order);
        healthyShop.process(order);
        glutenFreeShop.process(order);
    }
}