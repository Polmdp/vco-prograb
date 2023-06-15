package main.java.com.vco.f1extreme.model;

public class Player {

    private int playerCount;
    private String name;
    private String color;
    private Pilot pilot;
    private Car car;


    public Player(String name, String color, Pilot pilot, Car car) {

        this.name = name;
        this.color = color;
        this.pilot = pilot;
        this.car = car;
    }

    public int getPlayerCount() {
        return playerCount;
    }

    public void setPlayerCount(int playerCount) {
        this.playerCount = playerCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
//    Existen dos tipos de jugadores: Reales (personas) y Simulados (autogestionados por la
  //      computadora). Al comienzo de la aplicación, deberá seleccionarse la cantidad de personas que
    //    jugarán y cada uno de ellos ingresará su nombre, su avatar/color y seleccionará un piloto de
      //  carreras y un automóvil.

