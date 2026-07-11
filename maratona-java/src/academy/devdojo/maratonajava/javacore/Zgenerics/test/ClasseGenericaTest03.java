package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.BarcoRentavelService;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Iate")));
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Porsche")));
        RentalService<Carro> carroRentalService = new RentalService<>(carrosDisponiveis);
        Carro carro = carroRentalService.buscandoObjetoDisponivel();
        System.out.println("Usando carro por um mês...");
        carroRentalService.retornarObjetoAlugado(carro);

        System.out.println("---------------------");

        RentalService<Barco> barcoRentalService = new RentalService<>(barcosDisponiveis);
        Barco barco = barcoRentalService.buscandoObjetoDisponivel();
        System.out.println("Usando barco por um mês...");
        barcoRentalService.retornarObjetoAlugado(barco);


    }
}
