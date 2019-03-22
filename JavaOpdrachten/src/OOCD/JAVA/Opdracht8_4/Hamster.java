package OOCD.JAVA.Opdracht8_4;

public class Hamster extends AbstractDier implements Huisdier{
    private String naam;

    public Hamster(String nm){
        super(4);
        naam = nm;
    }

    public void setNaam(String nm) {
        naam = nm;
    }
    public String getNaam(){
        return naam;
    }
    public String spelen(){
        return "Hell yeah";
    }
    public String speak() {
        return "Piep";
    }
    public String toString() {

        return String.format("Hamster %1s zegt %2s", naam, speak());
    }
}
