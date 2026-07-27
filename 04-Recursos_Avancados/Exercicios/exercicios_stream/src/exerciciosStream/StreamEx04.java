package exerciciosStream;

import java.util.Arrays;
import java.util.List;

import static exerciciosStream.Produto.Categoria;

public class StreamEx04 {
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
                new Produto("Galaxy A57",1850, Categoria.ELETRONICO),
                new Produto("Abajur", 125.5, Categoria.DECORACAO),
                new Produto("Positivo Vision R15", 3200.99, Categoria.ELETRONICO),
                new Produto("Tinta de parede", 200, Categoria.CONSTRUCAO)
        );

        System.out.println(produtos.stream()
                .filter(p -> p.getCategoria().equals(Categoria.ELETRONICO))
                .mapToDouble(Produto::getPrice)
                .sum());
    }
}
