package Vehicles;

import java.util.logging.Handler;

public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.setName("Subaru");
        System.out.println(car.getName() + " goes ");
        car.makeNoise();

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.setName("Motorcycle");
        System.out.println(motorcycle.getName() + " goes ");
        motorcycle.makeNoise();
    }


}
