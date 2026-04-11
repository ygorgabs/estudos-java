package atividade_serializacao.obj;

import atividade_serializacao.Numbers;

import java.nio.file.Path;

public class RandomNumers {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        numbers.addRamdomNumber();
        System.out.println(numbers);
    }
}
