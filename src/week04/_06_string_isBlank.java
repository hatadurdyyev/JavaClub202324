package week04;

public class _06_string_isBlank {
    public static void main(String[] args) {
        String text = "Winter vacation";
        String text1 = "";
        String text2 = " ";

        System.out.println("string isBlank method = " + text.isBlank());
        System.out.println("string isBlank method = " + text1.isBlank());
        System.out.println("string isBlank method = " + text2.isBlank());
    }
}
