package ciculardoublylinkedlist;

public class CicularDoublyLinkedList {
    public Node head;
    public Node tail;
    public Integer size=0;

    public void insert(Integer value) {
        Node node = new Node(null, value, null);
        if(size == 0) {
            head = node;
            tail = node;
            node.prev = node;
            node.next = node;
            size++;
            return;
        }

        node.prev = tail;
        node.next = head;
        tail.next = node;
        tail = node;
        head.prev = node;
        size++;
    }

    public void printList() {
        int i=1;
        Node tempHead = head;
        Node tempTail = tail;

        while(true) {
            if(i==size) {
                System.out.print(tempHead.value);
                break;
            }
            System.out.print(tempHead.value + " -> ");
            tempHead = tempHead.next;
            i++;
        }

        i=1;
        System.out.println();

        while(true) {
            if(i==size) {
                System.out.print(tempTail.value);
                break;
            }
            System.out.print(tempTail.value + " -> ");
            tempTail = tempTail.prev;
            i++;
        }
    }
}
