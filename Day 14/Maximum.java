// Initialise a 3x4 2D-Array with the above values
// Write a function that takes a 2D array as the parameter and returns an array with the maximum value of each row. For the above example, the function should return the array [78, 90, 89]

import java.util.Arrays;

public class Maximum {

    public static int[] maxInEachRow(int arr[][]) {
        int maxElements[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int maxElement = -1;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > maxElement) {
                    maxElement = arr[i][j];
                }

            }
            maxElements[i] = maxElement;
        }
        return maxElements;
    }

    public static void main(String[] args) {
        int[][] arr = { { 23, 45, 78, 12 }, { 56, 90, 34, 67 }, { 89, 21, 43, 76 } };
        int maxRow[] = maxInEachRow(arr);
        System.out.println(Arrays.toString(maxRow));
    }

}
