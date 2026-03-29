package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTes01 {
    public static void main(String[] args) {
        Path arquivoZip = Path.of("pasta/arquivo.zip");
        Path diretorioParaZip = Path.of("pasta/subpasta/subsubpasta");
        zip(arquivoZip, diretorioParaZip);
    }
    private static void zip(Path arquivoZip, Path diretorioParaZip){
        try(ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(arquivoZip));
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(diretorioParaZip)){

            for(Path file : directoryStream){
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                zipStream.putNextEntry(zipEntry);
                Files.copy(file,zipStream);
                zipStream.closeEntry();
            }

            System.out.println("Arquivo criado com sucesso");
        }catch (IOException e){
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
