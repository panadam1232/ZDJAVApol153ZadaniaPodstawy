package pl.sdacademy.java.basic.excercises.day1;

import java.util.Scanner;

/*
Napisz program, który pobierze od użytkownika średnicę okręgu (typu float), a następnie obliczy
obwód oraz pole tego okręgu. Do obliczeń przyjmij:
a) π = 3,14;
b) wartość stałej π z klasy Math.
Przykład:
Please insert diameter: 2,5
Circumference Of A Circle: 7.8500004
 */
public class Zadanie2 {

    public static final double PI = Math.PI;

    public static void main(String[] args) {
        float radius = getDiameterFromUser() / 2;
        System.out.println("promień : " + radius);
        double calculateCircumference = calculateCircumference(radius);
        double calculateArea = calculateArea(radius);
        System.out.println("obwod : " + calculateCircumference);
        System.out.println("pole : " + calculateArea);
    }

    private static float getDiameterFromUser() {
        Scanner keyboardScanner = new Scanner(System.in);
        System.out.print("Please insert diameter: ");
        return keyboardScanner.nextFloat();
    }

    private static double calculateCircumference(float radius) {
        //2 * pi * r
        return 2 * PI * radius;
    }

    private static double calculateArea(float radius) {
        //pi * r^2
        return PI * Math.pow(radius, 2);
    }
}

