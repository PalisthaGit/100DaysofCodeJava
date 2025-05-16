// Write a program that performs the following tasks:
// Initialise a HashMap named students with Integer key and String value to save roll-numbers and names of students
// Add items to the HashMap students
// Access items from the students HashMap using get() and print the students name
// Check if a key exists in the HashMap
// Remove an item from the HashMap
// Print the number of elements(size) in the HashMap
// Print all the students names one by one by looping through the HashMap using keySet()
// Print all the students names one by one by looping through the HashMap using entrySet()

import java.util.HashMap;
import java.util.Map.Entry;

public class Hashmaps {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<Integer, String>();
        students.put(11, "Romania");
        students.put(12, "Silu");

        System.out.println(students.get(11));
        System.out.println(students.containsKey(90));
        students.remove(11);
        System.out.println(students);
        System.out.println(students.size());
        for (int i : students.keySet()) {
            System.out.println(students.get(i));
        }
        for (Entry<Integer, String> entry : students.entrySet()) {
            System.out.print(entry);
            System.out.print(", ");
        }
    }

}