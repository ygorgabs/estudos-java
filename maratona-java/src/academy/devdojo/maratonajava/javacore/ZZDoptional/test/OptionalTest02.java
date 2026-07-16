package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import academy.devdojo.maratonajava.javacore.ZZDoptional.dominio.Manga;
import academy.devdojo.maratonajava.javacore.ZZDoptional.repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {

        //pesquisa com nome
        Optional<Manga> manga1 = MangaRepository.findByTitle("Boku no hero");
        manga1.ifPresent(m -> m.setTitle("Boku no hero 2"));
        System.out.println(manga1);

        //pesquisa com id
        Manga manga2 = MangaRepository.findById(2).orElseThrow(IllegalArgumentException::new);
        System.out.println(manga2);

        Manga manga3 = MangaRepository.findByTitle("Dragon ball").orElse(new Manga(3, "Dragon Ball", 151));
        System.out.println(manga3);
    }
}
