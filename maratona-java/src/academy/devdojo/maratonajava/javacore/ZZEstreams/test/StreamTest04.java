package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> designers = List.of("Widnei Suane", "Catarina Santos", "Sandy Carolina");
        List<String> developers = List.of("William", "David", "Harrison");
        List<String> students = List.of("Edipo", "Gustavo Lima", "Gustavo Mendes", "Guilherme");

        // Aninhando elementos
        devdojo.add(designers);
        devdojo.add(developers);
        devdojo.add(students);
        // Como extrair no modo convencional
        for (List<String> people : devdojo) {
            for (String person : people) {
                System.out.println(person);
            }
        }

        System.out.println("-------");
        //Como extrair usando flatMap
        devdojo.stream().flatMap(Collection::stream).forEach(System.out::println);
    }
}
