package org.example;

import java.math.*;
import java.util.*;

public class BonusSystem implements Runnable {

    public Order makeOrder() {
        return new Order(makeProducts());
    }

    private List<Product> makeProducts() {
        return List.of(
                new Product("чай", BigDecimal.valueOf(5.5)),
                new Product("кофе", BigDecimal.valueOf(7.5))
        );
    }

    public BigDecimal getBonus() {
        Order order = makeOrder();
        order.setBonusStrategy(new NewClient());
        return order.calculateTotalBonus();
    }

    @Override
    public void run() {
        System.out.println(getBonus());
    }
}

