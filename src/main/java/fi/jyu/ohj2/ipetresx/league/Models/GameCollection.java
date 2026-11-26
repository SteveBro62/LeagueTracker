package fi.jyu.ohj2.ipetresx.league.Models;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class GameCollection {
    private ObservableList<Games> games;

    // Constructor
    public GameCollection() {
        this.games = FXCollections.observableArrayList();
    }

    // Getter
    public ObservableList<Games> getGames() {
        return games;
    }

    // Add a game
    public void addGame(Games game) {
        games.addAll(game);
    }

    // Delete a game
    public void deleteGame(Games game) {
        games.remove(game);
    }
}