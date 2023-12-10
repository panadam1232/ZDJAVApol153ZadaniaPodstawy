package pl.sdacademy.java.basic.excercises.day2;


/*
Napisz program, któryprzyjmie jako argument input (typu String) i znak (typu char), a następnie
zwróciliczbęwystąpieńpodanego znaku w danym łańcuchuznaków.
Przykład:
Input: Ala ma kota
Searched Character: a
Result: 3
 */
public class Zadanie5 {
    public static void main(String[] args) {
        String input = "Ala ma kota";
        char var = 'a';

        int result = countCharacters(input, var);
        System.out.println(result);

        var = 'b';
        result = countCharacters(input, var);
        System.out.println(result);
    }

    public static int countCharacters(String input, char var) {
        int sum = 0;
        if(Utils.isValid(input) && input.contains(String.valueOf(var))){
            for (int i = input.indexOf(var); i < input.length(); i++) {
                if(input.charAt(i)==var){
                    sum++;
                }
            }
        }
        return sum;
    }

}
