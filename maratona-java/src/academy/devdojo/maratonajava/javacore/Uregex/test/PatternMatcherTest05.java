package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        /*
            Quantificadores
            ? Zero ou uma ocorrencia
            * Zero ou mais ocorrências
            + Uma ou mais ocorrências
            {n,m} de n até m
            () agrupamento
            | OU

            Exemplo: O (V|C) O - agrupa V ou C

            $ fim de linha
            . - 1.3 = 123, 133, 1@3, 1A3
         */

        String regex = "([\\w.-])+@\\w+(.\\w+)+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail ";
        System.out.println("Email válido: ");
        System.out.println("#@!zoro@mail.br".matches(regex));
        System.out.println(texto.split(",")[1].trim());
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto:  " + texto);
        System.out.println("Índice: 0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Posições encontradas: ");

        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}
