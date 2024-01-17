package week06;

import java.util.Scanner;

public class _01_arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // variable declaration and assigning values
        int number = 10;

        // array declaration and assigning values
        int nums[] = {12,23,34,56,67,79,12,12, 34, 45};


        int numbers[] = new int[5];

        // Input
        for (int i = 0; i < 5; i++) {
            System.out.print("Element #" + i + ": ");
            numbers[i] = scan.nextInt();
        }
        // Output
        for (int i = 0; i < 5; i++) {
            System.out.println("Element #" + i + ": " + numbers[i]);
        }

    }
}
