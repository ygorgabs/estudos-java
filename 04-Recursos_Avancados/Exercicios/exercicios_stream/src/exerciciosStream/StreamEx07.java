package exerciciosStream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static exerciciosStream.Produto.*;

public class StreamEx07 {
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
                new Produto("Galaxy A57",1850, Categoria.ELETRONICO),
                new Produto("Abajur", 125.5, Categoria.DECORACAO),
                new Produto("Positivo Vision R15", 3200.99, Categoria.ELETRONICO),
                new Produto("Tinta de parede", 200, Categoria.CONSTRUCAO),
                new Produto("Kit chave de fenda", 50, Categoria.CONSTRUCAO),
                new Produto("Fone de ouvido", 15, Categoria.ELETRONICO),
                new Produto("Espelho", 185, Categoria.DECORACAO)
        );

        Map<Categoria, List<Produto>> collect = produtos.stream().collect(Collectors.groupingBy(Produto::getCategoria));
        System.out.println(collect);
    }
}
