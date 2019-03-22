package OOCD.JAVA.Summative_Assignment_7;

import java.time.LocalDateTime;

public class Auto extends Voertuig {
    private String kenteken;

    public Auto(String tp, double pr, int jr, String kt ){
        super(tp, pr, jr);
        kenteken=kt;
    }
    public double huidigeWaarde() {
        int soldDate = LocalDateTime.now().getYear();
        if(soldDate == buildDate){
            return boughtPrice;
        }
        else{
            return ((soldDate- buildDate)*0.7*boughtPrice);
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
