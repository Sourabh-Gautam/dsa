import doublylinkedlist.DoublyLinkedList;
import linkedlist.SinglyLinkedList;

public class Driver {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insert(1);
        doublyLinkedList.insert(2);
        doublyLinkedList.insert(3);
        doublyLinkedList.insert(4);
        doublyLinkedList.insert(5);

        doublyLinkedList.printList();
    }
}
