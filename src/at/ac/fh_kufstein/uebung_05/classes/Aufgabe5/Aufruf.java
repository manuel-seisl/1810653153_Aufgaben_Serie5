package at.ac.fh_kufstein.uebung_05.classes.Aufgabe5;

import at.ac.fh_kufstein.uebung_05.classes.Aufgabe5.Fahrzeug;

import java.awt.*;

public class Aufruf
{

    public static void main(String[] args)
    {

        Auto a = new Auto((short)4, Auto.Color.SILVER, (short)200, (short)5, false, (short)0, false, (short)8);
        Auto b = new Auto((short)4, Auto.Color.BLACK, (short)180, (short)5, false, (short)0, false, (short)8);

        System.out.println(a.toString());
        System.out.println(b.toString());

    }

}
