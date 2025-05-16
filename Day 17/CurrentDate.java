// Initialise a date variable with the current date as value and print it
// Print the current epoch time

import java.time.LocalDate;
import java.util.Date;

public class CurrentDate {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        Date epochDate = new Date(0);
        System.out.println(epochDate);

    }

}
