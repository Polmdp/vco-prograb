package main.java.com.vco.f1extreme.service;
import main.java.com.vco.f1extreme.model.Car;
import main.java.com.vco.f1extreme.model.Pilot;
import java.util.ArrayList;
import java.util.List;

import static main.java.com.vco.f1extreme.model.Car.calculateWeightEffect;

public class DataInitializer {
    public static List<Pilot> getDefaultPilots()
    {
        List<Pilot>pilots=new ArrayList<>();



        //todos los pilotos
        pilots.add(new Pilot("Castro","Fiaca","ARG",5,3,10,2,4,"HIGH"));
        pilots.add(new Pilot("Pablo","El mandarin","ARG",6,1,2,1,6,"MEDIUM"));
        pilots.add(new Pilot("Joaquin","Dormilon","USA",8,2,3,0,3,"LOW"));

        return pilots;
    }
    public static List<Car> getDefaultCars() {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Red", 1, "Ferrari", 1500, 350, 2.5f, 12.5f));
        cars.add(new Car("Silver", 44, "Mercho", 900, 345, 2.4f, 11.8f));
        cars.add(new Car("Orange", 33, "McLaren", 720, 335, 2.6f, 12.2f));


        return cars;
    }



}
