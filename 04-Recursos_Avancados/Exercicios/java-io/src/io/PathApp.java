package io;

import java.nio.file.Path;

public class PathApp {
    public static void main(String[] args) {
        Path p1 = Path.of("/home","ygor-gabriel","Downloads","java-io-main","examples","file1.txt");
        System.out.println(p1);

        Path p2 = p1.getFileName();
        System.out.println(p2);

        Path p3 = p1.getRoot();
        System.out.println(p3);
    }
}
