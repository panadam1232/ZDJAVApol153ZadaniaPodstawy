package pl.sdacademy.java.basic.excercises.day1;

import java.util.Scanner;

/*
Napisz  program,  który  wczytuje  od  użytkownika  liczby  całkowite,  do  momentu  aż  zostanie
podana liczba 0 (wartość ta jest pomijana w dalszych operacjach), następnie wyliczy i wyświetli:
a) średnią arytmetyczną podanych liczb;
b) ilość wszystkich podanych liczb;
c) ilość liczb parzystych.
Przykład:
Please insert digit: 2
Please insert digit: 4
Please insert digit: 5
Please insert digit: 10
Please insert digit: 0
Total Number Of Digits: 4
Total Number Of Even Digits: 3
Arithmetic Average: 5.25
 */
public class Zadanie13 {
    public static void main(String[] args) {
        System.out.println(numberOfDigits(2, 2, 2, 4, 10,11));
        System.out.println(average(2, 2, 2, 4, 10,11));
        System.out.println(numberOfEvenDigits(2, 2, 2, 4, 10,11));



    }

    private static int numberOfDigits(int... args) {
        int counter = 0;
        for (int i = 0; i < args.length; i++) {
            counter++;
        }
        return counter;
    }

    private static float average(int... args) {
        int sum = 0;
        float result = 0;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
            result = sum / (float)numberOfDigits(args);
        }
        return result;
    }

    private static int numberOfEvenDigits(int... args) {
        int counter = 0;
        for (int i = 0; i < numberOfDigits(args); i++) {
            if (args[i] % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }
}


