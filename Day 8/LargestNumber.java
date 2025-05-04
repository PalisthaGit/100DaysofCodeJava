// 2. Write a program that takes three numbers as input and prints the largest among them

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int number1 = input.nextInt();
        System.out.println("Enter second number");
        int number2 = input.nextInt();
        System.out.println("Enter third number");
        int number3 = input.nextInt();

        if (number1 > number2 && number1 > number3) {
            System.out.println(number1 + " is largest.");

        } else if (number2 > number1 && number2 > number3) {
            System.out.println(number2 + " is largest");
        } else {
            System.out.println(number3 + " is largest");

        }
    }
}
