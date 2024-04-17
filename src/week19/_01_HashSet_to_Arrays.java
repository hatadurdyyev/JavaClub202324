package week19;

import java.util.Arrays;
import java.util.HashSet;

public class _01_HashSet_to_Arrays {

    private static HashSet<Integer> values;

    public static void main(String[] args) {
        values = generateSet();

        System.out.println("values = " + values);

        addElements(values, 10, 100, 100, 100);
        addElements(values, 50, 100);
        addElements(values, 1);
        System.out.println("values = " + values);

        int [] arr = convertToArray(values);
        System.out.println("arr = " + Arrays.toString(arr));
    }

    private static int[] convertToArray(HashSet <Integer> values) {
        int [] arr = new int[values.size()];

        int i = 0;
        for (int x : values){
            arr[i++] = x;
        }
        return arr;
    }

    private static HashSet<Integer> generateSet() {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(    (int) (Math.random() * 100)    );
        }
        return set;
    }

    private static void addElements(HashSet <Integer> set, int... values) {
        for (int i = 0; i < values.length; i++) {
            set.add(values[i]);
        }
    }


}
