package OOCD.JAVA.opdracht_7_1;

public class Gebouw {
    private int lengte;
    private int breedte;
    private int aantalVerdiepingen;
    public int laatsteRenovatie;

    public Gebouw(){
    }
    public Gebouw(int l, int b, int aV){
        lengte=l;
        breedte=b;
        aantalVerdiepingen=aV;
    }
    public int oppervlakte(){
        return lengte*breedte*aantalVerdiepingen;
    }
    public void renoveer(int jaarBuiten){
        laatsteRenovatie = jaarBuiten;
    }
    public int berekenHuur(){
        return oppervlakte()*75;
    }
    public String toString(){
        if(laatsteRenovatie != 0){
            return String.format("Dit gebouw is %1sm lang, %2sm breed, heeft %3s verdiepingen en is voor het " +
                    "laatst gerenoveerd in het jaar %4s", lengte, breedte, aantalVerdiepingen, laatsteRenovatie);
        }
        else{
            return String.format("Dit gebouw is %1sm lang, %2sm breed en heeft %3s verdiepingen.",
                    lengte, breedte, aantalVerdiepingen);
        }
     }
}
