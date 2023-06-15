package main.java.com.vco.f1extreme.model;

public class Pilot extends  Player {

    private String nombrepiloto;
    private String apodo;
    private String pais;
    private int carrerascorridas;
    private int carrerasganadas;
    private int campeonatosjugados;
    private int campeonatosganados;
    private int cantidadpolepositions; //cantidad de veces que arranco primero una carrera;
    private String presupuesto; //(ALTO/MEDIO/BAJO);

    public Pilot(String nombrepiloto, String apodo, String pais, int carrerascorridas, int carrerasganadas, int campeonatosjugados, int campeonatosganados, int cantidadpolepositions, String presupuesto) {
        this.nombrepiloto = nombrepiloto;
        this.apodo = apodo;
        this.pais = pais;
        this.carrerascorridas = carrerascorridas;
        this.carrerasganadas = carrerasganadas;
        this.campeonatosjugados = campeonatosjugados;
        this.campeonatosganados = campeonatosganados;
        this.cantidadpolepositions = cantidadpolepositions;
        this.presupuesto = presupuesto;
    }

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
