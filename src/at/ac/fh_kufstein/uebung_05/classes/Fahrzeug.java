package at.ac.fh_kufstein.uebung_05.classes;

public class Fahrzeug {

    private short reifen;
    private String farbe;
    private short ps;
    private short tueren;
    private boolean gestartet;
    private short geschwindigkeit;
    private int anzahl;

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

}
