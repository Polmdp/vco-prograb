package main.java.com.vco.f1extreme;

import main.java.com.vco.f1extreme.model.Car;
import main.java.com.vco.f1extreme.model.Pilot;
import main.java.com.vco.f1extreme.model.Player;
import main.java.com.vco.f1extreme.service.PlayerSelection;
import main.java.com.vco.f1extreme.service.DataInitializer;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        // list default pilots
        List<Pilot> availablePilots = DataInitializer.getDefaultPilots();

        // new playerselection instance
        PlayerSelection playerSelection = new PlayerSelection(availablePilots);

        // add player + pilot selection
        Player newPlayer = playerSelection.addPlayerWithSelection();

        // print
        System.out.println("Player Name: " + newPlayer.getName() + "\nSelected Pilot:\n " + newPlayer.getPilot().toString());    }
}
