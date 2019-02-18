package Summative_Assignment_4;

public class Leerling {
    private String naam;
    private double cijfer = 0.0;
    public Leerling(String nm){
        naam = nm;
    }
    public String getNaam(){
        return naam;
    }
    public double getCijfer(){
        return cijfer;
    }
    public void setCijfer(double c){
        cijfer = c;
    }
    public String toString(){
        return String.format("%1s heeft cijfer: %2s", naam, cijfer);
    }

}
