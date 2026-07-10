package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Midoriya");
        list.add("Natuto");

        for (String s : list) {
            System.out.println(s);
        }

        add(list, new Consumidor("Goku"));

        for (Object s : list) {
            System.out.println(s);
        }
    }

    private static void add(List list, Consumidor consumidor){
        list.add(consumidor);
    }
}
