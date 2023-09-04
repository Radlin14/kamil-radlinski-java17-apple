package com.kodilla.good.patterns.food2dorr;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> orderList = new ArrayList<Product>();

    public List<Product> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Product> orderList) {
        this.orderList = orderList;
    }

    public void addProduct(String name, int quantity) {
        Product product = new Product(name, quantity);
        orderList.add(product);
    }
}