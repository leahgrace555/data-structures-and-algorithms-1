package challenge401;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test
    public void testSomeLibraryMethod() {
        Library classUnderTest = new Library(); // classUnderTest is a library. new lib is a construct of a new lib
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
    @Test
    public void testBinarySearch1(){
        Library classUnderTest = new Library();
        int[] input = {1, 2, 6, 8, 15};
        int searchKey = 8;
        int output = 3;

        int potato = classUnderTest.BinarySearch(input, searchKey, 0, 4);// this is arguments NOT parameters

        assertEquals(3, output);
    }

    @Test
    public void testBinarySearch2(){
        Library classUnderTest = new Library();
        int[] input = {1, 2, 6, 8, 15};
        int searchKey = 7;
        int output = -1;

        int potato = classUnderTest.BinarySearch(input, searchKey, 0, 4);

        assertEquals(-1, output);
    }
}
