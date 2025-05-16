// Write a function that takes an ArrayList and a charater as parameters and removes all the elements from the arraylist that start with the given character. 
// For example: if the parameters are weekdays and the charater 't', then Tuesday and Thursday should be removed from the arraylist weekdays

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveStartingFrom {
    public static void main(String[] args) {
        ArrayList weekdays = new ArrayList<>();
        weekdays.add("Sunday");
        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Thrusday");
        weekdays.add("Friday");
        weekdays.add("Saturday");

        removeElement(weekdays, 'T');
        System.out.println(weekdays);

    }

    public static void removeElement(ArrayList<String> weekdays, char ch) {

        Iterator<String> iterator = weekdays.iterator();
        while (iterator.hasNext()) {
            String day = iterator.next();
            if (day.charAt(0) == ch) {
                iterator.remove();
            }
        }

    }
}
