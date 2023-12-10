package pl.sdacademy.java.basic.excercises.day2;

public class Zadanie1 {

    public static final char DEFAULT_CHAR = '\u0000';

    public static void main(String[] args) {
        String input = "Ala";
        char result = getLastCharacter(input);
        System.out.println(result);

        input = "domek";
        result = getLastCharacter(input);
        System.out.println(result);

    }

    private static char getLastCharacter (String input) {
        if (input == null || input.isBlank()) {
            System.out.println("Wrong input");
            return DEFAULT_CHAR;
        }
        int lastPosition = input.length() - 1;
        return input.charAt(lastPosition);
    }
}
