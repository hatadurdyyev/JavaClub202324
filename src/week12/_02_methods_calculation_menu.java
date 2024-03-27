package week12;

import java.util.Scanner;

public class _02_methods_calculation_menu {
    /* Your program should display the below menu/option for the user to choose
                1. Addition     (num1 and num2)
                2. Subtraction
                3. Division
                4. Multiplication
                5. Exit

       Then it should be asking the user to input the values to the program.
*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Addition \n2. Subtraction \n3. Division");
        System.out.println("Which of the operations do you want to perform? ");
        int choice = scan.nextInt();

        switch (choice){
            case 1:
                System.out.println("this is an addition method");
                break;
            case 2:
                System.out.println("this is a subtraction method");
                break;
            case 3:
                return;
            default:
                System.out.println("try again");
                break;
        }

    }
}
