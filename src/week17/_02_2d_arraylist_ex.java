package week17;

import java.util.ArrayList;

public class _02_2d_arraylist_ex {
    public static void main(String[] args) {
        ArrayList <String> names = new ArrayList<>();
        names.add("Amalia");

        ArrayList <ArrayList <Integer> > grades = new ArrayList<>();

        ArrayList <Integer> math = new ArrayList<>();
        math.add(7);
        math.add(9);
        math.add(4);

        ArrayList <Integer> art = new ArrayList<>();
        art.add(10);
        art.add(8);

        ArrayList <Integer> music = new ArrayList<>();
        music.add(9);
        music.add(10);

        ArrayList <Integer> bio = new ArrayList<>();
        bio.add(4);
        bio.add(10);
        bio.add(6);

        grades.add(math);
        grades.add(art);
        grades.add(music);
        grades.add(bio);

        System.out.println(names.get(0));
        for (int i = 0; i < grades.size(); i++) {
            int sum=0;
            int n=0;
            for (int j = 0; j < grades.get(i).size(); j++) {
                sum+=grades.get(i).get(j);
                n++;
            }
            System.out.print(sum/n + " ");

        }
    }
}
