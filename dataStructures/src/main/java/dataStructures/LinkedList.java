package dataStructures;

public class LinkedList {
    public Node head = null;
    public Node tail = null;

    public String insert(int value) {
        Node node = new Node(value);
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            node.next = this.head;
            this.head = node;
        }
        return "Node has been added.";
    }

    public boolean includes(int value) {
        Node current = this.head;
        boolean test = false;

        while (current != null) {
            if (current.value == value) {
                test = true;
            }
            current = current.next;
        }
        return test;
    }

    public String ll_append(int value) {
        Node node = new Node(value);
        this.tail.next = node;
        return "Node has been added to the tail.";
    }

    public void insertBefore(int value, int befVal) {
        Node node = new Node(value);
        Node current = head;

        while (current.next != null) {
            if (current.next.value == befVal) {
                Node temp = current.next;
                current.next = node;
                node.next = temp;
            }
            current = current.next;
        }
    }

    public void insertAfter(int value, int aftVal) {
        Node node = new Node(value);
        Node current = head;

        while (current != null) {
            if (current.value == aftVal) {
                Node temp = current.next;
                current.next = node;
                node.next = temp;
            }
            current = current.next;
        }
    }

    public void deleteNode(int value) {
        Node current = head;
        if (current.value == value) {
            head = current.next;
        }

        while (current != null) {
            if (current.next.value == value) {
                current.next = current.next.next;
            }
            current = current.next;
        }
    }
    // https://leetcode.com/problems/remove-nth-node-from-end-of-list/solution/
    public String kthFromTheEnd(int k) throws Exception { //throws Exception
        Node node = head;
        Node first = node;
        Node second = node;

        for(int i = 0; i < k + 1; i++){
            first = first.next;
        }
        while(first != null){
            first = first.next;
            second = second.next;
        }
        if(k < 0) {
            throw new Exception("Oops, that broke the link!");
        }
        return String.format("This should return %d", second.value);
    }
    public static LinkedList zipLists(LinkedList one, LinkedList two) {
        LinkedList ll = new LinkedList();
        if(one == null){
            return two;
        }else if (two == null){
            return one;
        }
        Node current1 = one.head;
        Node current2 = two.head;
        Node tempVar = current1.next;
        Node tempVar2 = current2.next;

        while(tempVar != null& tempVar2 !=null){
            current1 = current2;
            current2 = current1.next;
            current1.next = current2.next;
            ll.insert(tempVar.value);
            ll.insert(tempVar2.value);
        }
        return ll;
    }

    public String toString() {
        return toString(this.head);
    }

    public String toString(Node current) {
        if (current == null) {
            return "null";
        } else {
            return String.format("{%d} -> {%s}", current.value, toString(current.next));
        }
    }

    class Node {
        public int value;
        Node next = null;
        Node prev;

        public Node(int value) {
            this.value = value;
        }
    }
}
