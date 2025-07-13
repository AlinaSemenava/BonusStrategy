package org.example;

import java.math.*;

public interface BonusStrategy {
    BigDecimal calculateBonus(Order order);
}
