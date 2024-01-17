package week09;

import java.util.Arrays;

public class _01_array_methods {
    public static void main(String[] args) {
        int [] arr = new int[5];

        System.out.println("Before any methods: " + Arrays.toString(arr));

        Arrays.fill(arr, 12);
        System.out.println("After fill methods: " + Arrays.toString(arr));

        int [] num1 = {1,2,3};
        int [] num2 = {1,2,3};
        int [] num3 = {1,3,2};
        System.out.println("Compare method: " + Arrays.compare(num1, num2));
        System.out.println("Compare method: " + Arrays.compare(num3, num2));
        System.out.println("Equals method: " + Arrays.equals(num1, num2));
        System.out.println("Equals method: " + Arrays.equals(num1, num3));

        System.out.println("Before sort method: " + Arrays.toString(num3));
        Arrays.sort(num3);
        System.out.println("After sort method: " + Arrays.toString(num3));

        String numbers = "12 11 22 34 45";
        String [] num = numbers.split(" ");
        System.out.println("string split method: " + Arrays.toString(num));

        String text = "Adam John Brandon";
        String [] name = text.split(" ");
        System.out.println("Arrays.toString(name) = " + Arrays.toString(name));

    }
}