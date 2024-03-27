package week15;


import java.util.ArrayList;
import java.util.List;

public class _01_arraylist {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        //list.remove(0);
        list.add(7);
        System.out.println(list.get(1));

        System.out.println(list);
    }
}
