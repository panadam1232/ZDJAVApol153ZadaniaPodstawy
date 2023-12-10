package pl.sdacademy.java.basic.excercises.day1;

/*
Napisz program, który dla danej liczby x wygeneruje wszystkie liczby od 1 do x. Jeżeli liczba jest
podzielna  przez  3  wyświetli  słowo  "Fizz",  gdy  podzielna  przez  5  wyświetli  słowo  "Buzz",  jeżeli
podzielna zarówno przez 3 i 5 to wyświetli słowo "FizzBuzz".
Przykład:
Range from 1 to 10
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
buzz
 */
public class Zadanie9 {
    public static void main(String[] args) {
        fizzBuzzInRange(100); // Zadany zakres, np. od 1 do 20
    }

    private static void fizzBuzzInRange(int x) {
        for (int i = 1; i <= x; i++) {
            System.out.println(fizzBuzz(i));
        }
    }
    private static String fizzBuzz(int number) {
      //if (number % 15 == 0)
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(number);
    }
}
