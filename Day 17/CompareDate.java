// Initialise a date variable with the date 7 days before the current day
// Compare 2 dates with before, after and compareTo methods

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class CompareDate {
    public static void main(String[] args) {
        Date today = new Date();
        // Create a Calendar instance
        Calendar cal = Calendar.getInstance();
        cal.setTime(today); // set it to today's date

        // Subtract 7 days
        cal.add(Calendar.DAY_OF_MONTH, -7);

        // Get the result as a Date
        Date sevenDaysAgo = cal.getTime();
        System.out.println(sevenDaysAgo);

        System.out.println(today.before(sevenDaysAgo));
        System.out.println(today.after(sevenDaysAgo));
        System.out.println(today.compareTo(sevenDaysAgo));
    }
}
