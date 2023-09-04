package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.Map;

public class WarehouseService {
    HashMap<String, Integer> products = new HashMap<String, Integer>();

    public boolean checkAvailability(String productname, int quantity) {
        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            if (entry.getKey().equals(productname) && entry.getValue() < quantity) {
                System.out.println("Brak wystarczającej ilości produktu.");
                return false;
            } else {
                System.out.println("Produkt dostępny.");
            }

        }
        return true;
    }
}
