// String Trimming: Remove leading and trailing whitespace from a given string and print the result.

import java.util.Scanner;

public class RemoveWhileSpace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");

        String str = input.nextLine();
        String stringTrimmed = str.trim();
        System.out.println("Before [" + str + "]");

        System.out.println("After[" + stringTrimmed + "]");
        input.close();
    }
}
