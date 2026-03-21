package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("pasta");
        boolean isDirectoryCreated = fileDiretorio.mkdir();
        System.out.println("Arquivo criado " + isDirectoryCreated);

        File fileArquivoDiretorio = new File(fileDiretorio, "arquivo.txt");
        boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        System.out.println("Diretorio criado " + isFileCreated);

        File fileRenamed = new File(fileDiretorio, "arquivo_renomeado.txt");
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println("Arquivo renomeado" + isRenamed);

        File directoryRenamed = new File("pasta2");
        boolean isDirectoryRenamed = fileDiretorio.renameTo(directoryRenamed);
        System.out.println("Diretorio renomeado " + isDirectoryRenamed);
    }
}
