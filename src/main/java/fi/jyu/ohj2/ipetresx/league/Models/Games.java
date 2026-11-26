package fi.jyu.ohj2.ipetresx.league.Models;

import java.util.*;

public class Games {
    private Champions champion;
    private Champions matchup;
    private int kills;
    private int deaths;
    private int assists;
    private String role;
    private List<Items> items;
    private boolean won;
    private int gameDuration;
    private double score;

    public Games(Champions champion, Champions matchup,
                 int kills, int deaths, int assists,
                 String role, List<Items> items,
                 boolean won, int gameDuration) {

        this.champion = champion;
        this.matchup = matchup;
        this.kills = kills;
        this.deaths = deaths;
        this.assists = assists;
        this.role = role;
        this.items = items;
        this.won = won;
        this.gameDuration = gameDuration;
    }
}