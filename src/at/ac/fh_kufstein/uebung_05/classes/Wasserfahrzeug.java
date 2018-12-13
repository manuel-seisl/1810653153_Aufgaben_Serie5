package at.ac.fh_kufstein.uebung_05.classes;

import java.util.concurrent.TimeUnit;

public class Wasserfahrzeug extends Fahrzeug
{

    private double tiefgang;
    private short schrauben;
    private double ladung;

    public Wasserfahrzeug(short reifen, String farbe, short ps, short tueren, boolean gestartet, short geschwindigkeit, double tiefgang, short schrauben, double ladung){
        super(reifen, farbe, ps, tueren, false, (short)0);
        this.tiefgang = tiefgang;
        this.schrauben = schrauben;
        this.ladung = ladung;
        anzahl += 1;
    }

    public void entladen(){

        ladung = 0;

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    public double getTiefgang(){
        return tiefgang;
    }

    public void setTiefgang(double tiefgang){
        this.tiefgang = tiefgang;
    }

    public short getSchrauben(){
        return schrauben;
    }

    public void setSchrauben(short schrauben){
        this.schrauben = schrauben;
    }

    public double getLadung(){
        return ladung;
    }

    public void setLadung(double ladung){
        this.ladung = ladung;
    }

}
