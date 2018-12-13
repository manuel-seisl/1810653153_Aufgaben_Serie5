package at.ac.fh_kufstein.uebung_05.classes;

import at.ac.fh_kufstein.uebung_05.classes.Fahrzeug;

public class Auto extends Fahrzeug implements Comparable<Auto>
{

    private boolean klimaanlage;
    private short airbags;

    public Auto(short reifen, String farbe, short ps, short tueren, boolean gestartet, short geschwindigkeit, boolean klimaanlage, short airbags){
        super(reifen, farbe, ps, tueren, false, (short)0);
        this.klimaanlage = false;
        this.airbags = airbags;
        anzahl += 1;
    }

    public void klimaanlageAn(){
        if (klimaanlage){
            System.out.println("Klimaanlage läuft bereits!");
        } else {
            klimaanlage = true;
        }
    }

    public void klimaanlageAus(){
        if (klimaanlage){
            klimaanlage = false;
        } else {
            System.out.println("Klimaanlage ist bereits aus!");
        }
    }

    public boolean isKlimaanlage(){
        return klimaanlage;
    }

    public void setKlimaanlage(boolean klimaanlage){
        this.klimaanlage = klimaanlage;
    }

    public short getAirbags(){
        return airbags;
    }

    public void setAirbags(short airbags){
        this.airbags = airbags;
    }

    @Override
    public String toString(){
        return "Mein Auto hat " + this.getPs() +  " PS und fährt mit " + this.getGeschwindigkeit() + " km/h";
    }

    @Override
    public int compareTo(Auto o){
        return Short.compare(o.getPs(), this.getPs());
    }

}
