package com.kodilla.good.patterns.challenges;

public class InformationService {
    public void inform(User user, Product product) {
        System.out.println("Informing user " + user.getUsername() + " about ordering product " + product.getProductname());
    }
}
