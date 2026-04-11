package atividade_serializacao;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Client implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private final int id;
    private final String name;
    private final LocalDate birthDate;
    private final transient String document;

    private int age;

    public Client(int id, String name, LocalDate birthDate, String document) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.document = document;
        System.out.println("[ Constructor ]");
    }

    public Client(int id, String name, LocalDate birthDate){
        this(id, name, birthDate, null);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Client client = (Client) object;
        return id == client.id && Objects.equals(name, client.name) && Objects.equals(birthDate, client.birthDate) && Objects.equals(document, client.document);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, birthDate, document);
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", document='" + document + '\'' +
                '}';
    }
}
