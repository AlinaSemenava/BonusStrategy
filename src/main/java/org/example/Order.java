package org.example;

import java.math.*;
import java.util.*;

public class Order {
    private BigDecimal totalAmount;
    private List<Product> products;
    private BonusStrategy bonusStrategy;

    public Order(List<Product> products) {
        this.totalAmount = products.stream()
                .map(Product::getPrice)            // Получаем Stream<BigDecimal>
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        this.products = products;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public List <Product> getProducts() {
        return products;
    }

    public void setBonusStrategy(BonusStrategy bonusStrategy) {
        this.bonusStrategy = bonusStrategy;
    }

    public BigDecimal calculateTotalBonus() {
        if (bonusStrategy != null) {
            return bonusStrategy.calculateBonus(this);
        }
        return BigDecimal.ZERO;
    }
}
