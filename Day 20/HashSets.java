
// Day 20: Set/HashSet
// Write a program that performs the following tasks:
// Initialise a Set of String values and add items to it
// Check if a value exists in the Set
// Remove a value from the Set
// Print the number of values(size) in the Set
// Print all the values one by one by looping through the Set
// Remove all values from the Set
import java.util.HashSet;

public class HashSets {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("BMW");
        cars.add("Maruti");
        cars.add("Ferrari");
        cars.add("Deepal");
        cars.add("Tesla");

        System.out.println(cars);
        System.out.println(cars.contains("Deepal"));
        cars.remove("Tesla");
        System.out.println(cars);
        System.out.println(cars.size());
        for (String car : cars) {
            System.out.println(car);
        }
        cars.clear();
        System.out.println(cars);
    }

}
