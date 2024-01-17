package week04;

import java.util.Scanner;

public class _07_exercise_1 {
    public static void main(String[] args) {
        //Ask a user to enter 3-digit numbers and write a program to display the number as following
        // example : 123  -- > 321

        Scanner scanP = new Scanner(System.in);
        System.out.print("Enter 3 digit number: ");
        int num = scanP.nextInt();
        System.out.println("num = " + num);
        
        int ones = num % 10;
        System.out.println("ones = " + ones);
        
        int tens = (num / 10) % 10;
        System.out.println("tens = " + tens);
        
        int hundreds = (num / 100) % 10;
        System.out.println("hundreds = " + hundreds);

        System.out.println(ones * 100 + tens * 10 + hundreds);


    }
}
