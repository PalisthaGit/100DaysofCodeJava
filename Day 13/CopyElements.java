// 2. Write a program to copy elements from one array to another array
public class CopyElements {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] copy = new int[5];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];

        }
        for (int i = 0; i < copy.length; i++) {
            System.out.println(copy[i]);
        }
    }
}
