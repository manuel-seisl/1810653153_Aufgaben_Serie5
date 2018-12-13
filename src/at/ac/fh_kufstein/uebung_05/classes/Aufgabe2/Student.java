package at.ac.fh_kufstein.uebung_05.classes.Aufgabe2;

public class Student extends Mensch
{

    private String martrikelnummer;
    private String studiengang;

    public Student(String vorname, String nachname, int alter, String martrikelnummer, String studiengang)
    {
        super(vorname, nachname, alter);
        this.martrikelnummer = martrikelnummer;
        this.studiengang = studiengang;
    }

    public void status(){
        System.out.println("Student: " + this.getVorname() + " - " + this.getNachname() + " - " + this.getAlter() + " - " + this.getMartrikelnummer() + " - " + this.getStudiengang());
    }

    public String getMartrikelnummer() {
        return martrikelnummer;
    }

    public void setMartrikelnummer(String martrikelnummer){
        this.martrikelnummer = martrikelnummer;
    }

    public String getStudiengang(){
        return studiengang;
    }

    public void setStudiengang(String studiengang){
        this.studiengang = studiengang;
    }

}
