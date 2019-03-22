package OOCD.JAVA.Summative_Assignment_7;
import java.util.ArrayList;


public class BedrijfsInventaris {
    private String bedrijfsnaam;
    private double budget;
    private ArrayList<Goed> alleGoederen;

    public BedrijfsInventaris(String nm, double bud){
        bedrijfsnaam = nm;
        budget=bud;
        alleGoederen = new ArrayList<Goed>();
    }
    public void schafAan(Goed g){
        boolean inAlleGoederen = false;
            for(Goed gd : alleGoederen){
                if(gd.equals(g))
            //if(alleGoederen.contains(g))
                    {
                inAlleGoederen = true;
            }
        }
        if(!inAlleGoederen && g.huidigeWaarde()<=budget){
            alleGoederen.add(g);
            budget -= g.huidigeWaarde();
        }
    }
    public String toString(){
        String completeToString = String.format("%1s met invetaris: \n", bedrijfsnaam);
        for(Goed g : alleGoederen){
            completeToString += (g.toString()+"\n");
        }
        return completeToString;
    }
}
