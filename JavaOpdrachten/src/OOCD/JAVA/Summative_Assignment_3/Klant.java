package OOCD.JAVA.Summative_Assignment_3;

public class Klant {
    private String naam;
    private double kortingsPercentage;
    public Klant(String nm){
        naam = nm;
    }
    public void setKorting(double kP){
        kortingsPercentage = kP;
    }
    public double getKorting(){
        return kortingsPercentage;
    }

   public String toString() {
       return naam +" (korting: "+ kortingsPercentage+")";
   }
}
