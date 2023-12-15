package pl.sdacademy.java.basic.excercises.day1;

import java.util.Scanner;

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
        calculate(8, 2, "+");
        calculate(8, 2, "-");
        calculate(8, 2, "/");
        calculate(8, 2, "*");
        calculate(8, 2, "?");

        boolean wantToContinue = true;
        while (wantToContinue) {
            Scanner keyboardScanner = new Scanner(System.in);
            System.out.print("Podaj pierwszą liczbę: ");
            float a = keyboardScanner.nextFloat();
            System.out.print("Podaj drugą liczbę: ");
            float b = keyboardScanner.nextFloat();
            System.out.print("Podaj operator +, -, /, *: ");
            String c = keyboardScanner.next();
            calculate(a, b, c);
            System.out.print("Czy chcesz kontynuować: \n Wpisz true jeśli chcesz kontynuować \n Wpisz false jeśli nie chcesz kontynuować \nWpisz wartość: ");
            wantToContinue = keyboardScanner.nextBoolean();
        }
    }

    private static void calculate(float a, float b, String c) {
        float sum;
        switch (c) {
            case "+":
                sum = a + b;
                System.out.println(a + " + " + b + " = " + sum);
                break;
            case "-":
                sum = a - b;
                System.out.println(a + " - " + b + " = " + sum);
                break;
            case "/":
                if (a == 0 || b == 0) {
                    System.out.println("Wrong operation");
                    break;
                }
                sum = a / b;
                System.out.println(a + " / " + b + " = " + sum);
                break;
            case "*":
                sum = a * b;
                System.out.println(a + " * " + b + " = " + sum);
                break;
            default:
                System.out.println("„Operator  not exist");
        }
    }
}
