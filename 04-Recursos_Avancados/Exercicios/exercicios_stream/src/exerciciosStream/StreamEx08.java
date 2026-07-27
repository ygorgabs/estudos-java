package exerciciosStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx08 {
    public static void main(String[] args) {
        List<String> cidades = Arrays.asList("São Paulo", "Rio de Janeiro", "Curitiba", "Belo Horizonte", "Recife", "João Pessoa", "Salvador", "Porto Alegre");
        String cidadesConcatendas = cidades.stream().collect(Collectors.joining(", "));
        System.out.println(cidadesConcatendas);
    }
}
