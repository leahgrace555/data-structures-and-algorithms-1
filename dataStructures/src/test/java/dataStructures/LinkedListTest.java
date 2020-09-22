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
    public void addToEnd(){
        LinkedList ll = new LinkedList();
        ll.insert(3);
        ll.insert(14);

        assertEquals("The ll head should have a val of three", ll.head.value, 3);
        assertNull("The next should be null", ll.head.next.next);
        assertEquals("Add node to the tail", ll.head.next.value, 14);
    }
    @Test
    public void testBooleanFail() {
        LinkedList ll = new LinkedList();
        ll.insert(3);
        ll.insert(15);
        boolean actual = ll.includes(15);

        assertFalse("This is false, duh", actual);
    }
    @Test
    public void testBooleanPass(){
        LinkedList ll = new LinkedList();
        ll.insert(3);
        ll.insert(15);
        boolean actual = ll.includes(15);

    }

    @Test
    public void testInsertandDelete(){
        LinkedList ll = new LinkedList();
        ll.insert(3);
        ll.insert(5);

        ll.insertBefore(5,1);
        assertEquals("This should return with {1} -> {{3} -> {{2} -> {{5} -> {{1} -> {null}}}}}", "{1} -> {{3} -> {{2} -> {{5} -> {{1} -> {null}}}}}", ll.toString());

        ll.insertAfter(6,2);
        assertEquals("This should return with {1} -> {{3} -> {{2} -> {{6} -> {{5} -> {{1} -> {null}}}}}}", "{1} -> {{3} -> {{2} -> {{6} -> {{5} -> {{1} -> {null}}}}}}", ll.toString());

        ll.deleteNode(6);
        assertEquals("This should return with {1} -> {{3} -> {{2} -> {{5} -> {{1} -> {null}}}}}", "{1} -> {{3} -> {{2} -> {{5} -> {{1} -> {null}}}}}", ll.toString());
    }
}
