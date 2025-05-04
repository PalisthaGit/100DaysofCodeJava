// String Case Conversion: Convert a given string to uppercase and lowercase and print the result.

import java.util.Scanner;

public class ChangeCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");

        String str = input.next();
        System.out.println("Lower Case: " + str.toLowerCase());
        System.out.println("Upper Case: " + str.toUpperCase());
        input.close();
    }
}
