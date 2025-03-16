package exercises;

import exercises.list.MyLinkedList;

public class ExerciseClass {

    public void removeDuplicates(MyLinkedList<Integer> list) {
        for(int i=0; i<list.getSize(); i++) {
            for(int j=i+1; j<list.getSize(); j++ ) {
                if(list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    break;
                }
            }
        }
    }

}
