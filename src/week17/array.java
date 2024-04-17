package week17;

import static java.lang.Math.random;

public class array {
    public static void main(String[] args) {
        int [] hours = new int[6];   //[][][][][][]
        for(int i = 0; i <= 6; i++){
            int random = (int) (random() * 5);
            hours[i] = random;
        }

        System.out.println("output");
        for(int i = 0; i < 6; i++){
            System.out.println(hours[i]);
        }
    }
}
