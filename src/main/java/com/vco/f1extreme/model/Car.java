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
    public static int stop(){
        //este metodo va a ser para ver como reaccionan los frenos(puntaje del 1 al 100).
        return 0;//no devuelve nada por ahora
    }
    public static int start(){
        //este metodo va ser para ver como acelerar el auto al arrancar la carrera(1 al 100).
        return 0;//no devuelve nada por ahora
    }
    //valores entre 1 y 100, a mayor valor, mejor desempeño
    public static int perfcurves(){
        //tener en cuenta del auto :aceleracion,peso,frenos .
        //tener en cuenta del piloto:...
        //tener en cuenta del circuito: tipo de curva?.
        //tener en cuenta el tipo de neumatico del momento.
        ////Determina cómo es el comportamiento del auto en las curvas
        return 0;//no devuelve nada por ahora
    }
    public static int perfoverruns(){
        //tener en cuenta del auto :aceleracion,peso,velmax .
        //tener en cuenta del piloto:nada ya que depende solo del auto.
        //tener en cuenta del circuito: longitud de zona de sobrepaso.
        //tener en cuenta el tipo de neumatico del momento.
        //Determina cómo se desempeña el auto en aceleraciones rápidas
        //y/o rectas prolongadas para sobrepasar a otros autos.
        return 0;//no devuelve nada por ahora
    }
    public static int reliability(){
        //Determina qué tan confiable es el auto: A menor valor de este
        //atributo, mayores probabilidades de que vaya a abandonar
        //durante la carrera por desperfectos mecánicos
        return 0;//no devuelve nada por ahora
    }
}