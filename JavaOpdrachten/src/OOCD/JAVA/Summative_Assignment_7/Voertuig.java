package OOCD.JAVA.Summative_Assignment_7;

import OOCD.JAVA.Summative_Assignment_9A.Utils;

public abstract class Voertuig implements Goed{
    private String type;
    protected double boughtPrice;
    protected int buildDate;

    public Voertuig(){
        this("",0,0);
    }
    public Voertuig(String tp, double pr, int jr){
        type = tp;
        boughtPrice = pr;
        buildDate = jr;
    }
    public boolean equals(Object obj){
        if(obj.getClass().equals(this.getClass())){
            return obj.toString().equals(this.toString());
        }
        else{
            return false;
        }
    }

    public String toString(){
        return String.format("Voertuig: %1s met bouwjaar %2s heeft een waarde van: %s", type, buildDate, Utils.euroBedrag(huidigeWaarde()));
    }

}
