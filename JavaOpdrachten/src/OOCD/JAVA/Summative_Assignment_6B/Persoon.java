package OOCD.JAVA.Summative_Assignment_6B;

import java.util.ArrayList;

public class Persoon {
    private ArrayList<Game> alleGames;
    private String naam;
    private double budget;

    public Persoon(String nm, double bu){
        naam = nm;
        budget = bu;
        alleGames = new ArrayList<Game>();
    }

    public boolean koop(Game g){
        boolean gameOwned = false;
        for(Game a : alleGames){
            if(a.getNaam() == g.getNaam()){
                gameOwned = true;
            }
        }
        if(!gameOwned && g.huidigeWaarde()<=budget){
            alleGames.add(g);
            budget -= g.huidigeWaarde();
            return true;
        }
        else{
            return false;
        }
    }
    public boolean verkoop(Game g, Persoon koper){
        boolean gameOwned = false;
        for(Game a : alleGames){
            if(a==g){
                gameOwned = true;
            }
        }
        if(gameOwned && koper.koop(g)){
            alleGames.remove(g);
            return true;
        }
        else{
            return false;
        }
    }

    public Game zoekGameOpNaam(String gamenaam){
        for (Game games : alleGames){
            if(games.getNaam() == gamenaam){
                return games;
            }
        }
        return null;
    }
    public String toString(){
        String completeToString = String.format("%1s heeft een budget van %2.2f en bezit de volgende games: \n",naam,budget);
        for(Game a : alleGames){
            completeToString += "       "+a.toString()+"\n";
        }
        return completeToString;
    }

}
