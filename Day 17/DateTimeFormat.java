// Print the current date in the following time zones: GMT, CST, IST

import java.time.ZonedDateTime;

public class DateTimeFormat {
    public static void main(String[] args) {
        ZonedDateTime gmt = ZonedDateTime.now();
        System.out.println(gmt);

        ZonedDateTime cst = ZonedDateTime.now();
        System.out.println(cst);

        ZonedDateTime ist = ZonedDateTime.now();
        System.out.println(ist);
    }
}
