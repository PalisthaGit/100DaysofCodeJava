// Initialise a StringBuffer with value "Hello" and append a space and "World" and print it

public class UseStringBuffer {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Hello");
        str.append(" ");
        str.append("World");
        System.out.println(str);
    }
}
