package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path pastaPath = Paths.get("pasta");

        //Para criar apenas uma pasta - se a pasta ja existir ou nao existir uma exceção é lançada
        if (Files.notExists(pastaPath)) {
            Path pastaDirectory = Files.createDirectory(pastaPath);
        }

        //serve para criar uma ou varias pastas - se ja existir ou nao existir nao irá lançar uma exceção
        Path subPastaPath = Paths.get("pasta/subpasta/subsubpasta");
        Path subPastaDirectories = Files.createDirectories(subPastaPath);

        //cria um arquivo
        Path filePath = Paths.get(subPastaDirectories.toString(),"file.txt");
        if(Files.notExists(filePath)){
            var filePathCreated = Files.createFile(filePath);
        }

        //copia e renomeia o arquivo

        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(),"file_renamed.txt");
//        Files.copy(source,target);
        Files.copy(source,target, StandardCopyOption.REPLACE_EXISTING);
    }
}
