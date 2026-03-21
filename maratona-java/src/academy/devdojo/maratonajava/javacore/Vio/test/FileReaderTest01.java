package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader fr = new FileReader(file)) {

//            char[] in = new char[1];
//            fr.read(in);
//            for(char c : in){
//                System.out.println(c);
//            }

            int i;
            StringBuilder sb = new StringBuilder();
            while((i=fr.read()) != -1){
                sb.append((char)i);
            }
            System.out.print(sb);

        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
