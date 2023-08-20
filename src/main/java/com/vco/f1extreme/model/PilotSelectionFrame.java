package main.java.com.vco.f1extreme.model;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;




public class PilotSelectionFrame extends JFrame {
    private final List<Circuit> availableCircuits;
    private final GameSession gameSession;


    imagenfondo fondo=new imagenfondo();
    private JPanel cardPanel;
    private CardLayout cardLayout;


    public PilotSelectionFrame(List<Pilot> availablePilots, List<Car> availableCars, List<Circuit> availableCircuits, GameSession gameSession) {
        this.availableCircuits = availableCircuits;
        this.gameSession = gameSession;
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

                    if (car.getBrand().equals("Mercho")) {
                        try {
                            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(getClass().getClassLoader().getResource("main/resources/sounds/mercho2.wav"));
                            Clip clip = AudioSystem.getClip();
                            clip.open(audioInputStream);
                            clip.start();
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                }
            });

            carPanel.add(button);
            float weightEffect = car.calculateWeightEffect(car.getWeight());

            JLabel infoLabel = new JLabel("<html>Brand: " + car.getBrand() + "<br/>" +
                    "Color: " + car.getColor() + "<br/>" +
                    "Number: " + car.getNumber() + "<br/>" +
                    "Weight: " + car.getWeight() + "<br/>" +
                    "Max Speed: " + car.getMaxSpeed() + "<br/>" +
                    "Acceleration: " + car.getAcceleration() + "<br/>" +
                    "Weight Effect: " + weightEffect + "<br/>" +
                    "Perf Curves: " + car.perfcurves() + "<br/>" +
                    "Fuel Consumption: " + car.getFuelConsumption() + "</html>");

            carPanel.add(infoLabel);
            panel.add(carPanel);
        }

        return panel;
    }


    private void handlePilotSelection(Pilot selectedPilot) {
        gameSession.setSelectedPilot(selectedPilot);
        System.out.println("Selected Pilot: " + selectedPilot.toString());

        cardLayout.show(cardPanel, "CarSelection"); // Cambiar al panel de selección de autos
    }

    private void handleCarSelection(Car selectedCar) {
        //car selection
        gameSession.setSelectedCar(selectedCar);
        System.out.println("Selected Car: " + selectedCar.toString());
        TrackSelectionFrame trackSelectionFrame = new TrackSelectionFrame(availableCircuits, gameSession);
        trackSelectionFrame.setVisible(true);

    }



    class imagenfondo extends JPanel{
        private Image imagen;

        public void paint(Graphics g) {
            super.paint(g);
            imagen = new ImageIcon(getClass().getResource("Fondo.png")).getImage();
            g.drawImage(imagen, 800, 600, getWidth(), getHeight(), this);
            setOpaque(false);
        }



    }

}


