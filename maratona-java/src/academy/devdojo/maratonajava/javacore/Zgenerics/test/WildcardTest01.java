package academy.devdojo.maratonajava.javacore.Zgenerics.test;

abstract class Animal{
    public abstract void consulta();
}

class Cachorro extends Animal{

    @Override
    public void consulta() {
        System.out.println("Consultando cachorro");
    }
}

class Gato extends Animal{
    @Override
    public void consulta() {
        System.out.println("Consultando Gato");
    }
}
public class WildcardTest01 {
    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};

        printConsultas(cachorros);
        printConsultas(gatos);

        Animal[] animals = {new Gato(), new Cachorro()};
        printConsultas(animals);
    }

    private static void printConsultas(Animal[] animals){
        for (Animal animal : animals) {
            animal.consulta();
        }
    }
}
