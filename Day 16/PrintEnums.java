// Write a program which performs the following tasks:
// Initialise an enum named weekdays which contains strings from Monday to Sunday
// Print all the elements in the enum weekdays
enum weekdays {
    Monday,
    Tuesday,
    Wednesday,
    Thrusday,
    Friday,
    Saturday

}

public class PrintEnums {
    public static void main(String[] args) {

        for (weekdays week : weekdays.values()) {
            System.out.println(week);
        }
    }
}
