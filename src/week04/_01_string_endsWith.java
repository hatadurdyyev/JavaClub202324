package week04;

public class _01_string_endsWith {
    public static void main(String[] args) {
        String text = "Java Club ";

        System.out.println("endsWith 'b': " + text.endsWith("b"));
        System.out.println("endsWith 'ub': " + text.endsWith("ub"));
        System.out.println("endsWith ' ': " + text.endsWith(" "));
        System.out.println("endsWith 'w': " + text.endsWith("w"));
    }
}
