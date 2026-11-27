package fi.jyu.ohj2.ipetresx.league.Models;

import javafx.beans.property.*;

import java.util.List;

public class Game {
    private final ObjectProperty<Champion> champion = new SimpleObjectProperty<>();
    private final ObjectProperty<Champion> matchup = new SimpleObjectProperty<>();

    private final IntegerProperty kills = new SimpleIntegerProperty();
    private final IntegerProperty deaths = new SimpleIntegerProperty();
    private final IntegerProperty assists = new SimpleIntegerProperty();

    private final ObjectProperty<Role> role = new SimpleObjectProperty<>();
    private final ObjectProperty<ItemCollection> items = new SimpleObjectProperty<>();

    private final BooleanProperty won = new SimpleBooleanProperty();
    private final DoubleProperty score = new SimpleDoubleProperty();

    // Constructor
    public Game(Champion champion, Champion matchup, int kills, int deaths, int assists, Role role, List<Item> items, boolean won) {
        setChampion(champion);
        setMatchup(matchup);
        setKills(kills);
        setDeaths(deaths);
        setAssists(assists);
        setRole(role);
        setItems(items);
        setWon(won);
        calculateScore();
    }

    public Game(){};

    // Getters
    public Champion getChampion() {
        return champion.get();
    }

    public Champion getMatchup() {
        return matchup.get();
    }

    public int getKills() {
        return kills.get();
    }

    public int getDeaths() {
        return deaths.get();
    }

    public int getAssists() {
        return assists.get();
    }

    public Role getRole() {
        return role.get();
    }

    public ItemCollection getItems() {
        return items.get();
    }

    public boolean isWon() {
        return won.get();
    }

    public double getScore() {
        return score.get();
    }

    // Setters
    public void setChampion(Champion champion) {
        this.champion.setValue(champion);
    }

    public void setMatchup(Champion matchup) {
        this.matchup.setValue(matchup);
    }

    public void setKills(int kills) {
        this.kills.setValue(kills);
    }

    public void setDeaths(int deaths) {
        this.deaths.setValue(deaths);
    }

    public void setAssists(int assists) {
        this.assists.setValue(assists);
    }

    public void setRole(Role role) {
        this.role.setValue(role);
    }

    public void setItems(List<Item> items) {
        this.items.getValue().setItems(items);
    }

    public void setWon(boolean won) {
        this.won.setValue(won);
    }

    public void setScore(double score) {
        this.score.setValue(score);
    }

    public  ObjectProperty<Champion> getChampionProperty(){
        return champion;
    }

    public  ObjectProperty<Champion> getMatchupProperty(){
        return matchup;
    }

    public  IntegerProperty getKillsProperty(){
        return kills;
    }

    public  IntegerProperty getDeathsProperty(){
        return deaths;
    }

    public  IntegerProperty getAssistsProperty(){
        return assists;
    }

    public  BooleanProperty getWonProperty(){
        return won;
    }

    public  ObjectProperty<ItemCollection> getItemsProperty(){
        return items;
    }

    public  ObjectProperty<Role> getRoleProperty(){
        return role;
    }

    public DoubleProperty getScoreProperty(){
        return score;
    }

    public void calculateScore(){

    }
}