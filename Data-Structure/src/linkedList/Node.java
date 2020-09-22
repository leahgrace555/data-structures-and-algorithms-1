package linkedList;

public class Node {

    public String myVal;
    public Node nextNode;

    Node(String data) {
        this.myVal = data;
        this.nextNode = null;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public String getMyVal() {
        return myVal;
    }

    public void setMyVal(String myVal) {
        this.myVal = myVal;
    }
}
