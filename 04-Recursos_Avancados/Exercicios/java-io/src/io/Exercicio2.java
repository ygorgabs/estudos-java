package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class Exercicio2 {
    public static void main(String[] args) throws IOException {
        newFile(Path.of("Examples"));
    }

    public static void newFile(Path inicialPath) throws IOException {

        OffsetDateTime time = Instant.ofEpochMilli(System.currentTimeMillis()).atOffset(ZoneOffset.of("-03:00"));
        var nameFile = "file_"+time+".txt";
        Path newFile = inicialPath.resolve(nameFile);

        if(Files.notExists(newFile)){
            Files.createFile(newFile);
        }
    }

}
