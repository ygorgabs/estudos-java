package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FileApp5 {
    public static void main(String[] args) throws IOException {
        Path from = Path.of("Examples","File1.txt");
        Path to = from.getParent().resolve(Path.of("d1","File2.txt"));
        Files.copy(from,to, StandardCopyOption.REPLACE_EXISTING);
        Files.move(from,to, StandardCopyOption.REPLACE_EXISTING);
    }
}
