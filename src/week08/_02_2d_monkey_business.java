package week08;

import java.util.Scanner;

public class _02_2d_monkey_business {
    public static void main(String[] args) {
        Scanner scanP = new Scanner(System.in);
        int row = 3, col = 5, mn = 999, mx = -999, sum = 0;

        int monkeys[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                monkeys[i][j] = scanP.nextInt();
                sum += monkeys[i][j];
                mn = Math.min(monkeys[i][j], mn);
                mx = Math.max(monkeys[i][j], mx);
            }
        }

        System.out.println("Average = " + sum/15);
        System.out.println("min = " + mn);
        System.out.println("max = " + mx);


    }
}
