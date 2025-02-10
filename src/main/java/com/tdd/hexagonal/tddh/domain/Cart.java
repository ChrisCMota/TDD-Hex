package com.tdd.hexagonal.tddh.domain;

public class Cart {

    private int totalPrice;
    private String productName;

    public int totalPrice() {
        return totalPrice;
    }

    public void add(String productName, int productPrice) {
        this.productName = productName;
        this.totalPrice += productPrice;
    }

    public String receipt() {
        if (isEmpty()) {
            return receiptForEmptyCart();
        }
        return receiptForNonEmptyCart();
    }

    private boolean isEmpty() {
        return totalPrice() == 0;
    }

    private static String receiptForEmptyCart() {
        return """
                Total price $0
                """;
    }

    private String receiptForNonEmptyCart() {
        return """
                %s $%s
                
                Total price $%s
                """.formatted(productName,
                        totalPrice(),
                totalPrice());
    }
}
