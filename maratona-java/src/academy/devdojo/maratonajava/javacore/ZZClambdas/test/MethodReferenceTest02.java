package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparator;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<>(List.of(new Anime("Berserk", 26), new Anime("One Piece", 1185), new Anime("Naruto", 500)));
        AnimeComparator animeComparator = new AnimeComparator();
        animes.sort(animeComparator::compareNonStatic);
        System.out.println(animes);
    }
}
