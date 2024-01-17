package week04;

import java.sql.SQLOutput;
import java.util.Scanner;

public class _09_if_ifelse_statement {
    /*
    Squid game:
    by using string variable ask a user to enter one of the following colors:  red or green
    write an if else_if statement that compares the inputs with red/green colors and
        - if the users' input is equal to red, then display "Stop"
        - if the users' input is equal to green, then display "Move on or Continue"
        - if the user enters any other color, inform the user to enter red/green
 */
    public static void main(String[] args) {
        Scanner scanN = new Scanner(System.in);
        System.out.println("Enter red/green: ");
        String color = scanN.next();
        /*
        if (   condition area  ){
            statement area
        }
         */
        if (color.equalsIgnoreCase("red")) {
            System.out.println("Stop");
        } else {

            if (color.equalsIgnoreCase("green")){
                System.out.println("Move on or Continue");
            }else {
                System.out.println("Try again by entering red/green");
            }

        }

    }


}
