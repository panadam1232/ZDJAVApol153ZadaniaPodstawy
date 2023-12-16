package pl.sdacademy.java.basic.excercises.day3;
/*
Napisz program, działającyjak stoper.
Program powinien wyświetlićkomunikat, żepomiar czasu rozpoczyna sięod wciśnięciaklawisza
Enter. Po uruchomieniu pomiaru powinien pojawićsiękolejny komunikat informującyo tym, że
w celu zatrzymania pomiaru należyponownie wcisnąćklawisz Enter.
Po zakończeniupomiaru program powinien wyświetlićinformacje o całkowitymczasie pomiaru.
Podpowiedź: Użyjklasy Duration do wyliczenia czasu pomiaru.
Przykład:
To  start timing press ENTER
To  stop timing press ENTER
Total time: 6 sec
 */
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DataCzas {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalDate retentionDate = date.plusMonths(18);
        System.out.println(retentionDate);

        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalTime modifiedTime = time.minusHours(1);
        System.out.println(modifiedTime);

        LocalDate date2 = LocalDate.of(2024, 5, 25);
        System.out.println(date2);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        //11:22
        //10:20
        // 11:22 - 10:20

        System.out.println("***");
        System.out.println(date);

        String format = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(format);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM*dd*yyyy");
        String format1 = date.format(dateTimeFormatter);
        System.out.println(format1);

        System.out.println("***");
        System.out.println(time);

        String format2 = time.format(DateTimeFormatter.ISO_TIME);
        System.out.println(format2);

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("ss?mm?HH");
        String format3 = time.format(dateTimeFormatter1);
        System.out.println(format3);
    }
}