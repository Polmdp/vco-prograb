package main.java.com.vco.f1extreme.model;

public class GameSession {

    private Pilot selectedPilot;
    private Car selectedCar;
    private Circuit selectedCircuit;


    public Pilot getSelectedPilot() {
        return selectedPilot;
    }

    public void setSelectedPilot(Pilot selectedPilot) {
        this.selectedPilot = selectedPilot;
    }

    public Car getSelectedCar() {
        return selectedCar;
    }

    public void setSelectedCar(Car selectedCar) {
        this.selectedCar = selectedCar;
    }

    public Circuit getSelectedCircuit() {
        return selectedCircuit;
    }

    public void setSelectedCircuit(Circuit selectedCircuit) {
        this.selectedCircuit = selectedCircuit;
    }
}
