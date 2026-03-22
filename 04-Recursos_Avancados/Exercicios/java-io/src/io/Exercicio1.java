package io;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Exercicio1 {
    public static void main(String[] args) {
        Path path = Path.of("Examples");
        try {
            System.out.println("Soma de bytes da pasta: " + calculateSize(path));
        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    public static long calculateSize(Path inicialPath) throws IOException{
        var soma = 0L;
        try (DirectoryStream<Path> files = Files.newDirectoryStream(inicialPath)) {

            for(Path path:files){
                if(Files.isDirectory(path)){
                    soma += calculateSize(path);
                }else{
                    soma += Files.size(path);
                    System.out.println(path);
                }
            }
        }
        return soma;
    }

}