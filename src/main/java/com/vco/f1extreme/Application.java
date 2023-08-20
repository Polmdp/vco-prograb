package main.java.com.vco.f1extreme;


import main.java.com.vco.f1extreme.model.*;
import main.java.com.vco.f1extreme.controller.*;
import main.java.com.vco.f1extreme.service.PlayerSelection;
import main.java.com.vco.f1extreme.service.DataInitializer;

import javax.swing.*;
import java.util.List;



import javax.swing.*;



public class Application {
    public static void main(String[] args) {
        GameSession gameSession = new GameSession();
        List<Car> availableCars = DataInitializer.getDefaultCars();
        List<Pilot> availablePilots = DataInitializer.getDefaultPilots();
        List<Circuit> availableCircuits = DataInitializer.getDefaultCircuits();
        PilotSelectionFrame frame = new PilotSelectionFrame(availablePilots, availableCars, availableCircuits, gameSession);
        RaceSimulator simulator = new RaceSimulator(gameSession);
        Thread raceThread = new Thread(simulator);
        raceThread.start();

        frame.setVisible(true);
    }
}


