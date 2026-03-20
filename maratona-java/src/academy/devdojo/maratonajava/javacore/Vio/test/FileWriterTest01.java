package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try (FileWriter fw = new FileWriter(file,true)) {
            fw.write("Senhoooor Seshoumarou\nOnigumo coração do Naraki");
            fw.flush();
        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
