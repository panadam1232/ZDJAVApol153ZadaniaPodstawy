package pl.sdacademy.java.basic.excercises.day1;

import java.util.Scanner;

/*
Napisz  program,  który  pobierze  od  użytkownika  liczbę  całkowitą  (typu  int),  a  następnie  obliczy
sumę cyfr podanej liczby.
Podpowiedź:  aby  rozpatrywać  liczbę  cyfra  po  cyfrze,  możesz  obliczać  resztę  z  dzielenia  liczby
przez 10 (aby uzyskać wartość ostatniej cyfry) i dzielić liczbę bez reszty przez 10 (żeby przesuwać
się do kolejnej cyfry).
Przykład:
Please insert digit: 123
Sum Of Digits: 6
Please insert digit: 6
Sum Of Digits: 6
 */
public class Zadanie10 {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int result = getSumOfDigits(keyboardScanner.nextInt());
        System.out.println("Suma cyfr podanej liczby to: " + result);

        System.out.println(getSumOfDigits(123));
    }

    private static int getSumOfDigits(int number) {
        int result = 0;
        while (number != 0){
            result += number % 10;
            number /= 10;
        }
        return result;
    }
}
