// 3. Write a program that checks if a given input year is a leap year or not

// Summary Rule:
// A year is a leap year if:

// It is divisible by 4 and not divisible by 100, or

// It is divisible by 400.
import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year to check:");

        int year = input.nextInt();

        if (year % 400 == 0) {
            System.out.println(year + " is a leap year");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " is a leap year");

        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
