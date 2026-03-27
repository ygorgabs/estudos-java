package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;

public class DosFilesAttributes {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("pasta/teste.txt");
        if(Files.notExists(path))
            Files.createFile(path);

        /*DosFilesAttributes filesAttributes = Files.readAttributes(path, DosFilesAttributes.class);
        System.out.println(filesAttributes.isHidden());
        System.out.println(filesAttributes.isReadOnly());*/

        DosFileAttributeView fileAttributeView = Files.getFileAttributeView(path, DosFileAttributeView.class);
        fileAttributeView.setHidden(true);
        fileAttributeView.setReadOnly(true);

        System.out.println(fileAttributeView.readAttributes().isHidden());
        System.out.println(fileAttributeView.readAttributes().isHidden());
    }
}
