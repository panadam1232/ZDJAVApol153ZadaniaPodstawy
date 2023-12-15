package pl.sdacademy.java.basic.excercises.day2;

import java.util.Arrays;

/*
Napisz program, w którym zdefiniujesz dwie tablice dwuwymiarowe liczb całkowitych.
Następnie:
a) zwróćtę,w której suma liczb jest większa;
b) zwróć największą liczbę z obu tablic;
c) zwróć najmniejszą liczbę z obu tablic.
Przykład:
Input:
firstArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}
secondArray = {{10, -1, 5}, {-25, 6, 6}, {12, 8, 9}}
Result:
Bigger array is: 1, 2, 3, 4, 5, 6, 7, 8, 9
The biggest value is: 12
The lowest value is: -25
 */
public class Zadanie19 {
    public static void main(String[] args) {
        int[][] firstArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        int[][] secondArray = {
                {10, -1, 5},
                {-25, 6, 6},
                {12, 8, 9},
        };
        int lowestValue = Math.min(minArrayValue(firstArray), minArrayValue(secondArray));
        System.out.println("The lowest value is: " + lowestValue);

        int biggestValue = Math.max(maxArrayValue(firstArray), maxArrayValue(secondArray));
        System.out.println("The biggest value is: " + biggestValue);

        if (arrayValue(firstArray) > arrayValue(secondArray)){
            printArray(firstArray);
        } else {
            printArray(secondArray);
        }

    }

    private static int minArrayValue(int[][] array) {
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        return min;
    }


    private static int maxArrayValue(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    private static int arrayValue(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

    private static void printArray(int[][] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]);
                if (j < array.length - 1) {
                    System.out.print(", ");
                }
            }
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
