package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();

        nomes.add("Ygor");
        nomes.add("DevDojo");

        nomes2.add("Gabriel");
        nomes2.add("DevDojo2");

        nomes.addAll(nomes2);

        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("-----------------------");

        for (int i = 0; i < nomes2.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
}
