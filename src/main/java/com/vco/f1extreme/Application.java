package main.java.com.vco.f1extreme;

import main.java.com.vco.f1extreme.model.Car;
import main.java.com.vco.f1extreme.model.Pilot;
import main.java.com.vco.f1extreme.model.PilotSelectionFrame;
import main.java.com.vco.f1extreme.model.Player;
import main.java.com.vco.f1extreme.service.PlayerSelection;
import main.java.com.vco.f1extreme.service.DataInitializer;

import javax.swing.*;
import java.util.List;



import javax.swing.*;



public class Application {
    public static void main(String[] args) {



        List<Car> availableCars = DataInitializer.getDefaultCars();
        List<Pilot> availablePilots = DataInitializer.getDefaultPilots();

        PilotSelectionFrame frame = new PilotSelectionFrame(availablePilots, availableCars);
        frame.setVisible(true);
    }
}


