package week04;

import java.util.Scanner;

public class _08_exercise_2 {
    public static void main(String[] args) {
        // Ask a user to enter their born year and then display the number of days that he/she lived
        // 365 days         (2021 - 2000) * 365 + (2021 - 2000) / 4

        Scanner scanN = new Scanner(System.in);
        System.out.println("Enter the current year: ");
        int currentYear = scanN.nextInt();

        System.out.println("Enter your born year: ");
        int bornYear = scanN.nextInt();
//                            16
        int calDay = (currentYear - bornYear) * 365 + (currentYear - bornYear) / 4;
        System.out.println("The number of days that he/she lived = " + calDay);
    }
}
