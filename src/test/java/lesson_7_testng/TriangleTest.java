package lesson_7_testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TriangleTest {

    @Test
    public void testTriangle() {
        Triangle triangle = new Triangle(2, 5, 4);
        double result = triangle.calculateArea();
        Assert.assertEquals(result, 3.7996, 0.001);
    }
}
