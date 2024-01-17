package week04;

public class _02_string_startsWith {
    public static void main(String[] args) {
        String text = "Java Club ";

        System.out.println("endsWith 'j': " + text.startsWith("j"));
        System.out.println("endsWith 'ja': " + text.startsWith("ja"));
        System.out.println("endsWith ' ': " + text.startsWith(" "));
        System.out.println("endsWith 'J': " + text.startsWith("J"));
    }
}
