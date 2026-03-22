package io;

import java.nio.file.Path;

public class PathApp2 {
    public static void main(String[] args) {
        Path p1 = Path.of("home");
        Path p2 = Path.of("ctosin");
        Path p3 = Path.of("log.out");

        Path p4 = p1.resolve(p2).resolve(p3);
        System.out.println(p4);

        Path p5 = p4.toAbsolutePath();
        System.out.println(p5);
    }
}
