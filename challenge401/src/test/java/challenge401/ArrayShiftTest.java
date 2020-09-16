package challenge401;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayShiftTest {
    @Test public void testEvenArray() {
        ArrayShift arrayShift = new ArrayShift();
        int[] input = {1, 2, 4, 5};
        int value = 3;
        int[] output = {1, 2, 3, 4, 5};
        assertArrayEquals(output, arrayShift.insertShiftArray(input, value));
    }

    @Test public void testOddArray() {
        ArrayShift arrayShift = new ArrayShift();
        int[] input = {1, 2, 3, 5, 6};
        int value = 4;
        int[] output = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(output, arrayShift.insertShiftArray(input, value));
    }

    @Test public void testEmptyArray() {
        ArrayShift arrayShift = new ArrayShift();
        int[] input = new int[0];
        int value = 1;
        int[] output = {1};
        assertArrayEquals(output, arrayShift.insertShiftArray(input, value));
    }
}