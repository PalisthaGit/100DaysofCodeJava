// 1. Write a program that reads an input integer 'n' and prints the sum of 
// integers from 1 to 'n' using three different types of loops: do-while loops.

import java.util.Scanner;

public class SumofIntegerDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = input.nextInt();
        int sum = 0;

       
       do{
        sum +=n;
        n--;
       }while(n > 0);

        System.out.println(sum);
    }
}
