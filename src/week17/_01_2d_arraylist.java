package week17;

import java.util.ArrayList;
import java.util.List;

public class _01_2d_arraylist {
    public static void main(String[] args) {
        // one dimension
        List<Integer> list = new ArrayList<>();
        list.add(30);

        ArrayList < ArrayList <Integer>  > tdlist = new ArrayList<>();

        ArrayList <Integer> bioScore = new ArrayList<>();
        bioScore.add(5);
        bioScore.add(10);

        ArrayList <Integer> cheScore = new ArrayList<>();
        cheScore.add(9);
        cheScore.add(5);
        cheScore.add(7);

        tdlist.add(bioScore);
        tdlist.add(cheScore);

        for (int i = 0; i < 1; i++) {
            System.out.println(tdlist);
        }


        for (int i = 0; i < tdlist.size(); i++) {
            int sum = 0;
            for (int j = 0; j < tdlist.get(i).size(); j++) {
                sum += tdlist.get(i).get(j);
            }
            System.out.println(sum);
        }


    }
}
