package main.java.com.vco.f1extreme.model;

public class Car {
    private String color;
    private int number;
    private String brand;
    private float weight;
    private float maxspeed;
    private float acceleration;
    private float fuelconsumption;

    public Car(String color, int number, String brand, float weight, float maxspeed, float acceleration, float fuelconsumption) {
        this.color = color;
        this.number = number;
        this.brand = brand;
        this.weight = weight;
        this.maxspeed = maxspeed;
        this.acceleration = acceleration;
        this.fuelconsumption = fuelconsumption;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(float maxspeed) {
        this.maxspeed = maxspeed;
    }

    public float getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(float acceleration) {
        this.acceleration = acceleration;
    }

    public float getFuelconsumption() {
        return fuelconsumption;
    }

    public void setFuelconsumption(float fuelconsumption) {
        this.fuelconsumption = fuelconsumption;
    }

    //metodos............
    public void stop(){

    }
    public void start(){

    }
    //valores entre 1 y 100, a mayor valor, mejor desempeño
    public int perfcurves(){
        //Determina cómo se desempeña el auto en aceleraciones rápidas
        //y/o rectas prolongadas para sobrepasar a otros autos
    }
    public int perfoverruns(){
        //Determina cómo es el comportamiento del auto en las curvas
    }
    public int reliability(){
        //Determina qué tan confiable es el auto: A menor valor de este
        //atributo, mayores probabilidades de que vaya a abandonar
        //durante la carrera por desperfectos mecánicos
    }
}