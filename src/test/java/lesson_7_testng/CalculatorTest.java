package lesson_7_testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        double result = calculator.add(5, 5);
        Assert.assertEquals(result, 10);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        double result = calculator.subtract(10, 5);
        Assert.assertEquals(result, 5);
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        double result = calculator.multiply(5, 5);
        Assert.assertEquals(result, 25);
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(5, 5);
        Assert.assertEquals(result, 1);
    }

    @Test
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        Assert.assertThrows(
                ArithmeticException.class,
                () -> calculator.divide(10, 0)
        );
    }
}
