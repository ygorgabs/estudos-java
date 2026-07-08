package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone>{

    @Override
    public int compare(Smartphone smartphone1, Smartphone smartphone2) {
        return smartphone1.getMarca().compareTo(smartphone2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return Double.compare(manga1.getPreco(), manga2.getPreco());
    }
}
public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator()); // classe sem comparable
        Smartphone smartphone = new Smartphone("A25C1ZTO", "Nokia");
        set.add(smartphone);
        System.out.println(set);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator()); // Classe com comparable
        mangas.add(new Manga(5,"Jujustsu Kaisen",10.21));
        mangas.add(new Manga(3,"Dragon Ball",29.98));
        mangas.add(new Manga(1, "Atack on Titan", 21.21));
        mangas.add(new Manga(2, "Naruto", 98.1));
        mangas.add(new Manga(4, "Kimetsu no Yaiba", 30.2));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga yuyu = new Manga(21L, "Yuyu Hakusho", 21.21, 5);
        System.out.println("---------------------");
        System.out.println(mangas.lower(yuyu));
        System.out.println(mangas.floor(yuyu));
        System.out.println(mangas.higher(yuyu));
        System.out.println(mangas.ceiling(yuyu));

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.size());
    }
}
