package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MathodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparator> newAnime = AnimeComparator::new;
        AnimeComparator animeComparator = newAnime.get();
        List<Anime> animes = new ArrayList<>(List.of(new Anime("Berserk", 26), new Anime("One Piece", 1185), new Anime("Naruto", 500)));
        animes.sort(animeComparator::compareNonStatic);
        System.out.println(animes);

        System.out.println("--------------------");

        BiFunction<String, Integer, Anime> animeBiFunction = Anime::new;
        System.out.println(animeBiFunction.apply("Super Onze", 112));
    }
}
