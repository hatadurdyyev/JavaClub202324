package week05;

import java.util.Scanner;

public class _03_if_elseif_statement {
    /*
        Assume the user enters 3 integer numbers (for example: 34, 23, 45)
        Write a program that compares these three numbers and display the smallest one (use conditional statements)
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a < b && a < c){
            System.out.println("a is the smallest = " + a);
        }else if (b < a && b < c){
            System.out.println("b is the smallest = " + b);
        }else {
            System.out.println("c is the smallest = " + c);
        }
    }
}
