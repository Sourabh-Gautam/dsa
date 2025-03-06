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

    public boolean insert(int data, int index) {
        Node node = new Node(data, null);

        if(head==null) {
            head = node;
            tail = node;
            size++;
            return true;
        }

        if(index<0 || index>size) {
            return false;
        }

        if(index==0) {
            node.next = head.next;
            head = node;
        } else if(index==size) {
            tail.next = node;
            tail = node;
        }
        else {
            Node tempHead = head;

            for(int i=1; i<index; i++) {
                tempHead = tempHead.next;
            }

            node.next = tempHead.next;
            tempHead.next = node;
        }

        size++;
        return true;
    }

    public Node get(int index) {
        if(index<0 || index>=size) {
            return new Node(null, null);
        }

        Node tempHead = head;

        for(int i=0; i<index; i++) {
            tempHead = tempHead.next;
        }

        return tempHead;
    }

    public String rotate(int number) {
        if(number==0 || number%size==0) {
            return "No rotation";
        }

        Node tempHead = head;

        for(int i=1; i<number; i++) {
            tempHead = tempHead.next;
        }

        tail.next = head;
        head = tempHead.next;
        tail = tempHead;

        return "Success";
    }

    public boolean set(int index, int value) {
        if(index<0 || index>=size) {
            return false;
        }

        Node tempHead = head;

        for(int i=0; i<index; i++) {
            tempHead = tempHead.next;
        }

        tempHead.value = value;
        return true;
    }

    public Node remove(int index) {
        if(index<0 || index>=size) {
            return null;
        }

        Node tempHead = head;

        for(int i=0; i<index-1; i++) {
            tempHead = tempHead.next;
        }

        Node removedNode = tempHead.next;
        tempHead.next = tempHead.next.next;
        size--;
        return removedNode;
    }

}