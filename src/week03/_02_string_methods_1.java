package week03;

public class _02_string_methods_1 {
    public static void main(String[] args) {
        // Create a string variable and assign "Bucharest";
        // 1. find out the number of character
        // 2. find out if this text has a "w" letter
        // 3. convert all the text to the upper case
        // 4. convert all the text to the lower case
        // 5. is this variable holding the following value "Bucuresti";

        String city = "Bucharest";

        System.out.println(city.length());

        System.out.println(city.contains("w"));

        System.out.println(city.toUpperCase());

        System.out.println(city.toLowerCase());

        System.out.println(city.equals("Bucuresti"));

    }
}
