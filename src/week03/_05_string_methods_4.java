package week03;

public class _05_string_methods_4 {
    /* Ask user to input their full name (firstName, middleName, lastName) with a lowercase characters
           Note: assume they enter their name as 'iasmin ioana diana'
           - to find the first space, you can use indexOf string method
           - to find the second space,  you can use lastIndexOf string method
         */

    public static void main(String[] args) {
        String fullName = "iasmin ioana diana";

        int space1 = fullName.indexOf(" ");
        int space2 = fullName.lastIndexOf(" ");

        String ffl = fullName.substring(0,1);
        String sfl = fullName.substring(space1+1, space1+2);
        String tfl = fullName.substring(space2+1, space2+2);

        System.out.println(ffl.toUpperCase().concat(fullName.substring(1, space1+1))
                .concat(sfl.toUpperCase().concat(fullName.substring(space1+2, space2+1)))
                .concat(tfl.toUpperCase().concat(fullName.substring(space2+2)))
        );


    }
}
