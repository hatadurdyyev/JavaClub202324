package week15;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _02_linkedlist {
    public static void main(String[] args) {
        List <Integer> list = new LinkedList<>();
        list.add(4);
        list.add(5);
        list.remove(0);
        list.add(7);
        System.out.println(list.get(1));

        System.out.println(list);
    }
}
