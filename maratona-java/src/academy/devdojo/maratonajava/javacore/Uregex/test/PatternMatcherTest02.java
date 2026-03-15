package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        /*
            \d = Todos os dígitos
            \D = Tudo o que nao for dígito
            \s = Espaços em branco \t \n \f \r
            \S = Todos os caracteres excetos espaços em branco
            \w = a-z A-Z, dígitos, underline
            \W caracteres especiais
         */

        String regex = "\\W";
        String texto2 = "@#3h_hj212gvh21";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("Texto:  " + texto2);
        System.out.println("Índice: 0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Posições encontradas: ");

        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}
