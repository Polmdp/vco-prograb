package main.java.com.vco.f1extreme.model;

public class Pilot extends  Player {

    protected String nombrepiloto;
    protected String apodo;
    protected String pais;
    protected int carrerascorridas;
    protected int carrerasganadas;
    protected int campeonatosjugados;
    protected int campeonatosganados;
    protected int cantidadpolepositions; //cantidad de veces que arranco primero una carrera;
    protected String presupuesto; //(ALTO/MEDIO/BAJO)
    public String getNombrepiloto() {
        return nombrepiloto;
    }

    public String getApodo() {
        return apodo;
    }

    public String getPais() {
        return pais;
    }

    public int getCarrerascorridas() {
        return carrerascorridas;
    }

    public int getCarrerasganadas() {
        return carrerasganadas;
    }

    public int getCampeonatosjugados() {
        return campeonatosjugados;
    }

    public int getCampeonatosganados() {
        return campeonatosganados;
    }

    public int getCantidadpolepositions() {
        return cantidadpolepositions;
    }

    public String getPresupuesto() {
        return presupuesto;
    }
}
