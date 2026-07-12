package generics;

import java.util.ArrayList;
import java.util.List;

public class App9 {
    public static void main(String[] args) {
        List<? extends Vehicle> l1 = new ArrayList<>();
        List<? extends Vehicle> l2 = new ArrayList<Vehicle.Bus>();
        List<? extends Vehicle> l3 = new ArrayList<Vehicle.Car>();

        List<? super Vehicle.Bus> l4 = new ArrayList<>();
        List<? super Vehicle.Bus> l5 = new ArrayList<Vehicle>();
        List<? super Vehicle.Bus> l6 = new ArrayList<Object>();

        l4.add(new Vehicle.Bus());
        Object e = l4.getFirst();
    }
}
