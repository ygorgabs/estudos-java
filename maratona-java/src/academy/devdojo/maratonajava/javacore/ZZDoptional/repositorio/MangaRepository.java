package academy.devdojo.maratonajava.javacore.ZZDoptional.repositorio;

import academy.devdojo.maratonajava.javacore.ZZDoptional.dominio.Manga;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> mangas = new ArrayList<>(List.of(new Manga(1, "Boku no hero", 50),new Manga(2, "Inuyasha", 200)));

    private static Optional<Manga> find(Predicate<Manga> predicate){
        Optional<Manga> manga = Optional.empty();
        for (Manga e : mangas) {
            if(predicate.test(e)){
                manga = Optional.of(e);
            }
        }
        return manga;
    }

    public static Optional<Manga> findByTitle(String title){
        return find(o -> o.getTitle().equals(title));
    }

    public static Optional<Manga> findById(Integer id){
        return find(o -> o.getId().equals(id));
    }
}
