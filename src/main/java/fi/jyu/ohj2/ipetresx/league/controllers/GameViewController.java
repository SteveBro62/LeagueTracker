package fi.jyu.ohj2.ipetresx.league.controllers;

import fi.jyu.ohj2.ipetresx.league.Models.Game;
import fi.jyu.ohj2.ipetresx.league.Models.GameCollection;
import fi.jyu.ohj2.ipetresx.league.persistance.GameRepository;
import fi.jyu.ohj2.ipetresx.league.persistance.JsonGameRepository;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;

import java.net.URL;
import java.nio.file.Path;
import java.util.ResourceBundle;

public class GameViewController implements Initializable {
    @FXML
    private Button addButton, deleteButton, editButton;

    @FXML
    private TableView<Game> gameTable;

    private final GameCollection gameCollection = new GameCollection((GameRepository) new JsonGameRepository(Path.of("games.json")));

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initializeTable();

        deleteButton.setDisable(true);
        deleteButton.setOnAction(event -> {
            gameCollection.deleteGame(gameTable.getSelectionModel().getSelectedItem());
        });

        addButton.setOnAction(event -> {

        });

        editButton.setDisable(true);
        editButton.setOnAction(event -> {
            Game game = gameTable.getSelectionModel().getSelectedItem();
            openGameEditView(game);
        });
    }

    public void initializeTable(){
            gameTable.setItems(gameCollection.getGames());
            gameTable.setEditable(true);
            gameTable.getSelectionModel().getSelectedItem();
    }

    public void openGameEditView(Game game){

    }
}
