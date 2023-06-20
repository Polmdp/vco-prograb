package main.java.com.vco.f1extreme.model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;



public class PilotSelectionFrame extends JFrame {

    private JPanel cardPanel;
    private CardLayout cardLayout;

    public PilotSelectionFrame(List<Pilot> availablePilots, List<Car> availableCars) {
        setTitle("Selecciona un Piloto Broder");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        JPanel pilotSelectionPanel = createPilotSelectionPanel(availablePilots);
        cardPanel.add(pilotSelectionPanel, "PilotSelection");

        JPanel carSelectionPanel = createCarSelectionPanel(availableCars);
        cardPanel.add(carSelectionPanel, "CarSelection");

        add(cardPanel);

        cardLayout.show(cardPanel, "PilotSelection");
    }

    private JPanel createPilotSelectionPanel(List<Pilot> availablePilots) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 3));

        for (Pilot pilot : availablePilots) {
            JPanel pilotPanel = new JPanel();
            pilotPanel.setLayout(new BoxLayout(pilotPanel, BoxLayout.Y_AXIS));

            JButton button = new JButton();
            button.setIcon(pilot.getImageIcon());
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    handlePilotSelection(pilot);
                }
            });

            pilotPanel.add(button);

            JLabel infoLabel = new JLabel("<html>Name: " + pilot.getPilotName() + "<br/>" +
                    "Nickname: " + pilot.getNickname() + "<br/>" +
                    "Country: " + pilot.getCountry() + "<br/>" +
                    "Races Run: " + pilot.getRacesRun() + "<br/>" +
                    "Races Won: " + pilot.getRacesWon() + "<br/>" +
                    "Championships Played: " + pilot.getChampionshipsPlayed() + "<br/>" +
                    "Championships Won: " + pilot.getChampionshipsWon() + "<br/>" +
                    "Number of Pole Positions: " + pilot.getNumberPolePositions() + "<br/>" +
                    "Budget: " + pilot.getBudget() + "</html>");

            pilotPanel.add(infoLabel);
            panel.add(pilotPanel);
        }

        return panel;
    }

    private JPanel createCarSelectionPanel(List<Car> availableCars) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 3));

        for (Car car : availableCars) {
            JPanel carPanel = new JPanel();
            carPanel.setLayout(new BoxLayout(carPanel, BoxLayout.Y_AXIS));

            JButton button = new JButton();
            button.setIcon(car.getImageIcon());
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    handleCarSelection(car);
                }
            });

            carPanel.add(button);

            JLabel infoLabel = new JLabel("<html>Brand: " + car.getBrand() + "<br/>" +
                    "Color: " + car.getColor() + "<br/>" +
                    "Number: " + car.getNumber() + "<br/>" +
                    "Weight: " + car.getWeight() + "<br/>" +
                    "Max Speed: " + car.getMaxSpeed() + "<br/>" +
                    "Acceleration: " + car.getAcceleration() + "<br/>" +
                    "Fuel Consumption: " + car.getFuelConsumption() + "</html>");

            carPanel.add(infoLabel);
            panel.add(carPanel);
        }

        return panel;
    }

    private void handlePilotSelection(Pilot selectedPilot) {

        System.out.println("Selected Pilot: " + selectedPilot.toString());

        cardLayout.show(cardPanel, "CarSelection"); // Cambiar al panel de selección de autos
    }

    private void handleCarSelection(Car selectedCar) {
        //car selection
        System.out.println("Selected Car: " + selectedCar.toString());
    }
}