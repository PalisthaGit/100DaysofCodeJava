// String Reversal: Reverses a given string and print the result

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");

        String str = input.nextLine();

        StringBuilder sb = new StringBuilder(str);

        String rev = sb.reverse().toString();
        System.out.println(rev);
        input.close();
    }
}
