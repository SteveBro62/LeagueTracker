package fi.jyu.ohj2.ipetresx.league.Models;

public enum Difficulty {
    Easy(10), Medium(30), Hard(60);

    private final int value;

    Difficulty(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
