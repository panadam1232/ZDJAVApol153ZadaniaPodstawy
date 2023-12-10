package pl.sdacademy.java.basic.excercises.day2;
/*
Napisz program, którybędziesprawdzałczy podane słowo(typu String) jest palindromem.
Przykład:
Input: kajak
Result: true
Input: sda
Result: false
 */
public class Zadanie11 {
    public static void main(String[] args) {
        String input = "kajak";
        boolean result = isPalindrom(input);
        System.out.println(result);
    }

    public static boolean isPalindrom (String input){
        StringBuilder sb = new StringBuilder(input); //StringBuilder sb = new StringBuilder(input).reverse();
        sb.reverse();
        String reversedInput = sb.toString();
        return input.equals(reversedInput);
    }
}
