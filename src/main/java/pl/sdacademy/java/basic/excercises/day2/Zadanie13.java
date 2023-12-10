package pl.sdacademy.java.basic.excercises.day2;

import java.util.Arrays;

/*
Napisz program, który dla podanej tablicy int'ów wyświetli najpierw najmniejszą, największą
liczbęz tablicy a następniesumęwszystkich elementów.
Przykład:
Input: 12 7 19
Min value: 7
Max value: 19
Total sum: 38
 */
public class Zadanie13 {
    public static void main(String[] args) {
        int[] inputs = {12, 7, 19, 3};

        int minValue = getMinValue(inputs);
        System.out.println(minValue);

        int maxValue = getMaxValue(inputs);
        System.out.println(maxValue);

        int sum = sum(inputs);
        System.out.println(sum);

    }
    /*
    private static int getMinValue(int[] ints) {
        int currentMinValue = ints[0];
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < currentMinValue) {
                currentMinValue = ints[i];
            }
        }
        return currentMinValue;
    }
    */

    private static int getMinValue(int[] ints) {
        int currentMinValue = ints[0];
        for (int element : ints){
            if(element < currentMinValue){
                currentMinValue = element;
            }
        }
        return currentMinValue;
    }

    private static int getMaxValue(int[] ints){
        int currentMaxValue = ints[0];
        for (int element : ints){
            if(element > currentMaxValue){
                currentMaxValue = element;
            }
        }
        return currentMaxValue;
    }

    private static int sum (int[] ints){
        //return Arrays.stream(ints).sum();
        int sum = 0;
        for(int element : ints) {
            sum += element;
        }
        return sum;
    }
}
