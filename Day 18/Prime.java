// 1. Define a function (method) "isPrime" that takes an integer as a parameter and returns a boolean(true/false) whether the integer is a prime number

public class Prime {

    public static boolean isPrime(int number) {
        int flag = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int number = 2;
        System.out.println(isPrime(number));
    }
}
