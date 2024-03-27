package week11;

import java.util.Arrays;

public class _01_2d_arrays {

    /*
    Assume we have 10 names in an array, by using Bubble sort, Selection Sort and Arrays sort method, sort all the names in ascending order
     */
    public static void main(String[] args) {
        String[] ArrNames = {"James", "Mike", "Clark", "Jessica", "Harry", "John", "Adam", "Liam", "Gary", "David"};

        Arrays.sort(ArrNames);
        System.out.println("Arrays.toString(names) = " + Arrays.toString(ArrNames));
    }
}
