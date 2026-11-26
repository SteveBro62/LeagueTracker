package fi.jyu.ohj2.ipetresx.league.Models;

import java.util.*;

public class Items {
    private String name;
    private int gold;
    private List<String> goodAgainst;

    public Items(String name, int gold, List<String> goodAgainst) {
        this.name = name;
        this.gold = gold;
        this.goodAgainst = goodAgainst;
    }
}