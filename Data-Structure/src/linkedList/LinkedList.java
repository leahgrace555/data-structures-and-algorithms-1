package linkedList;

public class LinkedList {
    Node head;
    LinkedList ll = new LinkedList();
    String tail = null;

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

    public boolean includes(Node head, String data) {
        Node current = head;
        while(current != null) {
            if (current.data == data) { // we cannot compare a string to a string, look into reference types + .equals
                current = current.next;
                return true;
            } else {
                return false;
            }
        }
    }

//    public String toString(){
//      String nodeString = "";
//      String currentNode = this.head;
//        while(currentNode !== null){
//            nodeString = nodeString + `{${currentNode.value}} -> `;
//            currentNode = currentNode.next;
//       }
//        nodeString = nodeString + "null";
//      return nodeString;
//    }
}
