package Summative_Assignment_6A;
import java.time.LocalDate;

public class Game {
    private String naam;
    private int releaseJaar;
    private double nieuwprijs;

    public Game(){
    }

    public Game(String nm, int rJ, double np) {
        naam = nm;
        releaseJaar = rJ;
        nieuwprijs = np;
    }

    public String getNaam() {
        return naam;
    }

    public double huidigeWaarde() {
        double prijs = nieuwprijs;
        for (int totaaljaren = 0; totaaljaren < (LocalDate.now().getYear() - releaseJaar); totaaljaren++) {
            prijs *= 0.7;
        }
        return prijs;
    }

    public boolean equals(Object o) {
        return o == this;
    }
    public String toString(){
        return String.format("%1s, uitgegeven in %2s; nieuwprijs: %3.2f nu voor: €%4.2f",naam, releaseJaar,nieuwprijs, huidigeWaarde());
    }
}
