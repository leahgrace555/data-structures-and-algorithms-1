package challenge401;

import org.junit.Test;
import static org.junit.Assert.*;

public class DiceTest {
    @Test public void testDiceRoll(){
        Dice test = new Dice();
        int newArr[] = test.roll(5);
        assertEquals(newArr.length, 5);
    }
    @Test public void testDuplicateMethod(){
        Dice test = new Dice();
        int[] dupArray = {1,1,2,3,4};
        int[] nonDup = {1,2,3,4,5,6};

        assertTrue("true", test.containsDuplicates(dupArray));
        assertFalse("false", test.containsDuplicates(dupArray));
    }
}
