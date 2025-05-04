// Modify the above program to read decimal numbers as the length and width, 
// and output the area to two decimal points

import java.util.Scanner;

public class AreaDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length:");
        double length = input.nextDouble();

        System.out.println("Enter width");
        double width = input.nextDouble();

        double area = length * width;
        String result = String.format("%.2f", area);

        System.out.println(result);
    }

}
