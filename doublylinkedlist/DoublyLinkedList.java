package doublylinkedlist;

public class DoublyLinkedList {
    public Node head;
    public Node tail;
    public Integer size = 0;

    public void insert(Integer value) {
        Node node = new Node(null, value, null);

        if(size==0) {
            this.head = node;
            this.tail = node;
            size++;
            return;
        }

        tail.next = node;
        node.prev = tail;
        tail = node;
        size++;
    }

    public void printList() {
        Node tempHead = head;
        Node tempTail = tail;

        while(tempHead!=null) {
            System.out.print(tempHead.value+" -> ");
            tempHead = tempHead.next;
        }

        System.out.println();

        while(tempTail!=null) {
            System.out.print(tempTail.value+" -> ");
            tempTail = tempTail.prev;
        }
    }
}
