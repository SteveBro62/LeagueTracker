package fi.jyu.ohj2.ipetresx.league.controllers;

import fi.jyu.ohj2.ipetresx.league.App;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Tab;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private Tab gamesTab, statsTab;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        gamesTab.setContent(loadScene(Path.of("game-view.fxml")));
        statsTab.setContent(loadScene(Path.of("stats-view.fxml")));
    }

    private Node loadScene(Path path){
        FXMLLoader loader = new FXMLLoader(App.class.getResource(path.toString()));
        try {
            return loader.load();
        }
        catch (IOException e){
            IO.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
