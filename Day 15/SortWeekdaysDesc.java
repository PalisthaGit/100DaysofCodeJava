import java.util.ArrayList;
import java.util.Collections;

public class SortWeekdaysDesc {
    public static void main(String[] args) {

        ArrayList weekdays = new ArrayList<>();
        weekdays.add("Sunday");
        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Thrusday");
        weekdays.add("Friday");
        weekdays.add("Saturday");

        Collections.sort(weekdays, Collections.reverseOrder());

        System.out.println(weekdays);
    }
}
