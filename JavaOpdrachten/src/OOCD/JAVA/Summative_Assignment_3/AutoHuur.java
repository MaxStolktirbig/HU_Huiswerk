package OOCD.JAVA.Summative_Assignment_3;

public class AutoHuur {
    private Klant huurder;
    private Auto gehuurdeAuto;
    private int aantalDagen = 0;
    public AutoHuur(){
    }
    public void setAantalDagen(int aD){
        aantalDagen = aD;
    }
    public void setHuurder(Klant k){
        huurder = k;
    }
    public Klant getHuurder(){
        return huurder;
    }

    public void setGehuurdeAuto(Auto gA){
        gehuurdeAuto = gA;
    }
    public Auto getGehuurdeAuto(){
        return gehuurdeAuto;
    }

    public double totaalPrijs(){
        return (gehuurdeAuto.getPrijsPerDag()*aantalDagen);
    }
    public String toString() {
        String completeToString = "";
        double totaalPrijs = 0.0;
        if(gehuurdeAuto == null){
            completeToString += "er is geen auto bekend\n";
        }
        else{
            completeToString += "autotype: "+gehuurdeAuto+"\n";
            totaalPrijs = totaalPrijs();
        }
        if(huurder == null ){
            completeToString += "er is geen huurder bekend\n";
        }
        else{
            completeToString += "op naam van: "+huurder+"\n";
        }
        completeToString += "aantal dagen: "+aantalDagen+" en dat kost "+totaalPrijs;
        return completeToString;
    }
}
