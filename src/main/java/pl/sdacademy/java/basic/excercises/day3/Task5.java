package pl.sdacademy.java.basic.excercises.day3;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Task5 {
    private static Scanner keyboardScanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Pomiar czasu - naciśnij ENTER by zacząć");
        keyboardScanner.nextLine();
        LocalTime firstTime = LocalTime.now();

        System.out.println("Pomiar czasu - naciśnij ENTER by zakończyć");
        keyboardScanner.nextLine();
        LocalTime endTime = LocalTime.now();

        Duration time = Duration.between(firstTime, endTime);
        System.out.println(time.getSeconds()+","+time.getNano());
    }
}
