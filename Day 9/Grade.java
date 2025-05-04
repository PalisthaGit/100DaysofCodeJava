// 1. Write a program that reads the percentage and then prints their 
// corresponding letter grade (A, B, C, D, or F) using switch statement
// Percentage (%)	Grade
// 90–100	A
// 80–89	B
// 70–79	C
// 60–69	D
// Below 60	F

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your grade");

        int percent = input.nextInt();

        switch (percent / 10) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;

            default:
                System.out.println("F");
                break;
        }

    }
}
