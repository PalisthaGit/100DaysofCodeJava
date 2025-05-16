// Sort the elements of weekdays alphabetically in increasing order and print them again

import java.util.ArrayList;
import java.util.Collections;

public class SortWeekdayAsc {
    public static void main(String[] args) {
        ArrayList weekdays = new ArrayList<>();
        weekdays.add("Sunday");
        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Thrusday");
        weekdays.add("Friday");
        weekdays.add("Saturday");

        Collections.sort(weekdays);
        
        System.out.println(weekdays);

    }
}
