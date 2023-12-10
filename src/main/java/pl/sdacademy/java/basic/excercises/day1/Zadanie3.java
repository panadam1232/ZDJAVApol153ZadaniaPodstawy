package pl.sdacademy.java.basic.excercises.day1;

import java.util.Scanner;

public class Zadanie3 {

    public static void main(String[] args) {
        System.out.println("Program do Zadanie3");
        System.out.print("Podaj zmienną x: ");
        int x = getVariablesFromUser();
        System.out.print("Podaj zmienną y: ");
        int y = getVariablesFromUser();

        System.out.println("czy zmienna x > y ?: " + pointA(x, y));
        System.out.println("czy zmienna 3x > y ?: " + pointB(x, y));
        System.out.println("czy++ jest mniejsze od ++x i jednoczesnie --x jest mniejsze od y++?: " + pointC(x, y));
        System.out.println("czy iloczyn x * y jest parzysty?: " + pointD(x, y));

    }

    private static int getVariablesFromUser() {
        Scanner keyboardScanner = new Scanner(System.in);
        return keyboardScanner.nextInt();
    }

    private static boolean pointA(int x, int y) {
        return (x > y);
        // można skrócić
    }

    private static boolean pointB(int x, int y) {
        boolean var = ((3 * x) > y);
        return var;
    }

    private static boolean pointC(int x, int y) {
        boolean var = (y++ < ++x) && (--x < y++);
        return var;
    }

    private static boolean pointD(int x, int y) {
        boolean var = x * y % 2 == 0;
        return var;
    }
}
