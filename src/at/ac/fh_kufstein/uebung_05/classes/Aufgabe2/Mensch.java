package at.ac.fh_kufstein.uebung_05.classes.Aufgabe2;

public class Mensch
{

    private String vorname;
    private String nachname;
    private int alter;

    public Mensch(String vorname, String nachname, int alter){
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
    }

    public void status(){
        System.out.println("Mensch: " + this.getVorname() + " - " + this.getNachname() + " - " + this.getAlter());
    }

    public String getVorname(){
        return vorname;
    }

    public void setVorname(String vorname){
        this.vorname = vorname;
    }

    public String getNachname(){
        return nachname;
    }

    public void setNachname(String nachname){
        this.nachname = nachname;
    }

    public int getAlter(){
        return alter;
    }

    public void setAlter(int alter){
        this.alter = alter;
    }

}
