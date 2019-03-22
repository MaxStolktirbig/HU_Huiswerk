package OOCD.JAVA.Summative_Assignment_7;

import java.time.LocalDateTime;

public class Fiets extends Voertuig {
    private int framenummer;
    public Fiets(String tp, double pr, int jr, int fnr ){
        super(tp, pr, jr);
        framenummer=fnr;
    }
    public double huidigeWaarde() {
        int soldDate = LocalDateTime.now().getYear();
        if(soldDate == buildDate){
            return boughtPrice;
        }
        else{
            return ((soldDate- buildDate)*0.9*boughtPrice);
        }
    }
    public boolean equals(Object obj){
        if(obj.getClass().equals(this.getClass())){
            return obj.toString().equals(super.toString());
        }
        else{
            return false;
        }
    }
}
