package week03;

import java.util.Scanner;

public class _01_introduction_to_string {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String var1 = "amazon company";

        // contain
        System.out.println("String contains 'a': " + var1.contains("a"));

        // length
        System.out.println("String length: " + var1.length());

        // chatAt
        System.out.println("String charAt(3): " + var1.charAt(3));

        // indexOf
        System.out.println("String indexOf('a'): " + var1.indexOf("z"));

        // lastIndexOf
        System.out.println("String lastIndexOf('a'): " + var1.lastIndexOf('a'));

        // toUpperCase
        System.out.println("String toUpperCase: " + var1.toUpperCase());

        // toLowerCase
        System.out.println("String toLowerCase: " + var1.toLowerCase());

        // equals
        System.out.println("String equals: " + var1.equals("Amazon Company"));

        // equalsIgnoreCase
        System.out.println("String equalsIgnoreCase: " + var1.equalsIgnoreCase("Amazon Company"));


        // substring  --> if you provide only one index, it will return a string from that point till end
        System.out.println("String substring(1): " + var1.substring(1));

        // substring  --> if you provide only two indexes, it will return a string between those indexes
        System.out.println("String substring(1, 3): " + var1.substring(1, 3));

        // concat
        System.out.println("String concat(): " + var1.concat(" apple company"));
    }
}
