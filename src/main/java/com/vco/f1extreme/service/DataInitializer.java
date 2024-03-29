package main.java.com.vco.f1extreme.service;
import main.java.com.vco.f1extreme.model.Car;
import main.java.com.vco.f1extreme.model.Pilot;
import main.java.com.vco.f1extreme.model.Circuit;
import main.java.com.vco.f1extreme.model.Weather;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataInitializer {



    public static List<Pilot> getDefaultPilots()
    {
        List<Pilot>pilots=new ArrayList<>();
        //List es una interfaz que se usa para representar una lista ordenada de elementos.
        // Puedes realizar operaciones como agregar, remover e iterar sobre elementos en una List.


        //todos los pilotos
        pilots.add(new Pilot("Castro","Fiaca","ARG",5,3,10,2,4,"HIGH"));
        pilots.add(new Pilot("Pablo","El mandarin","CHI",6,1,2,1,6,"MEDIUM"));
        pilots.add(new Pilot("Joaquin","Dormilon","BOL",8,2,3,0,3,"LOW"));

        return pilots;
    }
    public static List<Car> getDefaultCars() {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Red", 1, "Ferrari", 750, 350, 2.5f, 12.5f, 115.2f));
        cars.add(new Car("Silver", 44, "Mercho", 800, 345, 2.4f, 11.8f,110.2f));
        cars.add(new Car("Orange", 33, "McLaren", 720, 335, 2.6f, 12.2f,113.2f));
        // Agrega más escuderías y sus detalles aquí...

        return cars;
    }

    public static List<Circuit> getDefaultCircuits() {
        List<Circuit> circuits = new ArrayList<>();
        List<Circuit.typecurve> monacoCurves = Arrays.asList(Circuit.typecurve.OPEN, Circuit.typecurve.CLOSE);
        circuits.add(new Circuit("Monaco", "Monaco", 3300, 70, "infographicURL1", "1:14.260", 3, monacoCurves, Weather.NUBLADO));


        return circuits;
    }


}
