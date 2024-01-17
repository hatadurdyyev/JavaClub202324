package week03;

public class _03_string_methods_2 {
    // Create a string variable and assign "bucharest"; --> Bucharest
    // convert the initial letter to the capital letter

    public static void main(String[] args) {
        String text = "bucharest";

        String initialLetter = text.substring(0, 1);
        String remainingText = text.substring(1);

        System.out.println(initialLetter.toUpperCase().concat(remainingText));
    }
}
