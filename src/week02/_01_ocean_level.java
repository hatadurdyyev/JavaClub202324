package week02;

public class _01_ocean_level {
    /*
    Ocean Levels
        Assuming the ocean's level is currently rising at about 1.5 millimeters per year, write a
        program that displays:
            * The number of millimeters higher than the current level that the ocean s level will
                be in 5 years
            * The number of millimeters higher than the current level that the ocean s level will
                be in 7 years
            * The number of millimeters higher than the current level that the ocean s level will
                be in 10 years
     */

    public static void main(String[] args) {
        int x,a,b,c;
        x=1500000;
        a=x*5;
        b=x*7;
        c=x*10;
        System.out.println(x + " ml (now) < "+a + " ml (in 5 years)   ==>  " + (a-x) + " ml higher");
        System.out.println(x + " ml (now) < "+b + " ml (in 7 years)  ==>  " + (b-x) + " ml higher");
        System.out.println(x + " ml (now) < "+c + " ml (in 10 years)  ==>  " + (c-x) + " ml higher");
    }
}
