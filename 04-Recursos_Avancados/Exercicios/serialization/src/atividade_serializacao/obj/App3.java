package atividade_serializacao.obj;

import atividade_serializacao.Client;

import java.nio.file.Path;
import java.time.LocalDate;

public class App3 {
    public static void main(String[] args) {
        Path file = Path.of("file.bin");

        Client client = new Client(10, "Maria", LocalDate.of(2001, 9, 14));
        SerializationUtils.toFile(client, file);

        Client clientRead = (Client) SerializationUtils.fromFile(file);
        System.out.println(clientRead);
    }
}
