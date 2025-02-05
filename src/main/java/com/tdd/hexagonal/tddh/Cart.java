package com.tdd.hexagonal.tddh;

public class Cart {

    private int productPrice;

    public int totalPrice() {
        return productPrice;
    }

    public void add(String productName, int productPrice) {
        this.productPrice = productPrice;
    }

}
