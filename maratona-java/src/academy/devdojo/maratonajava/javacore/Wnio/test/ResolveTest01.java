package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;

public class ResolveTest01 {
    public static void main(String[] args) {
        Path dir = Path.of("home/ygor");
        Path arquivo = Path.of("dev/arquivo.txt");
        Path resolve = dir.resolve(arquivo);
        System.out.println(resolve);

        Path absoluto = Path.of("/home/ygor");
        Path relativo = Path.of("dev");
        Path file = Path.of("file.txt");

        System.out.println("1 " + absoluto.resolve(relativo));
        System.out.println("2 " + absoluto.resolve(file));
        System.out.println("3 " + relativo.resolve(absoluto));
        System.out.println("4 " + absoluto.resolve(file));
        System.out.println("5 " + file.resolve(absoluto));
        System.out.println("6 " + file.resolve(relativo));
    }
}
