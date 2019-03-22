package OOCD.JAVA.Formative_Assignment_3;

import java.util.Date;

public class Persoon {
    private String naam;
    private int leeftijd;
    private Date terugbrengdatum;

    public Persoon(String nm, int lft){
        naam = nm;
        leeftijd = lft;
    }

    public String toString(){
        return String.format("%1s; leeftijd %2s jaar", naam, leeftijd);
    }
}
