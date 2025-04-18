import com.example.Calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
  
    private final Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(5.0, calculator.add(2, 3), 0.0001);
    }

    @Test
    void testSubtraction() {
        assertEquals(1.0, calculator.subtract(3, 2), 0.0001);
    }

    @Test
    void testMultiplication() {
        assertEquals(6.0, calculator.multiply(2, 3), 0.0001);
    }

    @Test
    void testDivision() {
        assertEquals(2.0, calculator.divide(6, 3), 0.0001);
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(5, 0);
        });
        assertEquals("Cannot divide by zero!", exception.getMessage());
    }

    @Test
    void testInvalidTypeSimulation() {
        // Java est typé, donc "types invalides" sont gérés à la compilation.
        // Ici, on simule un cas d'entrée inattendue en double négatif.
        assertEquals(-5.0, calculator.add(-2, -3), 0.0001);
    }

    @Test
    void testUnexpectedResultSimulation() {
        assertNotEquals(10.0, calculator.multiply(2, 3)); // volontairement faux
    }
}
