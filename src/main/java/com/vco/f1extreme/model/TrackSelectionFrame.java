package main.java.com.vco.f1extreme.model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.List;

public class TrackSelectionFrame extends JFrame {
    private JButton button1;
    private JPanel TrackImage1;
    private JPanel circuitSelectionPanel;
    private GameSession gameSession;

    public TrackSelectionFrame(List<Circuit> availableCircuits, GameSession gameSession) {
        this.gameSession = gameSession;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        circuitSelectionPanel = createCircuitSelectionPanel(availableCircuits);
        add(circuitSelectionPanel);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        TrackImage1.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
            }
        });
    }

    private JPanel createCircuitSelectionPanel(List<Circuit> availableCircuits) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 3));

        for (Circuit circuit : availableCircuits) {
            JPanel circuitPanel = new JPanel();
            circuitPanel.setLayout(new BoxLayout(circuitPanel, BoxLayout.Y_AXIS));

            JButton button = new JButton();
            // getImageIcon
            button.setIcon(circuit.getImageIcon());
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    handleCircuitSelection(circuit);
                }
            });

            circuitPanel.add(button);

            JLabel infoLabel = new JLabel("<html>Name: " + circuit.getName() + "<br/>" +
                    "Country: " + circuit.getCountry() + "<br/>" +
                    "Track Length: " + circuit.getTrackLength() + "<br/>" +
                    "Number of Laps: " + circuit.getNumberOfLaps() + "<br/>" +
                    "Lap Record: " + circuit.getLapRecord() + "<br/>" +
                    "Overtake Zones: " + circuit.getOvertakeZones() + "<br/>" +
                    "Weather: " + circuit.getWeather() + "<br/>" +
                    "</html>");

            circuitPanel.add(infoLabel);
            panel.add(circuitPanel);
        }

        return panel;
    }

    private void handleCircuitSelection(Circuit selectedCircuit) {
        System.out.println("Selected Circuit: " + selectedCircuit.getName());
        gameSession.setSelectedCircuit(selectedCircuit);




    }




}
