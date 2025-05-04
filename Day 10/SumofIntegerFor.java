// Write a program that reads an input integer 'n' and prints the sum of integers from 1 to 'n' 
// using three different types of loops: for loops.

import java.util.Scanner;

public class SumofIntegerFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = input.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {

            sum += i;

        }
        System.out.println(sum);
    }
}
