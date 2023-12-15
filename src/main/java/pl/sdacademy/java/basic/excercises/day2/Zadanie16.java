package pl.sdacademy.java.basic.excercises.day2;

import java.util.Arrays;

/*
Napisz program, który dla zadanej tablicy 3 int'ów zamieni miejscami pierwszy i trzeci element.
Przykład:
Input: 12, 7, 19
Result: 19, 7, 12
* Napisz metodę, którą przyjmie tablicę int'ów o dowolnej długości, i odwróci kolejność jej
elementów.
Przykład:
Input: 12, 7, 19, 33
Result: 33, 19, 7, 12
 */
public class Zadanie16 {
    public static void main(String[] args) {
        int[] inputOne = {12, 7, 19, 33, 12, 54};
        int[] outputOne = new int[3];
        outputOne[0] = inputOne [2];
        outputOne[1] = inputOne [1];
        outputOne[2] = inputOne [0];
        System.out.println(Arrays.toString(outputOne));

        System.out.println(Arrays.toString(reversedArray(inputOne)));
    }
    private static int[] reversedArray (int[] inputOne){
        int[]outputTwo = new int[inputOne.length];
        for (int i = 0; i < inputOne.length; i++) {
            outputTwo[i] = inputOne[(inputOne.length-1)-i];
        }
        return outputTwo;
    }
}
