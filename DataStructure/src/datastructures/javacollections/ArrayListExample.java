package datastructures.javacollections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(null);
        list.add(null);
//        list.remove(1);
        list.add(2, 8);
        System.out.println(list);

    }
}
