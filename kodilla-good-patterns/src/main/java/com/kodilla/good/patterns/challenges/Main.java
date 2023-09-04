package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        InformationService informationService = new InformationService();
        OrderRepository productOrderRepository = new OrderRepository();
        WarehouseService warehouseService = new WarehouseService();
        ProductOrderService productOrderService = new ProductOrderService(informationService, productOrderRepository, warehouseService);

        User user = new User("kowalski");
        Product product = new Product("TV");

        productOrderService.process(user, product, 20);


    }
}
