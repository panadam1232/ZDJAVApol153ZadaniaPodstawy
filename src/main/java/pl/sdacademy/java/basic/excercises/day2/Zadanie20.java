package pl.sdacademy.java.basic.excercises.day2;

import java.util.Arrays;

/*
Napisz program za pomocą który stworzy ciąg arytmetyczny o podanych (jako argumenty
metody) właściwościach: długość, pierwszy element, różnica ciągu.
* Napisz metodę którasprawdzi, czy podany ciąg liczb jest ciągiem arytmetycznym.
Przykład: private static int[] generateArithmeticProgression(int length, int firstElement, int odds)
Input: length = 5, firstElement = 3, odds = 3
Result:
3 6 9 12 15
true
 */
public class Zadanie20 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(generateArithmeticProgression(5, 3, 3)));
        System.out.println(isArithmeticProgression(generateArithmeticProgression(5, 3, 3), 3));
    }
    private static int[] generateArithmeticProgression (int lenght, int firstElement, int odds){
        int[] array = new int[lenght];
        for (int i = 0; i < array.length; i++) {
            array[i] = firstElement;
            firstElement += odds;
        }
        return array;
    }
    private static boolean isArithmeticProgression (int[] array, int odds){
        boolean result = true;
        for (int i = 0; i < array.length; i++) {
            if(array[array.length-1] - odds == array[array.length-2]){
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }
}
