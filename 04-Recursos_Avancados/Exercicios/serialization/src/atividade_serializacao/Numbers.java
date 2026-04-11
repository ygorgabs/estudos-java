package atividade_serializacao;

import atividade_serializacao.obj.SerializationUtils;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Random;

public class Numbers {
    private ArrayList<Double> conjDouble;

    public Numbers(){

    }

    public void addRamdomNumber(){

        Path file = Path.of("numbers.out");

        Random random = new Random();
        double num = random.nextDouble();
        //noinspection unchecked
        conjDouble = (Files.notExists(file)) ? new ArrayList<>() : (ArrayList<Double>) SerializationUtils.fromFile(file);
        conjDouble.add(num);
        SerializationUtils.toFile(conjDouble, file);
    }

    public ArrayList<Double> getConjDouble() {
        return conjDouble;
    }

    @Override
    public String toString() {
        return "Numbers{" +
                "conjDouble=" + conjDouble +
                '}';
    }
}
