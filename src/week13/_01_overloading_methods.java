package week13;

public class _01_overloading_methods {
    public static int average(int... s1){
        int sum = 0;
        for (int i = 0; i < s1.length; i++) {
            sum+=s1[i];
        }

        for (int j : s1) {
            sum += j;
        }




        return sum / s1.length;
    }


    public static void main(String[] args) {
        int  s1 = average(5, 4, 8, 7, 6, 5);  // 6
        int  s2 = average(10, 9, 8, 7, 6);     // 5
        int  s3 = average(10, 9, 8, 70);        // 4
        int  s4 = average(10, 9, 8);           // 3
        int  s5 = average(10, 9);              // 2

        System.out.println(average(s1));
    }
}
