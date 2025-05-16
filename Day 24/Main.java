class Person {

    private String name;
    private int age;

    public Person(String name, int age) {

        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Alisha", 15);

        System.out.println(p.getName());
        System.out.println(p.getAge());

        p.setAge(23);
        // wont set age to negative
        p.setAge(-2);
    }
}
