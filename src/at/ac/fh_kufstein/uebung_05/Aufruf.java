package at.ac.fh_kufstein.uebung_05;

import at.ac.fh_kufstein.uebung_05.classes.Auto;
import at.ac.fh_kufstein.uebung_05.classes.Fahrzeug;
import at.ac.fh_kufstein.uebung_05.classes.Wasserfahrzeug;
import com.sun.codemodel.internal.JOp;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.*;

public class Aufruf
{

    public static void main(String[] args){

        /*List<Auto> fahrzeugList = new ArrayList<>();

        fahrzeugList.add(new Auto((short)4, "silber", (short)100, (short)5, false, (short)0, false, (short)4));
        fahrzeugList.add(new Auto((short)4, "schwarz", (short)180, (short)5, false, (short)0, false, (short)8));
        fahrzeugList.add(new Auto((short)4, "blau", (short)150, (short)5, false, (short)0, false, (short)4));
        fahrzeugList.add(new Auto((short)4, "rot", (short)220, (short)5, false, (short)0, false, (short)4));
        fahrzeugList.add(new Auto((short)4, "grün", (short)300, (short)5, false, (short)0, false, (short)4));

        Collections.sort(fahrzeugList);

        for ( Auto a : fahrzeugList ){
            System.out.println(a.toString());
        };*/

        // --- Aufgabe 4 ---

        String var1 = JOptionPane.showInputDialog("Bitte 1.Eingabe tätigen:");
        String var2 = JOptionPane.showInputDialog("Bitte 2.Eingabe tätigen:");
        String var3 = JOptionPane.showInputDialog("Bitte 3.Eingabe tätigen:");

        List<String> inputs = new ArrayList<>();
        List<String> list = new ArrayList<>();

        inputs.add(var1);
        inputs.add(var2);
        inputs.add(var3);

        for (String item : inputs){

            if (list.contains(item)){
                System.out.println("Es wurde ein gleicher Text eingegeben!");
                return;
            }

            list.add(item);

        }

        System.out.println("Es wurde kein gleicher Text eingegeben!");

    }

}