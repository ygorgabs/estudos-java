package academy.devdojo.maratonajava.javacore.Sformatcao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("*****************");

        LocalDate parse1 = LocalDate.parse("20260309",DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2026-03-09+04:00",DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2026-03-09",DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        System.out.println("*****************");

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);
        LocalDateTime parse4 = LocalDateTime.parse("2026-03-09T21:53:14.157067677", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse4);

        System.out.println("*****************");

        DateTimeFormatter brFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String brFormat = LocalDate.now().format(brFormatter);
        System.out.println(brFormat);

        System.out.println("*****************");

        DateTimeFormatter grFormatter = DateTimeFormatter.ofPattern("dd.MMMM.yy", Locale.GERMAN);
        System.out.println(LocalDate.now().format(grFormatter));
    }
}
