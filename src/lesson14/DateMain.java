package lesson14;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateMain {
    public static void main(String[] args) {
        LocalDateTime time;
        LocalDate date;
        Date oldDate;
        Calendar calendar;

        date = LocalDate.now();
        time = LocalDateTime.now();
        System.out.println(date);
        System.out.println(time);
        System.out.println(date.plusDays(1));
        System.out.println(time.minusDays(1));
        time = time.plusHours(1).plusMinutes(1).plusSeconds(1);
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfYear());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());

        LocalDate nextDate = LocalDate.now().plusDays(1);
        System.out.println(date.isAfter(nextDate));
        System.out.println(date.isBefore(nextDate));

        LocalDate exactDay = LocalDate.of(2020, Month.FEBRUARY,15);
        LocalDate exactDay2 = LocalDate.of(2022,2,15);

        SimpleDateFormat format = new SimpleDateFormat("dd  MM  yyyy");
        System.out.println(format.format(new Date()));


    }
}
