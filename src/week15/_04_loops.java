package week15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _04_loops {
    // while
    // do-while
    // for

    public static void main(String[] args) {
        int count = 0;
        while(count < 10){ // pre-test loop
            //System.out.println(count);
            count++;
            //System.out.println("Hello");
        }

        int counter = 0;
        do{ //post-test loop
            //System.out.println(counter);
            //System.out.println("Hello World");
            counter++;
        }while (counter < 10);

        for (int i = 0; i < 5; i++) {
            System.out.println("For loop");
        }

        int [] arr = {3,4,6,7,8};
        for (int x : arr) {
            System.out.println(x);
        }

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }


}
