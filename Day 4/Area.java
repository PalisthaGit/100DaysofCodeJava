// Write a program that calculates the area of a rectangle. 
// Prompt the user to input the length(integer) and width(integer) of the rectangle, 
// calculate the area (length * width), and print the result.

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter length:");
        int length = input.nextInt();

        System.out.println("Enter width");
        int width = input.nextInt();

        int area = length * width;

        System.out.println(area);

    }
}
