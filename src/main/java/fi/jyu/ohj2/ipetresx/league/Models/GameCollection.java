package fi.jyu.ohj2.ipetresx.league.Models;

import fi.jyu.ohj2.ipetresx.league.persistance.GameRepository;
import fi.jyu.ohj2.ipetresx.league.persistance.RepositoryException;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

public class GameCollection {
    // add extractor to Game List !!!
    private final ObservableList<Game> games = FXCollections.observableArrayList();
    private final GameRepository repo;

    // Constructor
    public GameCollection(GameRepository repo) {
        this.repo = repo;
        try{
            games.addAll(repo.load());
        }
        catch (RepositoryException e){
            IO.println(e.getMessage());
        }
        games.addListener((ListChangeListener<? super Game>)  change -> {
            save();
        });
    }

    // Getter
    public ObservableList<Game> getGames() {
        return games;
    }

    // Add a game
    public void addGame(Game game) {
        games.add(game);
    }

    // Delete a game
    public void deleteGame(Game game) {
        games.remove(game);
    }

    public void save(){
        try {
            repo.save(games);
        }
        catch (RepositoryException e){
            IO.println(e.getMessage());
        }
    }
}