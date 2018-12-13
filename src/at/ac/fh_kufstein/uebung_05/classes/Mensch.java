package at.ac.fh_kufstein.uebung_05.classes;

public class Mensch extends Saeugetier
{

    public Mensch(String name, int alter, String geschlecht){
        super(name, alter, geschlecht);
    }

    public String printAll(){
        return getName() + "#" + getAlter() + "#" + getGeschlecht();
    }

}
