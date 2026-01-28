package academy.devdojo.maratonajava.javacore.Sformatcao;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localeUS = Locale.of("en", "US");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance(localeDefault);
        nfa[1] = NumberFormat.getInstance(localeUS);
        nfa[2] = NumberFormat.getInstance(localeJP);
        nfa[3] = NumberFormat.getInstance(localeIT);

        Double valor = 100_000_000.55;
        for(NumberFormat numberFormat : nfa){
            System.out.println(numberFormat.format(valor));
        }
    }
}
