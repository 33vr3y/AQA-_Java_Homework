package lesson_7_junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {

    @Test
    void factorialTest() {
        Factorial factorial = new Factorial();
        int result = factorial.getFactorial(5);
        Assertions.assertEquals(120, result);
    }
}
