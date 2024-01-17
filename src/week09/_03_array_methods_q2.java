package week09;

import java.util.Arrays;

public class _03_array_methods_q2 {
    public static void main(String[] args) {
//        Step 1: Create you have 2D array {12, 13, 14, 15, 16}{11, 13, 14, 15, 16}
//        Step 2: Display all the elements in this 2D array
//        Step 3: Split the 2D array into a 1D array and compare the arrays.  // compare or equals
//        Step 4: If the array elements are not equal then display all the elements that are different

        int arr[][] = {{12, 13, 14, 15, 16},{11, 13, 14, 65, 16}};

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int row1[] = arr[0];
        int row2[] = arr[1];
        System.out.println(Arrays.toString(row1));
        System.out.println(Arrays.toString(row2));

        System.out.println();

        if (Arrays.compare(row1, row2) == 0){
            System.out.println("They are same");
        }else {
            for (int i = 0; i < row1.length; i++) {
                if (row1[i] != row2[i]){
                    System.out.println("1D: " + row1[i] + " , 2D: " + row2[i]);
                }
            }
        }




    }
}
