package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<>(List.of(new Anime("Berserk", 26), new Anime("One Piece", 1185), new Anime("Naruto", 500)));
//        Collections.sort(animes, (a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
//        animes.sort(AnimeComparator::compareByTitle);
        animes.sort(AnimeComparator::compareByEpsiodes);
        System.out.println(animes);
    }
}
