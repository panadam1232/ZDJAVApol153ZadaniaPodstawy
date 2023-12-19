package pl.sdacademy.java.basic.excercises.day3;

import java.util.regex.Pattern;
/*
Napisz program, którysprawdzi czy liczba wejściowa(typu String) ma poprawny format.
Przykład:
If digit 1234,1234 has correct format: true
If digit 123a123 has correct format: false
 */
public class Task3 {

    public static void main(String[] args) {
        String inputOne = "1234,1234";
        String inputTwo = "123a123";
        String inputThree = "1234,12344";
        String inputFour = "11234,1234";
        String inputFive = "2222,4444";
        System.out.println(isCorrectInputFormat(inputOne));
        System.out.println(isCorrectInputFormat(inputTwo));
        System.out.println(isCorrectInputFormat(inputThree));
        System.out.println(isCorrectInputFormat(inputFour));
        System.out.println(isCorrectInputFormat(inputFive));
    }
    private static boolean isCorrectInputFormat(String input){
        Pattern pattern = Pattern.compile("^[1-4]{4},[1-4]{4}$");
        return pattern.matcher(input).matches();
    }
}
