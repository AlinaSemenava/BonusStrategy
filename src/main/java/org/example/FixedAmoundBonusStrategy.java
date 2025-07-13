package org.example;

import java.math.*;

public class FixedAmoundBonusStrategy implements BonusStrategy {

    @Override
    public BigDecimal calculateBonus(Order order) {
        return BigDecimal.TEN;
    }
}
