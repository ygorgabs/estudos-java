package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByName implements Comparator<Manga>{

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getNome().compareTo(manga2.getNome());
    }
}
public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5,"Jujustsu Kaisen",10.21));
        mangas.add(new Manga(3,"Dragon Ball",29.98));
        mangas.add(new Manga(1, "Atack on Titan", 21.21));
        mangas.add(new Manga(2, "Naruto", 98.1));
        mangas.add(new Manga(4, "Kimetsu no Yaiba", 30.2));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("-------------------");
        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("-------------------");
        Collections.sort(mangas, new MangaByName());
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
