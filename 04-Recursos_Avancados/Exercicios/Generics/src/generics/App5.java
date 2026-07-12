package generics;

import java.util.ArrayList;
import java.util.List;

public class App5 {
    public static void main(String[] args) {
        Vehicle.Bus bus = new Vehicle.Bus();
        Vehicle.Car car = new Vehicle.Car();

        List<Vehicle> vehicles = new ArrayList<>(List.of(bus, car));
        driveVehicles(vehicles);
    }

    private static void driveVehicles(List<Vehicle> vehicles){
        for (Vehicle vehicle : vehicles) {
            vehicle.drive();
        }
    }
}
