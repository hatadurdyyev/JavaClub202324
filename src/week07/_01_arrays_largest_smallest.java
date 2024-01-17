package week07;

import java.util.Scanner;

public class _01_arrays_largest_smallest {
//    Write a program that lets the user enter 10 values into an array. The program should
//    then display the largest and smallest values stored in the array.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int row = 2, col = 3;
        int [][] arr1 = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr1[i][j] = scan.nextInt();
            }
        }
        int mn = 9999;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mn = Math.min(mn, arr1[i][j]);
            }
        }
        System.out.println("mn = " + mn);














    }
}
