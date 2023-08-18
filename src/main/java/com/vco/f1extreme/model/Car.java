package main.java.com.vco.f1extreme.model;

import main.java.com.vco.f1extreme.utils.NormalizeVariable;

import javax.swing.*;
import java.net.URL;

public class Car {
    private String color;
    private int number;
    private String brand;
    private float weight;
    private float maxspeed;
    private float acceleration;
    private float fuelconsumption;
    private static Circuit circuit;

    public ImageIcon getImageIcon() {
        return imageIcon;
    }

    public void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    private ImageIcon imageIcon;

    public Car(String color, int number, String brand, float weight, float maxspeed, float acceleration, float fuelconsumption) {
        this.color = color;
        this.number = number;
        this.brand = brand;
        this.weight = weight;
        this.maxspeed = maxspeed;
        this.acceleration = acceleration;
        this.fuelconsumption = fuelconsumption;
        URL imageUrl = getClass().getClassLoader().getResource("main/resources/img/avatar/" + brand + ".png");
        if (imageUrl != null) {
            this.imageIcon = new ImageIcon(imageUrl);
        } else {
            System.err.println("Couldn't find file: " + brand + ".png");
        }

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

    public float getMaxSpeed() {
        return maxspeed;
    }

    public void setMaxSpeed(float maxspeed) {
        this.maxspeed = maxspeed;
    }

    public float getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(float acceleration) {
        this.acceleration = acceleration;
    }

    public float getFuelConsumption() {
        return fuelconsumption;
    }

    public void setFuelConsumption(float fuelconsumption) {
        this.fuelconsumption = fuelconsumption;
    }

    //metodos............
    public static int stop(){
        //este metodo va a ser para ver como reaccionan los frenos(puntaje del 1 al 5).
        int brakeScore = 50;
        switch (circuit.getWeather()) {
            case SOLEADO:
                brakeScore += 10; // Buenas condiciones
                break;
            case NUBLADO:
                // Condiciones normales
                break;
            case LLUVIOSO:
                brakeScore -= 20; // Condiciones dificiles
                break;
            case NIEBLA:
                brakeScore -= 10; // Visibilidad reducida
        }
        brakeScore = Math.max(1, Math.min(brakeScore, 100));

        return brakeScore;

    }
    public static int start(){
        //este metodo va ser para ver como acelerar el auto al arrancar la carrera(1 al 5).
        return 0;//no devuelve nada por ahora
    }
    //valores entre 1 y 100, a mayor valor, mejor desempeño

//    public static float simulateAcceleration(float acceleration,float maxspeed,float weight){
//        float accelerationsim=0;
//        accelerationsim= (float) ((((acceleration*1000/36*2.8)*3)+(maxspeed*2)+weight)/35);
//
//        return accelerationsim;
//    }

    public int perfcurves(){
        int perfcurves;
        int stopMultiplier;

        switch (circuit.getCurves()) {
            case 1: //open
                stopMultiplier = 2; //  multiplicador x 2
                break;
            case 2: //close
                stopMultiplier = 4; //  multiplicador x 4
                break;
            default:
                throw new IllegalArgumentException("Curve not valid...");
        }

        return Math.round(calculateWeightEffect(this.weight) * this.acceleration * stop() * stopMultiplier) ;
        //
        //tener en cuenta del auto :aceleracion,peso,frenos .
        //tener en cuenta del circuito: tipo de curva?.
        //tener en cuenta el tipo de neumatico del momento.
        ////Determina cómo es el comportamiento del auto en las curvas
        //no devuelve nada por ahora

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
    public static float FuelConsumptionPerLap(float weight, int trackLength,int fuelconsumption,int maxspeed){
        float compustionperlap=0;
        compustionperlap=(((trackLength*fuelconsumption)/100)*4)+(weight*3)+(maxspeed*2);
        //add some variation for the type of tire
        return compustionperlap/250;
    }

    public int calculateWeightEffect(float weight) {
        float minWeight = 800.0f;
        float maxWeight = 908.0f;
        //set the values for weight in range
        float rangeWeight = Math.min(Math.max(weight, minWeight), maxWeight);
        int  resulteffect= Math.round((rangeWeight-maxWeight-1)/(minWeight-maxWeight)*99) ;
        return resulteffect;

    }

}