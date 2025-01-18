package datastructures.javacollections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(null);
        list.add(null);
        list.remove(1);
        list.add(2, 8);
        System.out.println(list);

    }
}
