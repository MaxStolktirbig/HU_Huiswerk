package OOCD.JAVA.misc_files;

public class Product {
    private String naam;
    private String code;
    private double prijs;
    private double btw;

    public Product(String nm, String cd, double pr){
        this.naam = nm;
        this.code = cd;
        this.prijs = pr;
    }
    public Product(String nm, String cd){
        this.naam = nm;
        this.code = cd;
    }
    public void setBTW(double bt){
        this.btw = bt;
    }
    public void setPrijs(double pr){
        this.prijs = pr;
    }
    public double getBTW(){
        return btw;
    }
    public double getPrijs(){
        return prijs;
    }
    public void verhoogPrijsMet(double extra){
        prijs += extra;
    }
    public double berekenBtwBedrag(){
        return prijs*(btw/100);
    }
    public String toString(){
        return ""+naam+" heeft code " + code+ " en kost "+prijs+ "; de btw is "+btw;
    }
}


