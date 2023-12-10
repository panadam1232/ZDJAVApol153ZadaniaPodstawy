package pl.sdacademy.java.basic.excercises.day2;

import static pl.sdacademy.java.basic.excercises.day2.Utils.*;

/*
Napisz program, który przyjmie jako argumenty input i prefix (oba typu String), a następnie
sprawdzi czy zmienna input rozpoczyna sięod słowaprzesłanegopod argumentem prefix.
* Spróbujnapisaćprogram, którybędzierobiłto samo ale z podanym suffixem.
Przykład:
Input: programowanie, Prefix: pro
Result: true
Input: programowanie, Suffix: nie
Result: true
 */
public class Zadanie2 {

    public static void main(String[] args) {
        String input = "programowanie";
        String prefix = "pro";
        boolean result = isCorrectPrefix(input, prefix);
        System.out.println(result);

        input = "java";
        prefix = "abc";
        result = isCorrectPrefix(input, prefix);
        System.out.println(result);

        input = "";
        prefix = null;
        result = isCorrectPrefix(input, prefix);
        System.out.println(result);

    }

    private static boolean isCorrectPrefix(String input, String prefix) {
        //if(input == null || input.isBlank() || prefix == null || prefix.isBlank()){
        //    return false;
        //}
        //return input.startsWith(prefix);
        if (isValid(input) && isValid(prefix)) {
            return input.startsWith(prefix);
        }
        return false;
    }
}
