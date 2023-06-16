package main.java.com.vco.f1extreme.service;

import main.java.com.vco.f1extreme.model.Car;
import main.java.com.vco.f1extreme.model.Player;
import main.java.com.vco.f1extreme.model.Pilot;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayerSelection {

    private List<Player> players;
    private List<Pilot> pilots; // Nueva lista para almacenar los pilotos

    public PlayerSelection(List<Pilot> pilots) {
        this.players = new ArrayList<>();
        this.pilots = new ArrayList<>(pilots); // Inicializar con los pilotos proporcionados
    }

    public Pilot selectPilot() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a Pilot");
        for (int i = 0; i < pilots.size(); i++) {
            System.out.println((i + 1) + ". " + pilots.get(i).getPilotName());
        }
        int choice = scanner.nextInt();
        return pilots.get(choice - 1);
    }

    public Player addPlayerWithSelection() {
        Scanner scanner = new Scanner(System.in);

        // allow user to put Name and Color
        System.out.println("Player Name:");
        String name = scanner.nextLine();
        System.out.println("Insert Color:");
        String color = scanner.nextLine();

        // Pilot Selection
        Pilot selectedPilot = selectPilot();

        // here we are creating the player with previous data
        //
        // here we have to create the logic to select cars
        Car car = new Car("Red", 2, "Ford", 102, 80, 1, 1);
        Player newPlayer = new Player(name, color, selectedPilot, car);

        // add player to list
        addPlayer(newPlayer);

        return newPlayer;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }
}
