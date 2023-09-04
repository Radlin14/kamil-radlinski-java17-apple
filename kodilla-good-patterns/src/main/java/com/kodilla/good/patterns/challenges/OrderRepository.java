package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;

public class OrderRepository {
    private List<Order> orderRepository = new ArrayList<Order>();

    public boolean createOrder(User user, Product product, int quantity) {
        Order order = new Order(user.getUsername(), product.getProductname(), quantity);
        this.orderRepository.add(order);
        System.out.println("New order. User " + user.getUsername() + " for product " + product.getProductname());
        return true;
    }

    public void printAllOrders() {
        for (Order order : this.orderRepository) {
            System.out.println(order.toString());
        }
    }

    public List<Order> getOrderRepository() {
        return orderRepository;
    }
}
