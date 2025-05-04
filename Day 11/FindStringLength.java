// String Length: Calculate and print the length of a given string.

import java.util.Scanner;

public class FindStringLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");


        String str = input.next();
        System.out.println("Length of string: " + str.length());
        input.close();
    }
}