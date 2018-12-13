package at.ac.fh_kufstein.uebung_05.classes;

public class Auto
{

    private boolean klimaanlage;
    private short airbags;

    public void klimaanlageAn(){
        if (klimaanlage){
            System.out.println("Klimaanlage läuft bereits!");
        } else {
            klimaanlage = true;
        }
    }

    public void klimaanlageAus(){
        if (klimaanlage){
            klimaanlage = false;
        } else {
            System.out.println("Klimaanlage ist bereits aus!");
        }
    }

}
