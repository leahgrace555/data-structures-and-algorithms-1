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
        ll.insert("3");

        assertEquals("The ll head should have a val of three", ll.head.myVal, "3");
        assertNull("The next should be null", ll.head.nextNode);
    }
    @Test
    public void addToEnd(){
        LinkedList ll = new LinkedList();
        ll.insert("3");
        ll.insert("node");

        assertEquals("The ll head should have a val of three", ll.head.myVal, "3");
        assertNull("The next should be null", ll.head.nextNode.nextNode);
        assertEquals("Add node to the tail", ll.head.nextNode.myVal, "node");
    }
    @Test
    public void testIncludesHappy() {
        LinkedList ll = new LinkedList();
        ll.insert("3");
        ll.insert("node");


    }
    @Test
    public void testIncludesSad() {
        LinkedList ll = new LinkedList();
        ll.insert("3");
        ll.insert("node");
        boolean actual = ll.includes("15");

        assertFalse("This is false, duh", actual);
    }
}
