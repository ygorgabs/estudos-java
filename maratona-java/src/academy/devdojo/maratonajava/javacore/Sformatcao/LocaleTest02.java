package academy.devdojo.maratonajava.javacore.Sformatcao;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault()); //retorna o ṕadrão da maquina

        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        for(String isoContry : isoCountries){
            System.out.print(isoContry + " ");
        }
        System.out.println();
        for(String isoLanguage : isoLanguages){
            System.out.print(isoLanguage + " ");
        }
    }
}
