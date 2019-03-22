package OOCD.JAVA.Formative_Assignment_3;

public class Huis {
    private String adres;
    private int bouwjaar;
    private Persoon huisbaas;

    public Huis(String adr, int bwjr){
        adres = adr;
        bouwjaar = bwjr;
    }

    public void setHuisbaas(Persoon hb){
        huisbaas = hb;
    }
    public Persoon getHuisbaas(){
        return huisbaas;
    }

    public String toString() {
        return String.format("Huis %1s is gebouwd in %2s \nen heeft huisbaas %3s", adres, bouwjaar, huisbaas);
    }
}
