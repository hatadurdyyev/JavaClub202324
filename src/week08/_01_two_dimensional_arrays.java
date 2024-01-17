package week08;

import java.util.Scanner;

public class _01_two_dimensional_arrays {
    public static void main(String[] args) {

        //                       row col
        int [][] arrays = new int[2][3];
        Scanner scan = new Scanner(System.in);
        int sum = 0;

        for (int row = 0; row < 2; row++){
            for (int col = 0; col < 3; col++){
                //     row col
                arrays[row][col] = scan.nextInt();
                sum += arrays[row][col];
            }
        }

        System.out.println("sum = " + sum);
        //       0    1    2
        // row 0 [10][11][12]
        // row 1 [13][14][15]

        for (int row = 0; row < 2; row++){
            for (int col = 0; col < 3; col++){
                System.out.println(arrays[row][col]);
            }
        }

    }
}
