package dataStructures;

public class LinkedList {
    public Node head = null;
    public Node tail = null;

    public String insert(String data) { //
        Node node = new Node(data);
        if (this.head == null) {
            node.setNextNode(null);
            this.head = node;
        }else {
            Node myHead = this.head;
            while(myHead.getNextNode() != null){
                myHead.getNextNode();
            }
            myHead.setNextNode(node);
        }
        return node.myVal;
    }

    public boolean includes(String data) {
        Node current = this.head;
        boolean result = false;
        while(current.nextNode != null) {
            if (current.myVal == data) {
                current = current.nextNode;
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }

    public String toString(){
        return toString(this.head);

    }
    public String toString(Node current){
        if(current == null){
            return "null";
        }
        return String.format("{%d} -> %s", current.myVal, toString(current.nextNode));
    }
//    public int removeFromEnd() throws Exception {
//        if (this.head == null) {
//            throw new Exception("There are no things to remove");
//        } else {
//            int thingToReturn = this.tail.myVal;
//            Node twoFromEnd = this.head;
//            while (twoFromEnd.nextNode.nextNode != null) {
//                twoFromEnd = twoFromEnd.nextNode;
//            }
//            twoFromEnd.nextNode = null;
//            this.tail = twoFromEnd;
//
//            return thingToReturn;
//        }
//    }
}
