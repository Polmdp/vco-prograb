package main.java.com.vco.f1extreme.controller;

import main.java.com.vco.f1extreme.model.Car;
import main.java.com.vco.f1extreme.model.Circuit;
import main.java.com.vco.f1extreme.model.Pilot;
import main.java.com.vco.f1extreme.model.GameSession;
import java.time.Duration;

public class RaceSimulator implements Runnable {

    private GameSession gameSession;

    public RaceSimulator(GameSession gameSession) {
        this.gameSession = gameSession;
    }

    private boolean needsPitStop() {
        // necesita un pit stop en esta vuelta.
        return Math.random() < 0.2;  // Por ejemplo, un 20% de probabilidad.
    }

    private float pitStopTime() {
        float baseTime = 5.0f;  // 5 segundos como base.
        float randomTime = (float) (Math.random() * 3);  // random time.
        return baseTime + randomTime;
    }

    @Override
    public void run() {
        //esto es temporal, hay que hacerlo bien.
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

        float remainingFuel = pilotCar.getFuelcapacity(); // Al inicio, el tanque lleno

        float pilotCarSpeedInMetersPerSecond = pilotCar.getMaxSpeed() * 1000.0f / 3600.0f; // Convert km/h to m/s
        long averageLapTimeInSeconds = Math.round(circuit.getTrackLength() / pilotCarSpeedInMetersPerSecond);


        Duration duration = Duration.ofSeconds(averageLapTimeInSeconds);
        long minutes = duration.toMinutes();
        long seconds = duration.minusMinutes(minutes).getSeconds();

        Duration totalDuration = Duration.ZERO;





        for (int lap = 1; lap <= circuit.getNumberOfLaps(); lap++) { // Comenzamos desde lap = 1 para una representación más intuitiva
            if (needsPitStop()) {
                // sumar tiempo a la vuelta
                System.out.println("Uso Pit + 15 segundos");
                totalDuration = totalDuration.plusSeconds(15);
                remainingFuel = pilotCar.getFuelcapacity();


            }
            if (remainingFuel < pilotCar.FuelConsumptionPerLap(circuit.getTrackLength())){
                System.out.println("SE QUEDO SIN NAFTA !!");
            }



            totalDuration = totalDuration.plusSeconds(averageLapTimeInSeconds);


            System.out.println("Vuelta Nº: " + lap);
            System.out.println("Piloto: " + pilot.getPilotName());
            System.out.println("Auto: " + pilotCar.getBrand());
            System.out.println("---------");
            float fuelConsumedThisLap = pilotCar.FuelConsumptionPerLap(circuit.getTrackLength());
            remainingFuel -= fuelConsumedThisLap;

            System.out.println("Combustible restante después de la vuelta " + lap + ": " + remainingFuel + " litros");


        }
        System.out.println("Piloto: " + pilot.getPilotName());
        System.out.println("Auto: " + pilotCar.getBrand());
        System.out.println("---------");
        long totalHours = totalDuration.toHours();
        long totalMinutes = totalDuration.minusHours(totalHours).toMinutes();
        long totalSeconds = totalDuration.minusHours(totalHours).minusMinutes(totalMinutes).getSeconds();

        System.out.println("Tiempo Total Estimado: " + totalHours + " horas " + totalMinutes + " minutos " + totalSeconds + " segundos");


    }
}
