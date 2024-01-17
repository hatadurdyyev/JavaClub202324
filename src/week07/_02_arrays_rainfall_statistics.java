package week07;

import java.util.Scanner;

public class _02_arrays_rainfall_statistics {
    /*
    Write a program that lets the user enter the total rainfall for each of 12 months into an array of doubles.
        The program should calculate and display the total rainfall for the year, the average monthly rainfall,
        and the months with the highest and lowest amounts.
     */

    public static void main(String[] args) {
        Scanner scanP = new Scanner(System.in);
        
        double arr[] = new double[12];
        double sum = 0, mx = 0, mn = 9999;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanP.nextDouble();
        }

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];    // sum +=arr[i]
            mx = Math.max(arr[i], mx);
            mn = Math.min(arr[i], mn);  // [12][11][13][15][14]......
        }

        System.out.println("Total rainfall = " + sum);
        System.out.println("Average rainfall = " + sum / arr.length);
        System.out.println("Max rainfall = " + mx);
        System.out.println("Min rainfall = " + mn);

    }
}
