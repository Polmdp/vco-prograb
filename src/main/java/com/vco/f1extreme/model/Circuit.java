package main.java.com.vco.f1extreme.model;

import java.util.Random;

public class Circuit {
    public enum typecurve{
        1,//open
        2;//close
    }

    private String name;
    private String country;
    private int trackLength;
    private int numberOfLaps;
    private String infographic;
    private String lapRecord;
    private int overtakeZones;
    private List<typecurve> curves;

    private Weather weather;


    public Circuit(String name, String country, int trackLength, int numberOfLaps, String infographic, String lapRecord, int overtakeZones, int curves, Weather weather) {
        this.name = name;
        this.country = country;
        this.trackLength = trackLength;
        this.numberOfLaps = numberOfLaps;
        this.infographic = infographic;
        this.lapRecord = lapRecord;
        this.overtakeZones = overtakeZones;
        this.curves = curves;
        Weather[] weathers = Weather.values();
        Random random = new Random();
        this.weather = weathers[random.nextInt(weathers.length)];

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getTrackLength() {
        return trackLength;
    }

    public void setTrackLength(int trackLength) {
        this.trackLength = trackLength;
    }

    public int getNumberOfLaps() {
        return numberOfLaps;
    }

    public void setNumberOfLaps(int numberOfLaps) {
        this.numberOfLaps = numberOfLaps;
    }

    public String getInfographic() {
        return infographic;
    }

    public void setInfographic(String infographic) {
        this.infographic = infographic;
    }

    public String getLapRecord() {
        return lapRecord;
    }

    public void setLapRecord(String lapRecord) {
        this.lapRecord = lapRecord;
    }

    public int getOvertakeZones() {
        return overtakeZones;
    }

    public void setOvertakeZones(int overtakeZones) {
        this.overtakeZones = overtakeZones;
    }

    public int getCurves() {
        return curves;
    }

    public void setCurves(int curves) {
        this.curves = curves;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }
}
