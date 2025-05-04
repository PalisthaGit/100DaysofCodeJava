
// Substring Extraction:Extract a substring from a given string and print it
import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");

        String str = input.nextLine();
        String substr = str.substring(3, 8);
        System.out.println(substr);
        input.close();
    }

}
