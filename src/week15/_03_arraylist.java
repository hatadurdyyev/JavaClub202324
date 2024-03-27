package week15;

import java.util.ArrayList;
import java.util.List;

public class _03_arraylist {
    public static void main(String[] args) {
        String arr[] = {"John", "James", "Bran"};
        List<String> list = new ArrayList<>() {
            {
                add("James");
                add("John");
                add("Bran");
            }
        };

        List <String> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            //String x = scan.nextLine();
            //list1.add(x);
        }
        list1.add("sdsdf");
        list1.add("sdgfd");
        list1.add("sadgfs");

    }
}
