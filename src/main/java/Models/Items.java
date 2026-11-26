package Models;

import java.util.List;

public class Items {
    private String name;
    private int gold;
    private List<String> goodAgainst;

    // Constructor
    public Items(String name, int gold, List<String> goodAgainst) {
        this.name = name;
        this.gold = gold;


        this.goodAgainst = goodAgainst;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getGold() {
        return gold;
    }

    public List<String> getGoodAgainst() {
        return goodAgainst;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void setGoodAgainst(List<String> goodAgainst) {
        this.goodAgainst = goodAgainst;
    }
}