package academy.devdojo.maratonajava.javacore.Sformatcao;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT"); // deprecated
        Locale localeIndia = Locale.of("hi", "IN"); // forma simplificada a partir do java 19
        Locale localeJapao = Locale.JAPAN; // utilizando constantes de classe
        Locale localeHolanda = new Locale.Builder()
                .setLanguage("nl") //define região
                .setRegion("NL") //define pais
                .build(); //cria o objeto
        Locale localeUK = Locale.forLanguageTag("en-GB");

        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL,localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL,localeIndia);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL,localeJapao);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL,localeHolanda);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL,localeUK);

        System.out.println("Italia: " + df1.format(calendar.getTime()));
        System.out.println("India: " + df2.format(calendar.getTime()));
        System.out.println("Japão: " + df3.format(calendar.getTime()));
        System.out.println("Holanda: " + df4.format(calendar.getTime()));
        System.out.println("UK: " + df5.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayCountry());
        System.out.println(localeJapao.getDisplayCountry());
    }
}
