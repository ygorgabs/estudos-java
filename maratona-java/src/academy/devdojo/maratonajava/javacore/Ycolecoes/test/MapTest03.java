package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Ygor Silva");
        Consumidor consumidor2 = new Consumidor("Dev Dojo");

        Manga manga1 = new Manga(5, "Jujustsu Kaisen", 10.21);
        Manga manga2 = new Manga(3,"Dragon Ball",29.98);
        Manga manga3 = new Manga(1, "Atack on Titan", 21.21);
        Manga manga4 = new Manga(2, "Naruto", 98.1);
        Manga manga5 = new Manga(4, "Kimetsu no Yaiba", 30.2);

        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, List.of(manga1, manga2, manga3));
        consumidorMangaMap.put(consumidor2, List.of(manga4, manga5));

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()) {
            System.out.println(entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println("->" + manga.getNome());
            }
        }
    }
}
