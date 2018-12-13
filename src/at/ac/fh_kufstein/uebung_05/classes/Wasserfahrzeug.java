package at.ac.fh_kufstein.uebung_05.classes;

import java.util.concurrent.TimeUnit;

public class Wasserfahrzeug
{

    private double tiefgang;
    private short schrauben;
    private double ladung;

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
