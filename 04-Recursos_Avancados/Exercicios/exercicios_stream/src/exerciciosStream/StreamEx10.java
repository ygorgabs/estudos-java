package exerciciosStream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class StreamEx10 {
    public static void main(String[] args) {
        List<List<String>> listasDeCompras = Arrays.asList(
                List.of("Banana", "Maça", "Pera")
        );

        List<String> list = listasDeCompras.stream().flatMap(Collection::stream).toList();
        System.out.println(list);
    }
}
