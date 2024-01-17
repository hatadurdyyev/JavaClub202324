package week05;

public class _05_loop_odd_numbers {
    // by using while loop, display all the odd numbers between 1-10;
    // smallest to largest  1-3-5-7-9

    public static void main(String[] args) {
        int counter = 1;
        int userInput = 30;
        int sum = 0;
        while(counter <= userInput){
            sum += counter;  // sum = sum + counter   // 1+2+3+4+5+6+7+8+9+10
            counter += 5;
        }
        System.out.println(sum);

    }
}
