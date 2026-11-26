package fi.jyu.ohj2.ipetresx.league.Models;

import java.util.*;

import java.util.List;

public class Item {
    private final String name;
    private final int gold;
    private final List<String> goodAgainst = new ArrayList<>();

    // Constructor
    public Item(String name, int gold, List<String> goodAgainst) {
        this.name = name;
        this.gold = gold;
        if(!goodAgainst.isEmpty()) {
            this.goodAgainst.addAll(goodAgainst);
        }
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
}