package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileApp4 {
    public static void main(String[] args) throws IOException {
        Path file = Path.of("myFile.txt");
//        Files.createFile(file);

//        Files.delete(file);
        Files.deleteIfExists(file);
    }
}
