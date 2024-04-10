import org.experis.calculator.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {

    Calculator calc;

    @BeforeEach
    void init() {
        calc = new Calculator();
    }

    @AfterEach
    void notifyTest() {
        System.out.println("Test done!");
    }

    @Test
    @DisplayName("Testing add with valid input")
    void addTesting() {
        System.out.println("Test Add");
        assertEquals(24.00F, calc.add(13, 11));
    }

    @Test
    @DisplayName("Testing subtract with valid input")
    void subtractTesting() {
        System.out.println("Test Subtract");
        assertEquals(4.10F, calc.subtract(13.50F, 9.40F), 0.0001);
    }

    @Test
    @DisplayName("Testing divide with valid input")
    void divideTesting() {
        System.out.println("Test Divide");
        assertEquals(1.43F, calc.divide(13.50F, 9.40F), 0.01);
    }

    @Test
    @DisplayName("Testing multiply with valid input")
    void multiplyTesting() {
        System.out.println("Test Multiply");
        assertEquals(126.9F, calc.multiply(13.50F, 9.40F), 0.01);
    }
}
