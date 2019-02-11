package Summative_Assignment_2B;


public class Voetbalclub {
    private String Clubname;
    private int aantalGewonnen = 0;
    private int aantalGelijk = 0;
    private int aantalVerloren = 0;

    public Voetbalclub(String name){
        this.Clubname = name;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;

        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    public String toString(){
        return String.format("%1$3s %2$3s %3$2s %4$2s %5$2s %6$5s", Clubname, Integer.toString(aantalGespeeld()),
                Integer.toString(aantalGewonnen), Integer.toString(aantalGelijk), Integer.toString(aantalVerloren),
                Integer.toString(aantalPunten()));
    }

    private int aantalGespeeld(){
       return  aantalGelijk+aantalGewonnen+aantalVerloren;
    }
    private int aantalPunten(){
        return (aantalGewonnen*3)+aantalGelijk;
    }

}
