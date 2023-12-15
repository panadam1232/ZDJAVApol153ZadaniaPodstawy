package pl.sdacademy.java.basic.excercises.day2;

import java.util.Scanner;

/*
Napisz program, który pobierze od użytkownika liczbę (typu int), która określi ile wyrazów
użytkownik chce wprowadzić. Następnie wczyta od użytkownika te wyrazy (typu String).
Wynikiem jest wyraz składającysięz ostatnich liter każdegoz wprowadzonych słów.
Przykład:
How many words would you like insert? 3
Kurs
Nerd
Java
Result: sda
 */
public class Zadanie10 {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder();
        String temp;
        System.out.print("How many words would you like insert? ");
        int numberOfWords = keyboardScanner.nextInt();

        for (int i = 0; i < numberOfWords; i++) {
            System.out.print("Podaj wyraz: ");
            temp = keyboardScanner.next();
            input.append(temp.charAt(temp.length() - 1));
        }
        System.out.println(input);
    }
}
