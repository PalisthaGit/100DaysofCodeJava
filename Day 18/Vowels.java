// 2. Define a function that takes a string as a parameter and returns the number of vowels it contains

public class Vowels {
    public static void main(String[] args) {
        String text = "Aaeeog";
        System.out.println(numberOfVowels(text));
    }

    public static int numberOfVowels(String text) {
        String str = text.toLowerCase();
        int vowelCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                vowelCount++;
            }
        }
        return vowelCount;
    }
}
