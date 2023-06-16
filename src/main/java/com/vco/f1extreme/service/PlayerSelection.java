package main.java.com.vco.f1extreme.service;
import main.java.com.vco.f1extreme.model.Player;
import main.java.com.vco.f1extreme.model.Pilot;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayerSelection {

    private List<Player> players;
    private List<Pilot> pilots; // Nueva lista para almacenar los pilotos

    public PlayerSelection() {
        this.players = new ArrayList<>();
        this.pilots = new ArrayList<>();
    }

    public PlayerSelection(List<Pilot> pilots) {
        this.players = new ArrayList<>();
        this.pilots = new ArrayList<>(pilots); // Inicializar con los pilotos proporcionados
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    // Function to select a player from the list
    public Player selectPlayer() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a player:");
        for (int i = 0; i < players.size(); i++) {
            System.out.println((i + 1) + ". " + players.get(i).getName());
        }
        int choice = scanner.nextInt();
        return players.get(choice - 1);
    }
}

