// Convert a String to an Integer
// Convert a String to a Float
// Convert an Integer to a String using valueOf() method
// Convert an Integer to a String using toString() method

public class TypeConversion {
    public static void main(String[] args) {
        String number = "18";
        int stringNumber = Integer.parseInt(number);
        System.out.println(stringNumber + 8);

        double stringDouble = Double.parseDouble(number);

        System.out.println(stringDouble + 8);

        int number2 = 39;
        String str = Integer.toString(number2);

        System.out.println(str);

        String str2 = String.valueOf(2);
        System.out.println(str2);

    }
}
