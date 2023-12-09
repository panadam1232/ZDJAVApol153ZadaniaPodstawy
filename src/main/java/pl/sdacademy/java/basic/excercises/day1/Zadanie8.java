package pl.sdacademy.java.basic.excercises.day1;
/*
Napisz program, który dla zadanego zakresu od 0 do X, wyświetli tylko liczby pierwsze.

Przykład:
Range from 0 to 10
Prime numbers:
2
3
5
7
 */
public class Zadanie8 {
    public static void main(String[] args) {
        int rangeFrom = 0;
        int rangeTo = 10;

        for (int i = rangeFrom; i < rangeTo; i++) {
            if(isPrimeNumber(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }

        }
        return true;
    }
}
