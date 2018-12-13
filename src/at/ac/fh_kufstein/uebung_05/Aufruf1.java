package at.ac.fh_kufstein.uebung_05;

import at.ac.fh_kufstein.uebung_05.classes.Mensch;

public class Aufruf1
{

    public static void main(String[] args){

        Mensch person = new Mensch("Manuel", 26, "männlich");
        System.out.println(person.printAll());

    }

}
