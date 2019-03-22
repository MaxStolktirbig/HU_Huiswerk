package OOCD.JAVA.Summative_Assignment_2A;

public class Zwembad {
    private double Breedte;
    private double Lengte;
    private double Hoogte;

    public Zwembad(){
    }

    public Zwembad(double breedte, double lengte, double hoogte){
        this.Breedte = breedte;
        this.Lengte = lengte;
        this.Hoogte = hoogte;
    }


    public void setBreedte(double breedte){
        this.Breedte = breedte;
    }
    public void setLengte(double lengte){
        this.Lengte = lengte;
    }
    public void setDiepte(double hoogte){
        this.Hoogte = hoogte;
    }

    public double getBreedte(){
        return Breedte;
    }
    public  double getLengte(){
        return Lengte;
    }
    public double getDiepte() {
        return Hoogte;
    }
    public double inhoud(){
        double inhoud = Math.round(Hoogte*Breedte*Lengte);
        return inhoud;
    }
    public String toString(){
        return "Dit zwembad is "+Breedte+" meter breed, "+Lengte+" meter lang, en "+Hoogte+" meter diep";
    }
}
