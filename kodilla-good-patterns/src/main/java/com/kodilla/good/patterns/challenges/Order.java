package com.kodilla.good.patterns.challenges;

public class Order {
    private String username;
    private String productname;
    private int quantity;

    public Order(String username, String productname, int quantity) {
        this.username = username;
        this.productname = productname;
        this.quantity = quantity;
    }

    public String getUsername() {
        return username;
    }

    public String getProductname() {
        return productname;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }
}
