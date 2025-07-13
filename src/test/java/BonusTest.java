import org.example.*;
import org.junit.jupiter.api.*;

import java.math.*;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class BonusTest {
    @Test
    void testNewCustomerGetsBonusOnFirstOrder() {
        // Arrange
        BonusSystem bonusSystem = new BonusSystem();

        // Assert
        assertEquals(0, bonusSystem.getBonus()
                .compareTo(BigDecimal.valueOf(0.65))); // Предполагается, что новый клиент получает скидку 5 %
    }
}
