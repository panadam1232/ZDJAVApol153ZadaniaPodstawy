package pl.sdacademy.java.basic.excercises.day1;

import java.util.Random;
import java.util.Scanner;

/*
Napisz program, który będzie grał z użytkownikiem w „za dużo, za mało”.
a) W pierwszym kroku komputer losuje liczbę z zakresu od 0 d 100 (skorzystaj z metody
Random.nextInt()).
b) Następnie czeka na podanie liczby przez użytkownika.
c)  Jeśli  użytkownik  poda  liczbę  większą,  niż  wylosowana  przez  komputer,  program  powinien
wypisać  „too  much”  i  czekać  na  podanie  kolejnej  liczby.  Jeśli  użytkownik  poda  liczbę  mniejszą,
program powinien wypisać „not enough” i analogicznie czekać na następną liczbę. Jeśli podana
wartość jest tą szukaną, to program powinien wypisać słowo „Bingo!” i zakończyć się.
Przykład:
Please insert digit: 5
Not enough
Please insert digit: 15
Too much
Please insert digit: 10
Bingo!
 */
public class Zadanie11 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner keyboardScanner = new Scanner(System.in);
        int x = random.nextInt(100);
        int input;

        do {
            System.out.print("podaj liczbę z zakresu 0 - 100: ");
            input = keyboardScanner.nextInt();
            if (input > x) {
                System.out.println("too much");
            } else if (input < x) {
                System.out.println("not enough");
            } else {
                System.out.println("Zgadłeś. Wylosowana liczba to: " + x);
            }
        } while (input != x);
    }
}
