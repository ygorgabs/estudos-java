package atividade_serializacao.obj;

import atividade_serializacao.Client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class App2 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("file.bin");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            Client client = (Client) ois.readObject();
            System.out.println(client);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
