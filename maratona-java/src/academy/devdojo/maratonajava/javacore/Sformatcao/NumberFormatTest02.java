package academy.devdojo.maratonajava.javacore.Sformatcao;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localeUS = Locale.of("en", "US");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getCurrencyInstance(localeDefault);
        nfa[1] = NumberFormat.getCurrencyInstance(localeUS);
        nfa[2] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[3] = NumberFormat.getCurrencyInstance(localeIT);

        Double valor = 100_000_000.55;
        for(NumberFormat numberFormat : nfa){
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "$1000.00";

        try {
            System.out.println(nfa[1].parse(valorString));
        } catch (ParseException e) {
            System.err.println(e.getMessage());
        }
    }
}
