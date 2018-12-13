package at.ac.fh_kufstein.uebung_05;

import at.ac.fh_kufstein.uebung_05.classes.Auto;
import at.ac.fh_kufstein.uebung_05.classes.Fahrzeug;
import at.ac.fh_kufstein.uebung_05.classes.Wasserfahrzeug;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Aufruf
{

    public static void main(String[] args){

        List<Auto> fahrzeugList = new ArrayList<>();

        fahrzeugList.add(new Auto((short)4, "silber", (short)100, (short)5, false, (short)0, false, (short)4));
        fahrzeugList.add(new Auto((short)4, "schwarz", (short)180, (short)5, false, (short)0, false, (short)8));
        fahrzeugList.add(new Auto((short)4, "blau", (short)150, (short)5, false, (short)0, false, (short)4));
        fahrzeugList.add(new Auto((short)4, "rot", (short)220, (short)5, false, (short)0, false, (short)4));
        fahrzeugList.add(new Auto((short)4, "grün", (short)300, (short)5, false, (short)0, false, (short)4));

        Collections.sort(fahrzeugList);

        for ( Auto a : fahrzeugList ){
            System.out.println(a.toString());
        };

    }

}