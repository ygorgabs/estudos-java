package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWritterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try (FileWriter fw = new FileWriter(file,true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("Senhoooor Seshoumarou");
            bw.newLine();
            bw.write("Onigumo coração do Naraki");
            bw.flush();
        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
