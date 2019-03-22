package OOCD.JAVA.Summative_Assignment_7;
import OOCD.JAVA.Summative_Assignment_9A.Utils;

import java.time.LocalDateTime;


public class Computer implements Goed{
    private double boughtPrice;
    private int buildDate;
    private String MacAdres;
    private String type;

    public Computer(String tp, String adr, double pr, int jr){
        boughtPrice = pr;
        buildDate = jr;
        MacAdres = adr;
        type = tp;
    }

    public double huidigeWaarde() {
        int soldDate = LocalDateTime.now().getYear();
        if(soldDate == buildDate){
            return boughtPrice;
        }
        else{
            return ((soldDate- buildDate)*0.6*boughtPrice);
        }
    }

    public String toString(){
        return String.format("Computer: %1s heeft een waarde van: %s", type, Utils.euroBedrag(huidigeWaarde()));
    }
    public boolean equals(Object obj){
        if(obj.getClass().equals(this.getClass())){
            return obj.toString().equals(this.toString());
        }
        else{
            return false;
        }
    }
}
