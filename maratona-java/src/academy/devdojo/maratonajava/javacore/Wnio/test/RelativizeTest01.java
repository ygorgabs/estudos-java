package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;

public class RelativizeTest01 {
    public static void main(String[] args) {
//        Path dir = Path.of("/home/ygor");
//        Path clazz = Path.of("/home/ygor/devdojo/OlaMundo.java");
//        Path pathToClazz = dir.relativize(clazz);
//        System.out.println(pathToClazz);

        Path absoluto1 = Path.of("/home/ygor");
        Path absoluto2 = Path.of("/usr/local");
        Path absoluto3 = Path.of("/home/ygor/devdojo/OlaMundo.java");
        Path relativo1 = Path.of("tmp");
        Path relativo2 = Path.of("tmp/tmp.20260323");

        System.out.println("1 " + absoluto1.relativize(absoluto3));
        System.out.println("2 " + absoluto3.relativize(absoluto1));
        System.out.println("3 " + absoluto1.relativize(absoluto2));
        System.out.println("4 " + relativo1.relativize(relativo2));
        System.out.println("5 " + relativo2.relativize(relativo1));
    }
}
