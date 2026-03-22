package io;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileApp6 {
    public static void main(String[] args) {
        try (DirectoryStream<Path> files = Files.newDirectoryStream(Path.of(""),".*")) {
            for(Path path:files){
                System.out.println(path + " - " + Files.isDirectory(path));
            }
        }catch (IOException e){
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
