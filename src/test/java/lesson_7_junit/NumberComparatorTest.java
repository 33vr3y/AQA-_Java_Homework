package lesson_7_junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberComparatorTest {

    @Test
    void comparatorTest() {
        NumberComparator comparator = new NumberComparator(5, 3);
        boolean result = comparator.isEqual();
        Assertions.assertFalse(result);
    }

    @Test
    void comparatorTest2() {
        NumberComparator comparator = new NumberComparator(5, 5);
        boolean result = comparator.isEqual();
        Assertions.assertTrue(result);
    }
}
