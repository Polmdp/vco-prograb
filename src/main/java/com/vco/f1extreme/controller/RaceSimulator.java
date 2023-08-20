package main.java.com.vco.f1extreme.controller;

import main.java.com.vco.f1extreme.model.Car;
import main.java.com.vco.f1extreme.model.Circuit;
import main.java.com.vco.f1extreme.model.Pilot;
import main.java.com.vco.f1extreme.model.GameSession;

public class RaceSimulator implements Runnable {

    private GameSession gameSession;

    public RaceSimulator(GameSession gameSession) {
        this.gameSession = gameSession;
    }

    private boolean needsPitStop() {
        // necesita un pit stop en esta vuelta.
        return Math.random() < 0.1;  // Por ejemplo, un 10% de probabilidad.
    }

    private float pitStopTime() {
        float baseTime = 5.0f;  // 5 segundos como base.
        float randomTime = (float) (Math.random() * 3);  // random time.
        return baseTime + randomTime;
    }

    @Override
    public void run() {

        while (gameSession.getSelectedCircuit() == null || gameSession.getSelectedCar() == null || gameSession.getSelectedPilot() == null) {
            try {
                Thread.sleep(1000);  // espera 1 segundo antes de volver a verificar
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Circuit circuit = gameSession.getSelectedCircuit();
        Car pilotCar = gameSession.getSelectedCar();
        Pilot pilot = gameSession.getSelectedPilot();


        for (int lap = 1; lap <= circuit.getNumberOfLaps(); lap++) { // Comenzamos desde lap = 1 para una representación más intuitiva
            if (needsPitStop()) {
                // sumar tiempo a la vuelta
            }


            System.out.println("Vuelta Nº: " + lap);
            System.out.println("Piloto: " + pilot.getPilotName());
            System.out.println("Auto: " + pilotCar.getBrand());
            System.out.println("---------");


        }
    }
}
