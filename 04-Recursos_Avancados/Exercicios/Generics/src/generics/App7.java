package generics;

import java.util.ArrayList;
import java.util.List;

public class App7 {
    public static void main(String[] args) {
        Vehicle.Bus bus = new Vehicle.Bus();
        Vehicle.Car car = new Vehicle.Car();

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(bus);
        vehicles.add(car);

        List<? extends Vehicle> cars = new ArrayList<Vehicle.Car>();

        //Não compila, não é possivel adicionar elementos p/ manter a coerência
        //cars.add(car);

        cars.removeFirst();
    }
}
