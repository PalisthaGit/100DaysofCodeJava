
// Day 22: Stack
// Write a program that performs the following tasks:
// Initialise a Stack of String values and push items to it
// Remove the top element from the Stack
// Print the top element of the Stack without removing from it
// Check if a value exists in the Stack
// Print the number of values(size) in the Stack
// Remove all values from the Stack
import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {

        Stack<String> number = new Stack<>();
        number.push("2");
        number.push("33");
        number.push("333");
        number.push("33333");

        System.out.println(number);

        number.pop();
        System.out.println(number);
        System.out.println(number.peek());
        System.out.println(number.contains("22"));
        System.out.println(number.size());
        number.clear();
        System.out.println(number);
    }
}
