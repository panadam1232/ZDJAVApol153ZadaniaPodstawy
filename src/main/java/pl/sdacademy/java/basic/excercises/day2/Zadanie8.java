package pl.sdacademy.java.basic.excercises.day2;

/*
Napisz program, który przyjmie jako argument tekst (typu String), a następnie zamieni małe
litery na dużei odwrotnie, w podanym łańcuchuwejściowym.
Przykład:
Input: AlaKot
Result: aLAkOT
 */
public class Zadanie8 {

    public static final int VALUE_UPPER_A_IN_ASCII = 65;
    public static final int VALUE_UPPER_Z_IN_ASCII = 90;
    public static final int VALUE_LOWER_A_IN_ASCII = 97;
    public static final int VALUE_LOWER_Z_IN_ASCII = 122;
    public static final int DIFF_UPPER_AND_LOWER = 32;

    public static void main(String[] args) {
        String input = "AlaKot";
        String result = replaceCharacters(input);
        System.out.println(result);

        input.toLowerCase(); // immutable, to nie zmieni liter na male
        System.out.println(input);

        input = input.toLowerCase(); // trzeba to zrobic
        System.out.println(input);

        StringBuilder sb = new StringBuilder("AlaKot");
        sb.append(" i psa");
        System.out.println(sb);

    }

    private static String replaceCharacters(String input) {
        String result = "";
        if (Utils.isValid(input)) {
            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);
                if (currentChar >= VALUE_UPPER_A_IN_ASCII && currentChar <= VALUE_UPPER_Z_IN_ASCII) {
                    result += String.valueOf((char) (currentChar + DIFF_UPPER_AND_LOWER));
                } else if (currentChar >= VALUE_LOWER_A_IN_ASCII && currentChar <= VALUE_LOWER_Z_IN_ASCII) {
                    result += String.valueOf((char) (currentChar - DIFF_UPPER_AND_LOWER));
                } else {
                    result += currentChar;
                }
            }
            return result;
        }
        return input;
    }

}
