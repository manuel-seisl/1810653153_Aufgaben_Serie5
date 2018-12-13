package at.ac.fh_kufstein.uebung_05;

import at.ac.fh_kufstein.uebung_05.classes.Auto;
import at.ac.fh_kufstein.uebung_05.classes.Fahrzeug;
import at.ac.fh_kufstein.uebung_05.classes.Wasserfahrzeug;

import java.util.ArrayList;
import java.util.List;

public class Aufruf
{

    public static void main(String[] args){

        List<Fahrzeug> fahrzeugList = new ArrayList<>();

        Auto bmw = new Auto((short)4, "silber", (short)220, (short)5, false, (short)0, false, (short)4);
        Auto audi = new Auto((short)4, "schwarz", (short)180, (short)5, false, (short)0, false, (short)8);

        Wasserfahrzeug titanic = new Wasserfahrzeug((short)0, "blau", (short)51000, (short)0, false, (short)0, 10.54, (short)3, 100.000);
        titanic.setGeschwindigkeit((short)-14536);

        fahrzeugList.add(bmw);
        fahrzeugList.add(audi);
        fahrzeugList.add(titanic);

        for (Fahrzeug item : fahrzeugList){
            System.out.println(item.toString());
        }

    }

}