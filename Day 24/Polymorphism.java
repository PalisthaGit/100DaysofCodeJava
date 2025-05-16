class MathUtils {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        MathUtils mu = new MathUtils();

        int sum = mu.add(2, 3);
        System.out.println(sum);

        sum = mu.add(34, 34);
        System.out.println(sum);
    }
}
