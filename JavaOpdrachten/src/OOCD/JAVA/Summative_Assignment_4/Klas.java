package OOCD.JAVA.Summative_Assignment_4;
import java.util.ArrayList;

public class Klas {
    private String klasCode;
    private ArrayList<Leerling> deLeerlingen;
    public Klas(String kC){
        klasCode = kC;
        deLeerlingen = new ArrayList<Leerling>();
    }
    public void voegLeerlingToe(Leerling l){
        deLeerlingen.add(l);
    }
    public void wijzigCijfer(String nm, double newCijfer){
        for(Leerling leerling : this.deLeerlingen) {
            if(leerling.getNaam().equals(nm)){
                leerling.setCijfer(newCijfer);
            }
        }
    }
    public ArrayList<Leerling> getLeerlingen(){
        return deLeerlingen;
    }
    public int aantalLeerlingen(){
        return deLeerlingen.size();
    }
    public String toString(){
        String completeToString = String.format("In de klas %1s zitten de volgende leerlingen: \n", klasCode) ;

        for(Leerling leerling: this.deLeerlingen){
            completeToString += leerling+"\n";
        }
        return completeToString;
    }

}
