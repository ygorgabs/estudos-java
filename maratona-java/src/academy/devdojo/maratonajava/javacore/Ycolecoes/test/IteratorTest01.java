package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L,"Jujustsu Kaisen",10.21,0));
        mangas.add(new Manga(3L,"Dragon Ball",29.98,5));
        mangas.add(new Manga(1L, "Atack on Titan", 21.21,0));
        mangas.add(new Manga(2L, "Naruto", 98.1,2));
        mangas.add(new Manga(4L, "Kimetsu no Yaiba", 30.2,0));

//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while (mangaIterator.hasNext()){
//            if(mangaIterator.next().getQuantidade() == 0) mangaIterator.remove();
//        }

        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);
    }
}
