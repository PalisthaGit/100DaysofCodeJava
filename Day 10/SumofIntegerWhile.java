
// Write a program that reads an input integer 'n' and prints the sum of integers from 1 to 'n' 
// using three different types of loops:  while loops.

import java.util.Scanner;

public class SumofIntegerWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = input.nextInt();
        int sum = 0;

        while (n > 0) {
            sum += n;
            n--;
        }
        System.out.println(sum);
    }
}
