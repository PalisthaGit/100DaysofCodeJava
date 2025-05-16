
// Day 23: Queue
// Write a program that performs the following tasks:
// Initialise a Queue of String values and add items to it
// Remove the head element from the Queue
// Print the first element of the Queue without removing from it
// Check if a value exists in the Queue
// Print the number of values(size) in the Queue
// Remove all values from the Queue
import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        queue.add("roma");
        queue.add("dfdf");
        queue.add("suna");
        queue.add("asdfasdf");
        queue.add("asdfasdf");

        System.out.println(queue);
        String removedElement = queue.poll();
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println();
        System.out.println(queue.contains("sdfsadf"));
        System.out.println(queue.size());
        queue.clear();
        System.out.println(queue);
    }

}
