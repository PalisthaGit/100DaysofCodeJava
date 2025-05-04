// Write a program that reads user input and print it to the console.
// 2. Modify the program to read and print different data type inputs (integers, floating-point numbers, strings)
// 3. Write a program to read the user input using Scanner class

import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        System.out.println(number);

        System.out.println("Enter a double number:");

        double doubleNumber = input.nextDouble();
        System.out.println(doubleNumber);

        System.out.println("Enter a text");
        String text = input.next();

        System.out.println(text);

        System.out.println("Enter a character");
        char character = input.next().charAt(0);
        System.out.println(character);
        

    }
}
