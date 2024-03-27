package week13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class _02_overloading_methods_ex {
    /*
    Create an int array with 5 elements
    - Ask a user to fill the array with random numbers
    - Create assignNumber function that assigns 0 to the odd numbers in the array that has been filled by the user
        For example, if the user enters the following numbers -> [1, 2, 3, 4, 5]
                                                                 [0, 2, 0, 4, 0]
 */

    public static int[] assignNumber(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1){
                arr[i] = 0;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            int randomNumber = (int) (Math.random() * 10) + 1;
            arr[i] = randomNumber;
        }
        System.out.println(  Arrays.toString(arr)  );
        assignNumber(arr);
        System.out.println(  Arrays.toString(arr)  );

    }
}
