package fi.jyu.ohj2.ipetresx.league;

import java.awt.*;
import java.io.IOException;
import java.util.Objects;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("main.fxml"));
        Scene scene = new Scene(loader.load());

        stage.setScene(scene);
        stage.setTitle("LeagueTracker");
        Image icon = new Image(
                Objects.requireNonNull(getClass().getResourceAsStream("luca.png"))
        );
        stage.getIcons().add(icon);
        stage.setMinHeight(600);
        stage.setMinWidth(800);
        stage.show();
    }

}
