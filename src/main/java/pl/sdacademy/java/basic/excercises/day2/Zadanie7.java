package pl.sdacademy.java.basic.excercises.day2;

/*
Napisz program, którypobierze od użytkownikatekst (typu String) i policzy jakim procentem
wszystkich znakówtekstu byłznak spacji.
Przykład:
Input: Ala ma kota
Result: 18.181818181818183
 */
public class Zadanie7 {
    public static void main(String[] args) {
        String input = "Ala ma kota";
        /* -- to rozwiazanie tylko dla liczenia samych spacji --
        double inputLength = input.length();
        String removeSpace = input.replace(" ", "");
        double result = ((inputLength - removeSpace.length()) / inputLength) * 100;
        System.out.println(result);
        */

        System.out.println(percentOfCharInText(input));

    }

    private static double percentOfCharInText(String input) {
        double charCount = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                charCount++;
            }
        }
        return (charCount / input.length()) * 100;
    }
}
