package lesson_7_testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {

    @Test
    public void testFactorial() {
        Factorial factorial = new Factorial();
        int result = Factorial.getFactorial(5);
        Assert.assertEquals(result, 120);
    }
}
