// Write a program to declare and initialize an array of integers. 
// Loop through the array and compute the average of the numbers.

public class Average {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int sum = 0;
        for (int i = 0; i <= arr.length; i++) {

            sum += i;

        }

        double average = sum / arr.length;
        System.out.println(average);
        
    }
}
