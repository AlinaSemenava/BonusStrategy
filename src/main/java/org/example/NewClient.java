package org.example;

import java.math.*;

public class NewClient implements BonusStrategy {
    @Override
    public BigDecimal calculateBonus(Order order) {
        return order.getTotalAmount().multiply(BigDecimal.valueOf(0.05));
    }
}
