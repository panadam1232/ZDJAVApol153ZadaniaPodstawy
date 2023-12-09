package pl.sdacademy.java.basic.excercises.day1;

import java.util.Scanner;

/*
Napisz  program  obliczający  BMI  (Body  Mass  Index)  oraz  sprawdzający,  czy  jest  ono  w  normie.
Program  powinien  wczytać  od  użytkownika  dwie  zmienne:  wagę  (weight)  w  kilogramach  (typ
float) oraz wzrost (height) w centymetrach (typ int). BMI powinno zostać wyliczone zgodnie
z poniższym wzorem:
Optymalny  zakres  BMI  wynosi  od  18,5  do  24,9,  wartości  mniejsze  lub  większe  są  wartościami
nieoptymalnymi.  Twój  program  powinien  wypisać  „BMI  is  correct”  lub  „BMI  is  not  correct”,
zgodnie z powyższymi założeniami.
Przykład:
Please insert weight in kg: 80
Please insert height in cm: 185
BMI is correct: 23.374725
 */
public class Zadanie4 {

    public static final double BMIlow = 18.5;
    public static final double BMIhigh = 24.9;

    public static void main(String[] args) {
        System.out.println("Program do Zadanie3");
        System.out.print("Podaj wagę w kg: ");
        float x = getWeightFromUser();
        System.out.print("Podaj wzrost w cm: ");
        int y = getHeightFromUser();

        printResult(bmi(x, y));

    }

    private static float getWeightFromUser() {
        Scanner keyboardScanner = new Scanner(System.in);
        return keyboardScanner.nextFloat();

    }

    private static int getHeightFromUser() {
        Scanner keyboardScanner = new Scanner(System.in);
        return keyboardScanner.nextInt();

    }


    private static double bmi(float x, int y) {
        float height = y / 100F;
        return x / Math.pow(height, 2);
    }

    private static void printResult(double checkBmi) {
        if (isInRange(checkBmi)) {
            System.out.println("BMI is corect " + checkBmi);
        } else System.out.println("BMI is incorrect " + checkBmi);
    }

    private static boolean isInRange(double checkBmi) {
        return BMIlow <= checkBmi && checkBmi <= BMIhigh;
    }
}
