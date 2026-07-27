package exerciciosStream;

import java.util.Objects;

public class Produto {
    public enum Categoria {
        ELETRONICO, DECORACAO, LIMPEZA, MOVEIS, CONSTRUCAO
    }
    private String name;
    private double price;
    private Categoria categoria;

    public Produto(String name, double price, Categoria categoria) {
        this.name = name;
        this.price = price;
        this.categoria = categoria;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", categoria=" + categoria +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(name, produto.name) && categoria == produto.categoria;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, categoria);
    }
}
