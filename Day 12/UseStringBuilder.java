// Initialise a StringBuilder with value "Hello" and append a space and "World" and print it

public class UseStringBuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        str.append(" ");
        str.append("World");
        System.out.println(str);
    }
}
