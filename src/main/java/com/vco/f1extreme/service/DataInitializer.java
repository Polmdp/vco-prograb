package main.java.com.vco.f1extreme.service;

import main.java.com.vco.f1extreme.model.Pilot;

public class DataInitializer {
    public static List<Pilot> getdefaultpilots()
    {
        List<Pilot>pilots=new ArrayList<>();
        //todos los pilotos
        pilots.add(new Pilot("Castro","Fiaca","ARG",5,3,10,2,4,"HIGH"));
        pilots.add(new Pilot("Pablo","El mandarin","CHILE",6,1,2,1,6,"MEDIUM"));
        pilots.add(new Pilot("Joaquin","Dormilon","BOLIVIA",8,2,3,0,3,"LOW"));


        return pilots;
    }

}
