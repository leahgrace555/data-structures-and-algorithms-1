package dataStructures;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    @Test
    public void testLinkListCreate(){
        LinkedList ll = new LinkedList();

        assertNull("This should be null", ll.head);
    }
    @Test
    public void addToEmpty(){
        LinkedList ll = new LinkedList();
        ll.insert(3);

        assertEquals("The ll head should have a val of three", ll.head.value, 3);
        assertNull("The next should be null", ll.head.next);
    }
    @Test
    public void testBooleanPass(){
        LinkedList ll = new LinkedList();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);

        assertTrue(ll.includes(2));
        assertFalse(ll.includes(4));
    }
    @Test
    public void testAllLinkList() {
        LinkedList ll = new LinkedList();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        assertEquals("{3} -> {{2} -> {{1} -> {null}}}", "{3} -> {{2} -> {{1} -> {null}}}", ll.toString());
        assertEquals("classUnderTest should return 'Node has been added.'", "Node has been added.", ll.insert(1));

        assertTrue(ll.includes(2));
        assertFalse(ll.includes(4));

        ll.insertBefore(5,1);
        assertEquals("This should return with {1} -> {{3} -> {{2} -> {{5} -> {{1} -> {null}}}}}",
                "{1} -> {{3} -> {{2} -> {{5} -> {{1} -> {null}}}}}",
                ll.toString());

        ll.insertAfter(6,2);
        assertEquals("This should return with {1} -> {{3} -> {{2} -> {{6} -> {{5} -> {{1} -> {null}}}}}}",
                "{1} -> {{3} -> {{2} -> {{6} -> {{5} -> {{1} -> {null}}}}}}",
                ll.toString());

//        ll.deleteNode(6);
//        assertEquals("This should return with {1} -> {{3} -> {{2} -> {{5} -> {{1} -> {null}}}}}",
//                "{1} -> {{3} -> {{2} -> {{5} -> {{1} -> {null}}}}}",
//                ll.toString());
    }
    @Test
    public void testIndexChecker()throws Exception { //throws Exception
        LinkedList ll = new LinkedList();
        ll.insert(3);
        ll.insert(2);
        ll.insert(1);

        assertEquals("This should return 3", ll.kthFromTheEnd(0));
        assertEquals("This should return 2", ll.kthFromTheEnd(1));
        assertEquals("This should return 1", ll.kthFromTheEnd(2));
//        assertThrows("Oops that broke it yo", IndexOutOfBoundsException.class, () -> ll.aFunction)
    }
    @Test
    public void testIndexCheckerIfZero()throws Exception {
        LinkedList ll = new LinkedList();
        ll.insert(3);

        assertEquals("This should return 3", ll.kthFromTheEnd(0)); // only length of 1
    }
    @Test
    public void testZipper(){
        LinkedList ll = new LinkedList();
        LinkedList ll2 = new LinkedList();
        ll.insert(3);
        ll.insert(2);
        ll.insert(1);
        ll2.insert(7);
        ll2.insert(6);
        ll2.insert(5);

        ll.zipLists(ll, ll2);

        assertEquals("we should get 1 -> 6 -> 2 and so on", ll.toString());
    }
}
