package pl.sdacademy.java.basic.excercises.day2;

import jdk.jshell.execution.Util;

/*
Napisz program, który odczytuje wprowadzony przez użytkownika tekst, a następnie dla tego
tekstu zamienia wszystkie wystąpienia przecinków i kropek na tekst “-STOP-”, a następnie
wyświetlawynik w konsoli.
Przykład:
Please insert your text: Ala ma, kota. a kot, ma Ale
After modifications: Ala ma-STOP- kota-STOP- a kot-STOP- ma Ale
 */
public class Zadanie4 {

    public static final String REPLACEMENT = "-STOP-";

    public static void main(String[] args) {
        String input = "Ala ma, kota. a kot, ma Ale";
        //String result = input.replaceAll("[,\\.]", "-STOP"); -> to działa, jest to regex
        //System.out.println(result);
        String result = replaceInput(input);
        System.out.println(result);

        input = "Ala ma kota a kot ma Ale";
        result = replaceInput(input);
        System.out.println("NIC SIĘ NIE ZMIENIA " + result);
    }

    private static String replaceInput(String input) {
        if (Utils.isValid(input)) {
            return input
                    .replace(".", REPLACEMENT)
                    .replace(",", REPLACEMENT);
        }
        return input;
    }
}
