package week16;

import java.util.ArrayList;
import java.util.Collections;

public class _02_arraylist_collections {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(11);
        numbers.add(9);
        numbers.add(12);
        numbers.add(8);

        System.out.println("numbers = " + numbers);

        Collections.sort(numbers);
        System.out.println("Collections.sort(numbers) = " + numbers);




    }
}