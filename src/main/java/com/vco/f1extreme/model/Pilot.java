package main.java.com.vco.f1extreme.model;

public class Pilot  {

    private String pilotName;
    private String nickname;
    private String country;
    private int racesRun;
    private int racesWon;
    private int championshipsPlayed;
    private int championshipsWon;
    private int numberPolePositions;
    private String budget;
    public static int overstep() //sobrepaso
    {
        //en este metodo se va a ver la cantidad de veces que un piloto tiene la oportunida de adelantarsea otro piloto
        //en el que se tiene en cuenta,(Creeria q la velocidad) la aceleracion de este piloto, la del piloto de adelante,
        // el circuito en el que estan
        return 0;//tiene que devolver la cantidad de oportunidades de sobre paso q tuvo
    }
    public static int defensseposition()
    {
        //parametros parecidos al anterior
        return 0;//va a devolver la eficacia (como un porcentaje) de veces que no permitio q se le adelanten
    }

    public static int classification()
    {
        //se tendra en cuenta los tiempos de las carreras anterior,
        // medidante el paso de la carrera va a aumentar el rendimiento para que pueda
        // obtener una mrjor posicion en el inicio de la carrera
        return 0;//aca va a devolver un puntaje
    }

    public static int tirecare()
    {
        //se va a tener en cuenta el neumatico elegido por el player,
        return 0;
    }
    public static int start()
    {

        return 0; //puntaje q servira para la primera vuelta del corredor
    }


    public Pilot(String pilotName, String nickname, String country, int racesRun, int racesWon, int championshipsPlayed, int championshipsWon, int numberPolePositions, String budget) {
        this.pilotName = pilotName;
        this.nickname = nickname;
        this.country = country;
        this.racesRun = racesRun;
        this.racesWon = racesWon;
        this.championshipsPlayed = championshipsPlayed;
        this.championshipsWon = championshipsWon;
        this.numberPolePositions = numberPolePositions;
        this.budget = budget;
    }

    public String getPilotName() {
        return pilotName;
    }

    public void setPilotName(String pilotName) {
        this.pilotName = pilotName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getRacesRun() {
        return racesRun;
    }

    public void setRacesRun(int racesRun) {
        this.racesRun = racesRun;
    }

    public int getRacesWon() {
        return racesWon;
    }

    public void setRacesWon(int racesWon) {
        this.racesWon = racesWon;
    }

    public int getChampionshipsPlayed() {
        return championshipsPlayed;
    }

    public void setChampionshipsPlayed(int championshipsPlayed) {
        this.championshipsPlayed = championshipsPlayed;
    }

    public int getChampionshipsWon() {
        return championshipsWon;
    }

    public void setChampionshipsWon(int championshipsWon) {
        this.championshipsWon = championshipsWon;
    }

    public int getNumberPolePositions() {
        return numberPolePositions;
    }

    public void setNumberPolePositions(int numberPolePositions) {
        this.numberPolePositions = numberPolePositions;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Name:\t" + pilotName + "\nNick:\t" + nickname + "\nCountry:\t" + country + "\nChampionships:\t" + championshipsWon;
    }
}
