package pl.sdacademy.java.basic.excercises.day1;

/*
Napisz  program,  który  dla  zadanych  parametrów  firstDigit  i  secondDigit  (oba  typu  int),  obliczy
sumę liczb od firstDigit do secondDigit.
Przykład:
Please insert first digit: 4
Please insert second digit: 11
Sum: 60
 */
public class Zadanie5 {

    public static void main(String[] args) {
        int varOne = 4;
        int varTwo = 11;
        int sumOne = resultFori(varOne, varTwo);
        System.out.println(sumOne);
        int sumTwo = resultWhile(varOne, varTwo);
        System.out.println(sumTwo);
        int sumThree = resultDoWhile(varOne, varTwo);
        System.out.println(sumThree);

    }

    public static int resultFori(int varOne, int varTwo) {
        int result = 0;
        for (int i = varOne; i <= varTwo; i++)
        //for(: varOne <= varTwo;){
        // result ++ varOne
        // varOne++;
        {
            result += i;
        }
        return result;
    }

    public static int resultWhile(int varOne, int varTwo) {
        int result = 0;
        while (varOne <= varTwo) {
            result += varOne++;
        }
        return result;
    }

    public static int resultDoWhile(int varOne, int varTwo){
        int result = 0;
        do {
            result += varOne;
            varOne++;
        } while (varOne <= varTwo);
        return result;
    }
}
