import linkedlist.SinglyLinkedList;

public class Driver {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.push(5);
        singlyLinkedList.push(10);

        System.out.println(singlyLinkedList.pop().value); // 10
        System.out.println(singlyLinkedList.tail.value);  // 5
        System.out.println(singlyLinkedList.size);   // 1
        System.out.println(singlyLinkedList.pop().value); // 5
        System.out.println(singlyLinkedList.size);   // 0
        System.out.println(singlyLinkedList.pop());   // The SLL does not exist
    }
}
