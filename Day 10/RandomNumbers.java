// 3. Write a program that generates random numbers between 1 and 100 until it finds a 
// number divisible by both 5 and 7. 
// When the number is found, print it and terminate the loop using the break statement.

public class RandomNumbers {
    public static void main(String[] args) {

        while (true) {
            int random = (int) (Math.random() * 100) + 1;
            if (random % 5 == 0 && random % 7 == 0) {
                System.out.println(random);
                break;
            }

        }
        System.out.println("Program executed");
    }
}
