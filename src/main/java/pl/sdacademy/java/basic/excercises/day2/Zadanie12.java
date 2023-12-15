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
        if (Utils.isValid(input)) {
            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);
                result.append((char)(currentChar + shift));
            }
            return result.toString();
        }
        return input;
    }
}
