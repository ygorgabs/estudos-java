package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(5,"Jujustsu Kaisen",10.21));
        mangas.add(new Manga(3,"Dragon Ball",29.98));
        mangas.add(new Manga(1, "Atack on Titan", 21.21));
        mangas.add(new Manga(2, "Naruto", 98.1));
        mangas.add(new Manga(4, "Kimetsu no Yaiba", 30.2));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
