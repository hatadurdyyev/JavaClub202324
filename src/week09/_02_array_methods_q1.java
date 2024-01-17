package week09;

import java.util.Arrays;
import java.util.Scanner;

public class _02_array_methods_q1 {
    public static void main(String[] args) {
//        step 1: Ask a user to input sentences and
//        step 2: then by using the split method assign each word to the array of elements
//        step 3: by using the for loop display all the words in the array
//        step 4. by using the toString method display all the words in the array

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter sentences: ");
        String text = scan.nextLine(); // Hello my name is Hoja

        String arr[] = text.split(" ");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println(Arrays.toString(arr));

    }
}
