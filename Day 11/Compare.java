// String Comparison: Compare two strings and print whether they are equal or not.

import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");

        String str = input.next();
        System.out.println("Enter second string:");
        String str2 = input.next();

        if (str.equals(str2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not same");
        }
        input.close();
    }
}
