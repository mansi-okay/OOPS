package collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Using ArrayList - fast, not synchronized
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        System.out.println("ArrayList: " + arrayList);

        //Using LinkedList - good for frequent insertions/deletions
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(34);
        linkedList.add(78);
        linkedList.add(55);
        linkedList.add(89);
        System.out.println("LinkedList: " + linkedList);

        //Using Vector - thread-safe (synchronized)
        List<Integer> vector = new Vector<>();
        vector.add(45);
        vector.add(5);
        vector.add(15);
        vector.add(56);
        System.out.println("Vector: " + vector);
    }
}
