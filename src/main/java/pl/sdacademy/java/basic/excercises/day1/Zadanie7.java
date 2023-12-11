package pl.sdacademy.java.basic.excercises.day1;
/*
Napisz program realizujący prosty kalkulator. Program powinien:
a) pobrać pierwszą liczbę (typu float);
b) pobrać jeden ze znaków: + - / *;
c) pobrać drugą liczbę (typu float);
d) zwrócić wynik pobranego działania.
Jeśli  użytkownik  poda  znak  inny  niż  obsługiwane,  program  powinien  wypisać  „Operator  not
exist” i zakończyć program.
Jeśli wpisanego działania nie da się zrealizować (tj. jest niezgodne z zasadami matematyki), to
program powinien wypisać napis „Wrong operation”.
*  Dodaj  funkcjonalność,  która  pozwoli  na  wielokrotne  wykonywanie  działań,  a  zakończenie
działania programu nastąpi po wpisaniu tekstu „Stop”.
 */
public class Zadanie7 {
    public static void main(String[] args) {
        calculate(8,2,'+');
        calculate(8,2,'-');
        calculate(8,0,'/');
        calculate(8,2,'*');

    }

    private static void calculate (int a, int b, char c){
        int sum;
        switch (c){
            case '+':
                sum = a + b;
                System.out.println(a + " + " + b + " = " + sum);
                        break;
            case '-':
                sum = a - b;
                System.out.println(a + " - " + b + " = " + sum);
                break;
            case '/':
                if (a == 0 || b == 0) {
                    System.out.println("Nie dziel przez 0!");
                    break;
                }
                sum = a / b;
                System.out.println(a + " / " + b + " = " + sum);
                break;
            case '*':
                sum = a * b;
                System.out.println(a + " * " + b + " = " + sum);
                break;
        }
    }
}
