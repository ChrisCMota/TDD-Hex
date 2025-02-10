package com.tdd.hexagonal.tddh.test;

import com.tdd.hexagonal.tddh.domain.Cart;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class CartTest {

    @Test
    void emptyCarHasTotalPriceOfZero() {

        Cart cart = new Cart();

        assertThat(cart.totalPrice())
                .isZero();

    }

    @Test
    void addToothbrushProductThenTotalPriceIsOneDollar(){
        Cart cart = new Cart();

        cart.add("Toothbrush", 1);

        assertThat(cart.totalPrice())
                .isEqualTo(1);
    }

    @Test
    void addTwoToothbreshesThenTotalPriceIsTwoDollars(){
        Cart cart = new Cart();

        cart.add("Toothbrush", 1);
        cart.add("Toothpaste", 2);

        assertThat(cart.totalPrice())
                .isEqualTo(3);
    }

    @Test
    void emptyCartReceiptShowsZeroPrice(){
        Cart cart = new Cart();

        assertThat(cart.receipt())
                .isEqualTo("""
                                Total price $0
                                """);
    }

    @Test
    void totalPriceCart(){
        Cart cart = new Cart();

        cart.add("Toothbrush", 1);

        assertThat(cart.receipt())
                .isEqualTo("""
                        Total price $1
                        """);
    }
}
