package pl.sdacademy.java.basic.excercises.day3;
/*
Napisz program, który pobierze od użytkownika datę najbliższych Twoich zajęć w SDA i obliczy
ile dni do nich pozostało.
Przykład:
Please insert date [in format [yyyy-MM-dd HH:mm:ss]: 1900-01-01 09:00:00
You have 19 days to the next lesson.
* Spróbuj rozszerzyć program, tak aby wynik był uzupełniony równie o liczbę godzin i minut.
Przykład:
Please insert date [in format [yyyy-MM-dd HH:mm:ss]: 1900-01-01 09:00:00
You have Days: 19 Hours : 10 Minutes : 38 Secs to the next lesson.
 */

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task6 {
    public static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    private static Scanner keyboardScanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please insert date [in format [yyyy-MM-dd HH:mm:ss]: ");
        String inputDate = keyboardScanner.nextLine();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(DATE_TIME_FORMAT);
        LocalDateTime nextLesson = LocalDateTime.parse(inputDate, dtf);
        System.out.println(nextLesson);
        LocalDateTime now = LocalDateTime.now();

        Duration duration = Duration.between(now, nextLesson);
        long days = duration.toDays();
        int hours = duration.toHoursPart();
        int minutes = duration.toMinutesPart();
        int seconds = duration.toSecondsPart();
        System.out.printf("You have Days: %01d | Hours: %01d | Minutes: %01d | Secs: %01d to next lesson", days, hours, minutes, seconds);
    }
}
