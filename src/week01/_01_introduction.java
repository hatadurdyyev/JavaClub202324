package week01;

import java.util.Scanner;

public class _01_introduction {
/*
    #include <iostream>
    cin >> a;
 */
    public static void main(String[] args) {
        // Create two variables as age and name
        // Ask to the user to enter values for these var.
        // and then display them
        Scanner scanP = new Scanner(System.in);
        Scanner scanN = new Scanner(System.in);

        System.out.print("How old are you? ");
        byte x = scanP.nextByte();
        System.out.println("age = " + x);

        String name;
        System.out.print("What is your name? ");
        name = scanN.nextLine();
        System.out.println("name = " + name);


    }
}
