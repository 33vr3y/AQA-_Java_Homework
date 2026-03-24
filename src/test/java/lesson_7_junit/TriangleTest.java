package lesson_7_junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {
    @Test
    void testCalculateArea() {
        Triangle triangle = new Triangle(2, 5, 4);
        double result = triangle.calculateArea();
        Assertions.assertEquals(3.7996, result, 0.001);
    }
}
