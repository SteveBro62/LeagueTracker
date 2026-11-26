package fi.jyu.ohj2.ipetresx.league.Models;

import java.util.*;

import java.util.List;

public class Game {
    private Champion champion;
    private Champion matchup;

    private int kills;
    private int deaths;
    private int assists;

    private Role role;
    private final ItemCollection items = new ItemCollection();

    private boolean won;
    private double score;

    // Constructor
    public Game(Champion champion, Champion matchup, int kills, int deaths, int assists, Role role, List<Item> items, boolean won) {

        this.champion = champion;
        this.matchup = matchup;
        this.kills = kills;
        this.deaths = deaths;
        this.assists = assists;
        this.role = role;
        this.items.setItems(items);
        this.won = won;
        this.score = 0.0;
    }

    public Game(){};

    // Getters
    public Champion getChampion() {
        return champion;
    }

    public Champion getMatchup() {
        return matchup;
    }

    public int getKills() {
        return kills;
    }

    public int getDeaths() {
        return deaths;
    }

    public int getAssists() {
        return assists;
    }

    public Role getRole() {
        return role;
    }

    public ItemCollection getItems() {
        return items;
    }

    public boolean isWon() {
        return won;
    }

    public double getScore() {
        return score;
    }

    // Setters
    public void setChampion(Champion champion) {
        this.champion = champion;
    }

    public void setMatchup(Champion matchup) {
        this.matchup = matchup;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setItems(List<Item> items) {
        this.items.setItems(items);
    }

    public void setWon(boolean won) {
        this.won = won;
    }

    public void setScore(double score) {
        this.score = score;
    }
}