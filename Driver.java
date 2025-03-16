import ciculardoublylinkedlist.CicularDoublyLinkedList;
import exercises.ExerciseClass;
import exercises.list.MyLinkedList;

public class Driver {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.insert(90);
        myLinkedList.insert(53);
        myLinkedList.insert(3);
        myLinkedList.insert(21);
        myLinkedList.insert(3);
        myLinkedList.insert(5);

//        myLinkedList.set(5, 20);

        ExerciseClass exerciseClass = new ExerciseClass();
        exerciseClass.removeDuplicates(myLinkedList);
        myLinkedList.printList();
    }
}
