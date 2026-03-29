package lesson_7_junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CalculatorTest {

    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        double result = calculator.add(2, 5);
        Assertions.assertEquals(7, result);
    }

    @Test
    void testSubtract() {
        Calculator calculator = new Calculator();
        double result = calculator.subtract(10, 2);
        Assertions.assertEquals(8, result);
    }

    @Test
    void testDivide() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(6, 2);
        Assertions.assertEquals(3, result);
    }

    @Test
    void testDivideByZero() {
        Calculator calculator = new Calculator();
        Assertions.assertThrows(
                ArithmeticException.class,
                () -> calculator.divide(10, 0)
        );
    }

    @Test
    void testMultiply() {
        Calculator calculator = new Calculator();
        double result = calculator.multiply(3, 4);
        Assertions.assertEquals(12, result);
    }
}
