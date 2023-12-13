package pl.sdacademy.java.basic.excercises.day2;

import java.util.Scanner;

/*
Napisz program, który będzie od użytkownika pobierał kolejne teksty (typu String) tak długo,aż
użytkownik poda tekst „Enough”, a następnie wypisze najdłuższy z podanych tekstów(nie biorąc
pod uwagę tekstu „Enough”). Jeśli użytkownik nie poda żadnego tekstu, to wypisz „Noinput”.
Przykład:
Please insert your text: Ala
Please insert your text:
No input
Please insert your text: ma
Please insert your text: kota
Please insert your text: i
Please insert your text: psa
Please insert your text: Enough
Result: kota
 */
public class Zadanie9 {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);
        String input;
        String longestInput = "";

        do {
            System.out.print("Podaj wyraz: ");
            input = keyboardScanner.nextLine();
            if (input.isEmpty() || input.isBlank()) {
                System.out.println("No input");
            } else if (!"Enough".equals(input) && input.length() > longestInput.length()) {
                longestInput = input;
            }
        } while (!input.equals("Enough")) ;

        System.out.println(longestInput);
    }
}