package week11;

import java.util.Arrays;

public class _00_arrays_bubble_selection_sort {
    public static void main(String[] args) {

        int [] arr ={7, 2, 3, 8, 9, 1, 6, 5, 4};
        int [] array ={7, 2, 3, 8, 9, 1, 6, 5, 4};

        // Selection Sort
        int startScan, minIndex, minValue, size = 9, sCount = 1, bCount = 1;
        for (startScan = 0; startScan < (size - 1); startScan++) {
            minIndex = startScan;
            minValue = arr[startScan];
            for (int index = startScan + 1; index < size; index++) {
                if (arr[index] < minValue) {
                    minValue = arr[index];
                    minIndex = index;
                    sCount++;
                }
            }
            arr[minIndex] = arr[startScan];
            arr[startScan] = minValue;
        }
        System.out.println("Selection Sort: " + sCount);
        System.out.println(Arrays.toString(arr));

        //Bubble Sort
        boolean swap;
        int temp;
        do {
            swap = false;
            for (int count = 0; count < (size - 1); count++) {
                if (array[count] > array[count + 1]) {
                    temp = array[count]; array[count] = array[count + 1]; array[count + 1] = temp;
                    swap = true;
                    bCount++;
                }
            }
        } while (swap);
        System.out.println("Bubble Sort: " + bCount);
        System.out.println(Arrays.toString(array));

    }
}


