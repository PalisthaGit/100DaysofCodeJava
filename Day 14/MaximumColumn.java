// Write a function that takes a 2D array as the parameter 
// and returns an array with the maximum value of each column. 
// For above example, the function should return the array 
// [89, 90, 78, 76]

import java.util.Arrays;

public class MaximumColumn {
    public static int[] maxInEachColumn(int arr[][]) {

        int rowSize = arr.length;
        int colSize = arr[0].length;

        int maxColumnArray[] = new int[colSize];

        for (int col = 0; col < colSize; col++) {
            int max = -1;
            for (int row = 0; row < rowSize; row++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
            maxColumnArray[col] = max;
        }
        return maxColumnArray;
    }

    public static void main(String[] args) {
        int[][] arr = { { 23, 45, 78, 12 }, { 56, 90, 34, 67 }, { 89, 21, 43, 76 } };
        int maxColumn[] = maxInEachColumn(arr);
        System.out.println(Arrays.toString(maxColumn));

    }

}
