package pl.sdacademy.java.basic.excercises.day2;

import java.util.Arrays;
import java.util.Scanner;

/*
Napisz program, który pobierze od użytkownika 10 liczb (typu int). Następnym krokiem powinno
być zapisanie ich w tablicy, posortowanie jej rosnąco oraz wypisanie wyniku sortowania na
ekran.
Przykład:
Insert digit: 2
Insert digit: 4
Insert digit: 6
Insert digit: 0
Insert digit: -5
Insert digit: -7
Insert digit: 3
Insert digit: 9
Insert digit: -4
Insert digit: -5
Result: -7 -5 -5 -4 0 2 3 4 6 9
 */
public class Zadanie17 {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);
        int amountOfDigits = 10;
        int[] array = new int[amountOfDigits];
        for (int i = 0; i < amountOfDigits; i++) {
            System.out.print("Insert digit: ");
            array[i] = keyboardScanner.nextInt();
        }
        //Arrays.sort(array);
        sortArray(array);
        System.out.println(Arrays.toString(array));
    }

    private static int[] sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tempValue = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tempValue;
                }
            }
        }
        return array;
    }
}
