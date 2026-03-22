package lesson_7_testng;
import org.testng.Assert;
import org.testng.annotations.Test;
public class NumberComparatorTest {

    @Test
    public void testComparator(){
        NumberComparator comparator = new NumberComparator(5, 2);
        boolean result = comparator.isEqual();
        Assert.assertFalse(result);
    }

    @Test
    public void testComparatorIsEqual(){
        NumberComparator comparator = new NumberComparator(5, 5);
        boolean result = comparator.isEqual();
        Assert.assertTrue(result);
    }
}
