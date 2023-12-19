package pl.sdacademy.java.basic.excercises.day3;

import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        String input1 = "a psik";
        String input2 = "aaaa psik";
        String input3 = " psik";
        String input4 = "haaa psik";
        String input5 = "aaa Psik";
        String input6 = "aaaPsik";
        System.out.println(isCorrectSneeze(input1));
        System.out.println(isCorrectSneeze(input2));
        System.out.println(isCorrectSneeze(input3));
        System.out.println(isCorrectSneeze(input4));
        System.out.println(isCorrectSneeze(input5));
        System.out.println(isCorrectSneeze(input6));

    }
    public static boolean isCorrectSneeze (String input){
        Pattern pattern = Pattern.compile("a+ (psik|Psik)");
        return pattern.matcher(input).matches();
    }
}
