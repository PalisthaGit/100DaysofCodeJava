// 1. Write a program to generate a random number.
// 2. Write a program to generate a random number between two integers

public class RandomNumber {
    public static void main(String[] args) {
        System.out.println(Math.random());
        System.out.println((int) (Math.random() * 5) + 1);
    }
}
