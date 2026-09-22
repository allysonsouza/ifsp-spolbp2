import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SmallestIntegerFinderTest {

    @Test
    @DisplayName("Should return the smallest positive integer")
    void testSmallestPositive() {
        int[] input = {34, 15, 88, 2};
        int expected = 2;
        int actual = SmallestIntegerFinder.findSmallestInt(input);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Should handle negative numbers correctly")
    void testWithNegativeNumbers() {
        int[] input = {34, -345, -1, 100};
        int expected = -345;
        int actual = SmallestIntegerFinder.findSmallestInt(input);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Should return the single element when array length is 1")
    void testSingleElementArray() {
        int[] input = {42};
        int expected = 42;
        int actual = SmallestIntegerFinder.findSmallestInt(input);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Should handle arrays with duplicate values")
    void testWithDuplicates() {
        int[] input = {7, 7, 3, 3, 10};
        int expected = 3;
        int actual = SmallestIntegerFinder.findSmallestInt(input);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Should handle boundary values like Integer.MIN_VALUE")
    void testExtremeValues() {
        int[] input = {0, Integer.MAX_VALUE, Integer.MIN_VALUE, -500};
        int expected = Integer.MIN_VALUE;
        int actual = SmallestIntegerFinder.findSmallestInt(input);
        assertEquals(expected, actual);
    }
}