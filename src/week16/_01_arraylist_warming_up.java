package week16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _01_arraylist_warming_up {
    // Create an arraylist and add 5 names. 
    // Then remove 3 of the names and display the remaining names
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        List <String> list = new ArrayList<>();
        list.add("Jack");
        list.add("James");
        list.add("Jessica");
        list.add("John");
        list.add("Jade");
        /*for (int i = 0; i < 5; i++) {
            String name = scan.nextLine();
            list.add(name);
        }*/
        list.remove("Jack");
        list.remove(1);
        for (String name : list) {
            System.out.println("name = " + name);
        }
    }
}
