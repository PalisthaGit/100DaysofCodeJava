// 2. Write a program that utilizes the following compound operators +=, -=, \*=, /=, and %=.

public class Compound {
    public static void main(String[] args) {
        int number1 = 19;
        int number2 = 90;
        number1 += number2;
        System.out.println(number1);
        number1 -= number2;
        System.out.println(number1);
        number1 *= number2;
        System.out.println(number1);

        number1 /= number2;
        System.out.println(number1);
        number1 %= number2;
        System.out.println(number1);

    }
}
