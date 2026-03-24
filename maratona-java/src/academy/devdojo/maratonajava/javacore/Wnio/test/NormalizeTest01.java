package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String diretorioProjeto = "home/ygor/dev";
        String arquivoTxt = "../../arquivo.txt";
        Path path1 = Path.of(diretorioProjeto,arquivoTxt);
        System.out.println(path1);
        System.out.println(path1.normalize());

        Path path2 = Path.of("/home/./ygor/./dev/");
        System.out.println(path2);
        System.out.println(path2.normalize());
    }
}
