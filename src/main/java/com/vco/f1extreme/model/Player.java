package main.java.com.vco.f1extreme.model;

public class Player {
 private int cantjugadores;
 private String nombre;
 private String color;
 private Pilot piloto;
    public int getCantjugadores() {
        return cantjugadores;
    }

    public void setCantjugadores(int cantjugadores) {
        this.cantjugadores = cantjugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Pilot getPiloto() {
        return piloto;
    }

    public void setPiloto(Pilot piloto) {
        this.piloto = piloto;
    }
}
//    Existen dos tipos de jugadores: Reales (personas) y Simulados (autogestionados por la
  //      computadora). Al comienzo de la aplicación, deberá seleccionarse la cantidad de personas que
    //    jugarán y cada uno de ellos ingresará su nombre, su avatar/color y seleccionará un piloto de
      //  carreras y un automóvil.

