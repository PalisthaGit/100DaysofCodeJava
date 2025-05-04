// Write a program that performs the following tasks using Math class:
// Maximum of 2 numbers
// Minimum of 2 numbers
// Square root of a number
// Floor and Ceil of a float
// Abs value of a double

public class UseMath {
    public static void main(String[] args) {
        int number1 = 89;
        int number2 = 90;

        int max = Math.max(number1, number2);
        System.out.println("Maximum of two numbers: " + max);

        int min = Math.min(number1, number2);
        System.out.println("Minimum of two numbers: " + min);

        double sqrt = Math.sqrt(number1);
        System.out.println("sqrt of number1: " + sqrt);

        double floorValue = Math.floor(sqrt);
        System.out.println("Floor of sqrt: " + floorValue);

        double celingValue = Math.ceil(sqrt);
        System.out.println("Celing of sqrt: " + celingValue);

        double absValue = Math.sqrt(sqrt);
        System.out.println("abs of sqrt: " + absValue);

    }

}
