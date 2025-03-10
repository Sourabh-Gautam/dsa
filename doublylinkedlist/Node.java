package doublylinkedlist;

public class Node {
    public Node prev;
    public Integer value;
    public Node next;

    public Node(Node prev, Integer value, Node next) {
        this.prev = prev;
        this.next = next;
        this.value = value;
    }
}
