package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Carro> carros = criarArrayComObjeto(new Carro("Ferrari"));
        System.out.println(carros);
    }

    private static <T> List<T> criarArrayComObjeto(T t){
        return List.of(t);
    }
}
