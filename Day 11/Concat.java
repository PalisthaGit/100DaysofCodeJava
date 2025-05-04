// String Concatenation: Concatenate two strings and print the result.

import java.util.Scanner;

public class Concat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");

        String str = input.next();
        System.out.println("Enter second string:");
        String str2 = input.next();

        System.out.println(str + str2);
        input.close();
    }
}
