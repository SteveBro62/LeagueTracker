package Models;

import java.util.List;

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

    // Constructor
    public Games(Champions champion, Champions matchup, int kills, int deaths, int assists, String role, List<Items> items, boolean won, int gameDuration) {

        this.champion = champion;
        this.matchup = matchup;
        this.kills = kills;
        this.deaths = deaths;
        this.assists = assists;
        this.role = role;
        this.items = items;
        this.won = won;
        this.gameDuration = gameDuration;
        this.score = 0.0;
    }

    // Getters
    public Champions getChampion() {
        return champion;
    }

    public Champions getMatchup() {
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

    public String getRole() {
        return role;
    }

    public List<Items> getItems() {
        return items;
    }

    public boolean isWon() {
        return won;
    }

    public int getGameDuration() {
        return gameDuration;
    }

    public double getScore() {
        return score;
    }

    // Setters
    public void setChampion(Champions champion) {
        this.champion = champion;
    }

    public void setMatchup(Champions matchup) {
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

    public void setRole(String role) {
        this.role = role;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

    public void setWon(boolean won) {
        this.won = won;
    }

    public void setGameDuration(int gameDuration) {
        this.gameDuration = gameDuration;
    }

    public void setScore(double score) {
        this.score = score;
    }
}