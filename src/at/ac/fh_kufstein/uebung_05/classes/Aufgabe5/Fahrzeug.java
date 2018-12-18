package at.ac.fh_kufstein.uebung_05.classes.Aufgabe5;

public class Fahrzeug {

    private short reifen;
    public enum Color {
        SILVER,
        RED,
        BLACK,
        BLUE,
        WHITE;
    }
    private Color color;
    private short ps;
    private short tueren;
    private boolean gestartet;
    private short geschwindigkeit;
    public static int anzahl;

    public Fahrzeug(short reifen, Color color, short ps, short tueren, boolean gestartet, short geschwindigkeit){

        this.reifen = reifen;

        if (color != null){
            this.color = color;
        } else {
            this.color = Color.RED;
        }

        this.ps = ps;
        this.tueren = tueren;
        this.gestartet = gestartet;
        this.geschwindigkeit = geschwindigkeit;

    }

    public void starten(){
        gestartet = true;
    }

    public void stoppen(){
        gestartet = false;
    }

    public void beschleunigen(short geschwindigkeit){

        if (gestartet && (this.geschwindigkeit + geschwindigkeit) <= 250){
            this.geschwindigkeit += geschwindigkeit;
        }

    }

    public void bremsen(short geschwindigkeit){

        if (gestartet && (this.geschwindigkeit - geschwindigkeit) >= 0){
            this.geschwindigkeit -= geschwindigkeit;
        }

    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color color){
        this.color = color;
    }

    public short getReifen(){
        return reifen;
    }

    public void setReifen(short reifen){
        this.reifen = reifen;
    }

    public short getPs() {
        return ps;
    }

    public void setPs(short ps){
        this.ps = ps;
    }

    public short getTueren(){
        return tueren;
    }

    public void setTueren(short tueren){
        this.tueren = tueren;
    }

    public boolean isGestartet(){
        return gestartet;
    }

    public void setGestartet(boolean gestartet){
        this.gestartet = gestartet;
    }

    public short getGeschwindigkeit(){
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(short geschwindigkeit){
        this.geschwindigkeit = geschwindigkeit;
    }

    public int getAnzahl(){
        return anzahl;
    }

    public void setAnzahl(int anzahl){
        this.anzahl = anzahl;
    }

}
