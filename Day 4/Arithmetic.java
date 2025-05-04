
// 1. Write a program that declares two integer variables and 
// perform basic arithmetic operations (addition, subtraction,
//  multiplication, division) on them. Print the results to the console.

import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");

        int number1 = input.nextInt();
        System.out.println("Enter second number");

        int number2 = input.nextInt();

        int result = number1 + number2;
        System.out.println(result);
        input.close();
    }
}