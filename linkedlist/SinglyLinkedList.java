package linkedlist;

public class SinglyLinkedList {
    public int size;
    public Node head;
    public Node tail;

    public void push(int value) {
        Node node = new Node(value, null);

        if(size == 0) {
            head = node;
            tail = node;
            size++;
            return;
        }

        tail.next = node;
        tail = node;
        size++;
    }

    public Node pop() {
        if(size == 0) {
            throw new RuntimeException("Linked list is empty");
        }

        Node tempHead = head;

        for(int i=0; i<size-2; i++) {
            tempHead = tempHead.next;
        }

        Node poppedNode = tail;
        tail = tempHead;
        tail.next = null;
        size--;

        return poppedNode;
    }
}