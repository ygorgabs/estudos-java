package io;

import java.nio.file.Files;
import java.nio.file.Path;

public class FileApp {
    public static void main(String[] args) {
        Path file1 = Path.of("Examples/File1.txt");
        System.out.println(file1.toAbsolutePath());
        System.out.println(Files.exists(file1));
        System.out.println(Files.isDirectory(file1));
        System.out.println(Files.isRegularFile(file1));
    }
}
