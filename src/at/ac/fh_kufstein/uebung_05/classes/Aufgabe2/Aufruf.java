package at.ac.fh_kufstein.uebung_05.classes.Aufgabe2;

public class Aufruf
{

    public static void main(String[] args){

        Mensch person = new Mensch("Manuel", "Seisl", 26);
        person.status();

        Student student = new Student("Manuel", "Seisl", 26, "1810653153", "Web Business & Technology");
        student.status();

    }

}
