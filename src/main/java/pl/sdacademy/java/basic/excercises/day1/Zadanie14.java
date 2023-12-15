package pl.sdacademy.java.basic.excercises.day1;

import java.util.Scanner;

/*
Napisz  program,  który  na  podstawie  zmiennych:  kwota  (double)  oraz  ilość  rat  (int),  obliczał
będzie miesięczną kwotę raty pożyczki a następnie wypisywał ją w konsoli. Parametry posiadają
pewne ograniczenia, które powinieneś uwzględnić w programie:
a) kwota pożyczki musi mieścić się w przedziale od 100,00zł do 10.000,00zł;
b) liczba rat musi mieścić się w przedziale od 6 do 48;
c)  w    przypadku  wykroczenia  kwoty  pożyczki  poza  akceptowalny  przedział,  kwota  pożyczki
powinna  być  ustawiona  na  5.000,00zł. W przypadku podania  zbyt  małej kwoty,  kwota pożyczki
powinna być ustawiona na 1000,00zł.
d)  W  przypadku  wykroczenia  ilości  rat  poza  akceptowalny  przedział,  ilość  rat  powinna  być
ustawiona na 36. W przypadku podania zbyt małej ilości, ilość rat powinna być ustawiona na 18
Obliczona  miesięczna  rata  powinna  zawierać  również  odsetki.  Dla  uproszczenia  przyjmij,  że  do
kwoty pożyczki doliczasz x procent w zależności od ilości rat:
* 6-12 rat – 2,5%;
* 13-24 rat – 5,0%;
* 25-48 rat – 10,0%;
a następnie obliczasz kwotę raty na podstawie ilości ra
 */
public class Zadanie14 {

    public static final int MAX_KWOTA = 10000;
    public static final int MIN_KWOTA = 1000;
    public static final int DEFALUT_MAX_KWOTA = 5000;
    public static final int DEFAULT_MIN_KWOTA = 1000;
    public static final double INTEREST_6_12 = 1.025;
    public static final double INTEREST_13_24 = 1.05;
    public static final double INTEREST_25_48 = 1.10;
    public static final int MAX_RATY = 48;
    public static final int MIN_RATY = 6;
    public static final int DEFAULT_MAX_RATY = 36;
    public static final int DEFAULT_MIN_RATY = 18;

    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);
        double kwota = getKwota(keyboardScanner);
        int raty = getRaty(keyboardScanner);
        System.out.println("Kwota raty to: " + instalment(kwota, raty));
    }
    private static int getRaty(Scanner keyboardScanner) {
        System.out.print("Podaj liczbę rat z zakresu 6 - 48: ");
        int raty = keyboardScanner.nextInt();
        if (raty > MAX_RATY) {
            System.out.println("Amount is too big. Default value 36 was set");
            return DEFAULT_MAX_RATY;
        } else if (raty < MIN_RATY) {
            System.out.println("Amount is not enough. Default value 18 was set");
            return DEFAULT_MIN_RATY;
        } return raty;
    }
    private static double getKwota(Scanner keyboardScanner) {
        System.out.print("Podaj kwotę pożyczki z zakresu 100 - 10.000 PLN: ");
        double kwota = keyboardScanner.nextDouble();
        if (kwota > MAX_KWOTA) {
            System.out.println("Amount is too big. Default value 5000,00 was set");
            return DEFALUT_MAX_KWOTA;
        } else if (kwota < MIN_KWOTA) {
            System.out.println("Amount is not enough. Default value 1000,00 was set");
            return DEFAULT_MIN_KWOTA;
        } return kwota;
    }
    private static double instalment(double kwota, int raty) {
        double result = 0;
        if (raty >= 6 && raty <= 12) {
            result = (kwota * INTEREST_6_12) / raty;
        } else if (raty >= 13 && raty <= 24) {
            result = (kwota * INTEREST_13_24) / raty;
        } else if (raty >= 25 && raty <= 48) {
            result = (kwota * INTEREST_25_48) / raty;
        } return result;
    }
}
