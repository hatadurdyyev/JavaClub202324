package week19;

import java.util.Arrays;
import java.util.TreeSet;

public class _02_TreeSet_to_Arrays {
    private static TreeSet<Integer> values;

    public static void main(String[] args) {
        values = generateSet();

        System.out.println("values = " + values);

        addElements(values, 10, 100, 100, 100);
        addElements(values, 50, 100);
        addElements(values, 1);
        System.out.println("values = " + values);

        Integer[] arr = convertToArray(values);
        System.out.println("   arr = " + Arrays.toString(arr));
    }

    private static Integer[] convertToArray(TreeSet <Integer> values) {
//        int [] arr = new int[values.size()];
//
//        int i = 0;
//        for (int x : values){
//            arr[i++] = x;
//        }
        return values.toArray(new Integer[0]);
    }

    private static TreeSet<Integer> generateSet() {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(    (int) (Math.random() * 100)    );
        }
        return set;
    }

    private static void addElements(TreeSet <Integer> set, int... values) {
        for (int value : values) {
            set.add(value);
        }
    }
}
