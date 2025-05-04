// String Searching: Search for a specific substring within a given 
// string and print whether it is found or not

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");

        String str = input.nextLine();
        System.out.println("Enter string to find:");

        String toFind = input.nextLine();
        if (str.contains(toFind)) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }
        input.close();
    }
}
