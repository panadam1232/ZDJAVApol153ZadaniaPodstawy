package pl.sdacademy.java.basic.excercises.day2;
/*
Napisz program, któryprzyjmie jako argument input (typu String) i znak (typu char), a następnie
zwróci indeks, na którym znajduje się pierwszy poszukiwany znak (w podanym łańcuchu
znaków). Jeżeli znak nie występuje w inpucie, to wynikiem funkcji powinno być -1. Pozycje
znakówpowinny byćnumerowane od 0.
Przykład:
Input: Ala ma kota
Searched Character: a
Result: 2
Przykład:
Input: Ala ma kota
Searched Character: z
Result: -1
 */
public class Zadanie6 {
    public static void main(String[] args) {
        String input = "Ala ma kota";
        char x = 'a';

        int result = input.indexOf(x);
        System.out.println(result);

        x = 'z';
        result = input.indexOf(x);
        System.out.println(result);
    }


}
