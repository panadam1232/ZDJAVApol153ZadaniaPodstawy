package pl.sdacademy.java.basic.excercises.day2;

import java.util.Arrays;
import java.util.Random;

/*
Napisz program, który utworzy tablicę zawierającą 10 losowych liczb całkowitych z przedziału
0. . . 9. Następnie wypisze ile razy dana liczba pojawiła się w tablicy.
Przykład:
Input: 4 3 9 4 5 7 6 4 8 8
0: 0
1: 0
2: 0
3: 1
4: 3
5: 1
6: 1
7: 1
8: 2
9: 1
 */
public class Zadanie18 {
    public static void main(String[] args) {
        Random generator = new Random();
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = generator.nextInt(9);
        }
        printResult(array);
    }

    private static void printResult(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int counter = 0;
            for (int j = 0; j < array.length; j++) {
                if (i == array[j]) {
                    counter++;
                } else continue;
            }
            System.out.println(i + ": " + counter);
        }
    }
}

