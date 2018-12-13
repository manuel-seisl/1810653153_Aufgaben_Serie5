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

        System.out.println("Test");

    }

}
