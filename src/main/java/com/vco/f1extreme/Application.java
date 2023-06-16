package main.java.com.vco.f1extreme;

import main.java.com.vco.f1extreme.model.Car;
import main.java.com.vco.f1extreme.model.Pilot;
import main.java.com.vco.f1extreme.model.Player;
import main.java.com.vco.f1extreme.service.PlayerSelection;
import main.java.com.vco.f1extreme.service.DataInitializer;
import java.util.List;

public class Application {
    public static void main(String[] args) {


        // Obtener los pilotos por defecto
        List<Pilot> availablePilots = DataInitializer.getDefaultPilots();

        // Crear una instancia de PlayerSelection con los pilotos por defecto
        PlayerSelection playerSelection = new PlayerSelection(availablePilots);
        Pilot pilot = availablePilots.get(0);
        Car car = new Car("Red",2,"Ford",102,80,1,1);
        // Add players
        playerSelection.addPlayer(new Player("Player 1", "Red",pilot,car));



        Player selectedPlayer = playerSelection.selectPlayer();

        System.out.println("You selected: " + selectedPlayer.getName() + selectedPlayer.getName() + selectedPlayer.getPilot().getNickname());
    }
}

