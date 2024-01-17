package week07;

import java.util.Scanner;

public class _03_arrays_salsa_and_chips {
//    Write a program that lets a maker of chips and salsa keep track of sales for ve different types of salsa: mild,
//    medium, sweet, hot, and zesty. The program should use two
//    parallel 5-element arrays: an array of strings that holds the ve salsa names and an
//    array of integers that holds the number of jars sold during the past month for each
//    salsa type. The salsa names should be stored using an initialization list at the time the
//    name array is created. The program should prompt the user to enter the number of
//    jars sold for each type. Once this sales data has been entered, the program should produce a report that displays
//    sales for each salsa type, total sales, and the names of the
//    highest selling and lowest selling products.

    public static void main(String[] args) {
        String salsa[] = {"mild","medium","sweet","hot","zesty"};
        int chips[] = new int[5];

        Scanner scanP = new Scanner(System.in);
        int total = 0;
        for (int i = 0; i < salsa.length; i++) {
            System.out.print(salsa[i] + ": ");
            chips[i] = scanP.nextInt();
            total += chips[i];
        }
        int mx = chips[0], mn = chips[0], mxi = -1, mni = 9899;
        for (int i = 0; i < salsa.length; i++) {
            if (chips[i] > mx){      //[14][12][13][11][15]
                mx = chips[i];
                mxi = i;
            }
        }
        for (int i = 0; i < salsa.length; i++) {
            if (chips[i] < mn){      //[14][12][13][11][15]
                mn = chips[i];
                mni = i;
            }
        }

        System.out.println("total sales = " + total);
        System.out.println(mxi);
        System.out.println("Highest selling salsa is " + salsa[mxi] + " " + chips[mxi]);
        System.out.println("Lowest selling salsa is " + salsa[mni] + " " + chips[mni]);
    }
}
