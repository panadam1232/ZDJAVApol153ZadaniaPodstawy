package pl.sdacademy.java.basic.excercises.day2;

import java.util.Arrays;

/*
Napisz program, którydla zadanej tablicy int'ówpoliczy ile jest w niej liczb ujemnych. Jeślitakie
występująutworzy nowątablicę,do którejprzepisze tylko te ujemne liczby.
Przykład:
Input: 12, -7, 19, -5
Result: -7, -5
 */
public class Zadanie14 {
    public static void main(String[] args) {
        int[] input = {12, -7, 19, -5};

        int[] negativeNumbers = countNegativeNumbers(input);

        System.out.println("Input: " + Arrays.toString(input));
        System.out.println("Result: " + Arrays.toString(negativeNumbers));
    }

    private static int[] countNegativeNumbers(int[] input) {
        int countNegatives = 0;

        // Liczenie ilości liczb ujemnych w tablicy
        for (int number : input) {
            if (number < 0) {
                countNegatives++;
            }
        }

        // Utworzenie nowej tablicy dla liczb ujemnych
        int[] negativeNumbers = new int[countNegatives];
        int index = 0;

        // Przepisanie liczb ujemnych do nowej tablicy
        for (int number : input) {
            if (number < 0) {
                negativeNumbers[index++] = number;
            }
        }

        return negativeNumbers;
    }
}
