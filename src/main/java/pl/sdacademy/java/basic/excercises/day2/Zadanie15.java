package pl.sdacademy.java.basic.excercises.day2;

/*
Napisz program, w którym zdefiniujesz dwie tablice przechowujące Stringi. Napisz metodę,
która porówna obie tablice i sprawdzi czy są one dokładnie takie same (takie same wartości
i kolejnościelementów).
Przykład:
Input:
FirstArray: "Ala", "ma", "kota”
SecondArray: "Ala", "ma", "kotaa"
Result: false
 */
public class Zadanie15 {
    public static void main(String[] args) {
        String[] arrayOne = new String[]{"Ala", "ma", "kota"};
        String[] arrayTwo = new String[]{"Ala", "ma", "kotaa"};
        boolean isEqual = areArraysCompare(arrayOne, arrayTwo);
        System.out.println(isEqual);
    }
    private static boolean areArraysCompare(String[] arrayOne, String[] arrayTwo) {
        if (arrayOne.length != arrayTwo.length) {
            return false;
        }
        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] == null && arrayTwo[i] == null) {
                continue;
            }
            if (arrayOne[i] == null || arrayTwo[i] == null || !(arrayOne[i].equals(arrayTwo[i]))) {
                return false;
            }
        }
        return true;
    }
}
