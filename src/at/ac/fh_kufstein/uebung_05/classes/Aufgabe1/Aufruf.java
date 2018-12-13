package at.ac.fh_kufstein.uebung_05.classes.Aufgabe1;

import at.ac.fh_kufstein.uebung_05.classes.Aufgabe1.Mensch;

public class Aufruf
{

    public static void main(String[] args){

        Mensch person = new Mensch("Manuel", 26, "männlich");
        System.out.println(person.printAll());

    }

}