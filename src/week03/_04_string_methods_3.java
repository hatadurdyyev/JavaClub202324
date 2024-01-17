package week03;

public class _04_string_methods_3 {
    // create a string variable and enter your full name with lower case. "ana maria"  --> Ana Maria
    public static void main(String[] args) {
        String fullName = "ana maria";
        
        String firstFL = Character.toString(fullName.charAt(0));
        String secondFL = Character.toString(fullName.charAt(4));

        System.out.println(firstFL.toUpperCase().concat(fullName.substring(1,4)).
                concat(secondFL.toUpperCase().concat(fullName.substring(5))));
        
        
        
    }
}
