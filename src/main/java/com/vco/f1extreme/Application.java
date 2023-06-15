package main.java.com.vco.f1extreme;

import main.java.com.vco.f1extreme.model.Car;
import main.java.com.vco.f1extreme.model.Pilot;
import main.java.com.vco.f1extreme.model.Player;
import main.java.com.vco.f1extreme.service.PlayerSelection;

public class Application {
    public static void main(String[] args) {


        // Create an instance of PlayerSelection
        PlayerSelection playerSelection = new PlayerSelection();

        Pilot pilot = new Pilot("Castro", "Fiaca", "ARG", 5, 3, 10, 2, 4, "HIGH");
        Car car = new Car("Red",2,"Ford",102,80,1,1);
        // Add players
        playerSelection.addPlayer(new Player("Player 1", "Red",pilot,car));


        // Call the selectPlayer method
        Player selectedPlayer = playerSelection.selectPlayer();

        // Print out the selected player
        System.out.println("You selected: " + selectedPlayer.getName());
    }
}

