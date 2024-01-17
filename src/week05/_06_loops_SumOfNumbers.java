package week05;

import java.util.Scanner;

public class _06_loops_SumOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive integer number: ");
        int number = scan.nextInt(); // 10
        int sum = 0;

//        for (int i = 1; i < number; i++) {
//            sum = sum + i;
//        }
        int count = 1;
        do{
            sum = sum + count;  // sum =+ count
            count++;
        }while(count < number);

        System.out.println("sum = " + sum);
    }
}
