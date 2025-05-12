// Write a function that takes nxm 2D array as a parameter 
// and returns a mxn 
// transformation of the input 2D array

import java.util.Arrays;

public class Transformation {
    public static int[][] transpose(int arr[][]) {
        int rowSize = arr.length;
        int colSize = arr[0].length;

        int transposedArray[][] = new int[colSize][rowSize];

        for (int row = 0; row < rowSize; row++) {
            for (int col = 0; col < colSize; col++) {
                transposedArray[col][row] = arr[row][col];
            }
        }
        return transposedArray;
    }

    public static void main(String[] args) {
        int[][] arr = { { 23, 45, 78, 12 }, { 56, 90, 34, 67 }, { 89, 21, 43, 76 } };
        int transposeArr[][] = new int[4][3];
        transposeArr = transpose(arr);
        System.out.println(Arrays.deepToString(transposeArr));
    }
}
