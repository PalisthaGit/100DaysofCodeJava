// 2. Write a program that reads an input integer 'n' and 
// prints the sum of even integers from 1 to 'n' (use continue).

import java.util.Scanner;

public class PrintEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println("Even numbers up to n:");
            System.out.println(i);
        }
    }
}
