abstract class Animal {
    public abstract void sound();

    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Dot barks");
    }
}

public class AbstractMain {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        a.sleep();
    }
}
