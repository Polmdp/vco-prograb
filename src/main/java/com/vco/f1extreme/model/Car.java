package main.java.com.vco.f1extreme.model;

public class Car {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    private int number;{
        public int getNumber() {
            return number;
        }
    }
    private String brand;{
    public String getBrand() {
            return brand;
        }
    }
    private float weight;{
    public float getWeight() {
            return weight;
        }
}
    private float maxspeed{
        public float getMaxspeed() {
            return maxspeed;
        }
    }
    private float acceleration{
        public float getAcceleration() {
            return acceleration;
        }
    }
    private float fuelconsumption{
        public float getFuelconsumption() {
            return fuelconsumption;
        }
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