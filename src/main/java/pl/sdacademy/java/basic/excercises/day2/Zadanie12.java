package pl.sdacademy.java.basic.excercises.day2;

import java.util.Scanner;

/*
Napisz program, któryumożliwiaszyfrowanie podanego ciąguznakówprzy użyciuszyfru Cezara.
Użytkownik podaje tekst do zaszyfrowania oraz liczbę x, o którą przesunięty jest alfabet za
pomocą którego szyfrujemy tekst. Dla uproszczenia można przyjąć, że łańcuch wejściowy
składasiętylko z małychliter alfabetu angielskiego, tj. ’a’–’z’(26 znaków)oraz spacji.
Przykład:
Please insert your text: bardzo lubie programowac
Please insert shift: 2
Encrypted text: dctfbqnwdkgrtqitcoqyce
 */
public class Zadanie12 {
    private static final int VALUE_LOWER_A_IN_ASCII = 97;
    private static final int VALUE_LOWER_Z_IN_ASCII = 122;
    private static final int DIFF_A_AND_Z_LETTER = 26;

    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);
        System.out.print("Please insert your text: ");
        String input = keyboardScanner.next();
        System.out.print("please insert shift: ");
        int shift = keyboardScanner.nextInt();

        String result = encryptedText(input, shift);
        System.out.println(result);
    }

    private static String encryptedText(String input, int shift) {
        StringBuilder result = new StringBuilder();
        if (Utils.isValid(input) && shift != 0) {
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) >= VALUE_LOWER_A_IN_ASCII && input.charAt(i) <= VALUE_LOWER_Z_IN_ASCII) {
                    char currentChar = (char) ((((input.charAt(i) - (VALUE_LOWER_A_IN_ASCII - shift)) % DIFF_A_AND_Z_LETTER) + VALUE_LOWER_A_IN_ASCII));
                    result.append(currentChar);
                }
            }
            return result.toString();
        }
        return input;
    }
}
