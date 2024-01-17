package week01;
import java.util.Scanner;

public class _02_introduction {
    public static void main(String[] args) {


        //   single line commenting
        /*   multiple line commenting    */


        // Primitive Data Types  --> using scanP
        /*
        Scanner scanP = new Scanner(System.in);

        boolean a = scanP.nextBoolean();
        byte b = scanP.nextByte();
        short c = scanP.nextShort();
        int d = scanP.nextInt();
        long e = scanP.nextLong();
        float f = scanP.nextFloat();
        double g = scanP.nextDouble();
*/

        // Non-primitive Data Types --> using scanN
        Scanner scanN = new Scanner(System.in);
        String h = scanN.nextLine(); // in the nextLine() method, it is accepting all text even if there are space between them
        System.out.println(h);
        String i = scanN.next();    // in the next() method, it is only accepting words up to a space
        System.out.println(i);

    }
}
