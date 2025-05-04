// String Splitting: Split a given string into substrings 
// based on a delimiter and prints the resulting substrings.

import java.util.Scanner;

public class Split {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");

        String str = input.nextLine();
        String words[] = str.split(",");

        for (String word : words) {
            System.out.println(word);

        }

        input.close();
    }
}
