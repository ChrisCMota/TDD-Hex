package com.tdd.hexagonal.tddh.test;

import com.tdd.hexagonal.tddh.Cart;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CartTest {

   @Test
   void emptyCarHasTotalPriceOfZero(){

    Cart cart = new Cart();

       Assertions.assertThat(cart.totalPrice())
               .isZero();

   }
}
