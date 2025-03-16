package exercises.list;

public class MyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private Integer size = 0;

    public void insert(T value) {
        Node<T> node = new Node<>(null, value, null);

        if(size == 0) {
            head = node;
            tail = node;
            node.setPrev(node);
            node.setNext(node);
            size++;
            return;
        }

        node.setPrev(tail);
        node.setNext(head);
        tail.setNext(node);
        tail = node;
        size++;
    }

    public T get(Integer index) {
        if(index == null || index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index %d is out of range".formatted(index));
        }

        Node<T> tempHead = head;
        int i=0;
        while (i != index) {
            tempHead = tempHead.getNext();
            i++;
        }

        return tempHead.getValue();
    }

    public boolean remove(Integer index) {
        if(index == null || index < 0 || index >= size) {
            return false;
        }

        if(index == 0) {
            head = head.getNext();
            head.setPrev(tail);
            tail.setNext(head);
            size--;
            return true;
        }

        if(index == size-1) {
            tail = tail.getPrev();
            tail.setNext(head);
            head.setPrev(tail);
            size--;
            return true;
        }

        Node<T> tempHead = head;
        int i=1;
        while (i != index) {
            tempHead = tempHead.getNext();
            i++;
        }

        tempHead.getNext().getNext().setPrev(tempHead);
        tempHead.setNext(tempHead.getNext().getNext());
        size--;
        return true;
    }

    public boolean set(Integer index, T value) {
        if(index == null || index < 0 || index >= size) {
            return false;
        }

        Node<T> tempHead = head;
        int i=0;
        while (i != index) {
            tempHead = tempHead.getNext();
            i++;
        }

        tempHead.setValue(value);
        return true;
    }

    public void printList() {
        int i=1;
        Node<T> tempHead = head;
        Node<T> tempTail = tail;

        while(true) {
            if(i==size) {
                System.out.print(tempHead.getValue());
                break;
            }
            System.out.print(tempHead.getValue() + " -> ");
            tempHead = tempHead.getNext();
            i++;
        }

        i=1;
        System.out.println();

        while(true) {
            if(i==size) {
                System.out.print(tempTail.getValue());
                break;
            }
            System.out.print(tempTail.getValue() + " -> ");
            tempTail = tempTail.getPrev();
            i++;
        }
    }

    public Integer getSize() {
        return size;
    }
}
