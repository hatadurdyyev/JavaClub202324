package week01;
import java.util.Scanner;    // #include <iostream>

public class _03_introduction {
    // main  ---> shortcut for the main method
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = scan.nextInt();

        // sout --->  shortcut for output
        System.out.println("The number is: " + number + "\n");               // cout << "The number is: "  << number  << endl;

        Scanner scanS = new Scanner(System.in);
        String text = scanS.nextLine();
        System.out.println("text = " + text);

    }

}