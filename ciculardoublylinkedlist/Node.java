package ciculardoublylinkedlist;

public class Node {
    public Node next;
    public Integer value;
    public Node prev;

    public Node(Node next, Integer value, Node prev) {
        this.next = next;
        this.value = value;
        this.prev = prev;
    }
}
