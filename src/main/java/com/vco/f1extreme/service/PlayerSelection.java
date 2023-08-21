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



    public void addPlayer(Player player) {
        players.add(player);
    }
}
