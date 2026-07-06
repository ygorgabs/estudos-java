package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {

        MangaByName comparator = new MangaByName();

        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5,"Jujustsu Kaisen",10.21));
        mangas.add(new Manga(3,"Dragon Ball",29.98));
        mangas.add(new Manga(1, "Atack on Titan", 21.21));
        mangas.add(new Manga(2, "Naruto", 98.1));
        mangas.add(new Manga(4, "Kimetsu no Yaiba", 30.2));

//        Collections.sort(mangas);
        mangas.sort(comparator);
        Manga mangaToSearch = new Manga(3,"Dragon Ball",29.98);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println(Collections.binarySearch(mangas, mangaToSearch, comparator));
    }
}
