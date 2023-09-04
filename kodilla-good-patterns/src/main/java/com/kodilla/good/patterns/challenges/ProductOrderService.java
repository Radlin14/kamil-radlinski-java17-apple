package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private InformationService informationService;
    private OrderRepository orderRepository;
    private WarehouseService warehouseService;

    public ProductOrderService(final InformationService informationService, OrderRepository orderRepository, WarehouseService warehouseService) {
        this.informationService = informationService;
        this.orderRepository = orderRepository;
        this.warehouseService = warehouseService;
    }

    public void process(User user, Product product, int quantity) {
        boolean isAvaiable = warehouseService.checkAvailability(product.getProductname(), quantity);
        boolean done = false;
        if (isAvaiable) {
            informationService.inform(user, product);
            done = orderRepository.createOrder(user, product, quantity);
        }
        if (done) {
            System.out.println("Proces przebiegł poprawnie");
        } else {
            System.out.println("Proces zakończony niepowodzeniem");
        }

    }
}
