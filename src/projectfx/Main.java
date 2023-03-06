package projectfx;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
    @FXML
    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("scenes/projectfx.fxml"));
            primaryStage.setTitle("tk's projectFX");
            Scene scene = new Scene(root, 600, 400, Color.SKYBLUE);
            // Image icon = new Image("Tykeaboyloy.png");
            // primaryStage.getIcons().add(icon);
            scene.getStylesheets().add(getClass().getResource("style/application.css").toExternalForm());
            primaryStage.setScene(scene);
            // Text name = new Text();
            // name.setX(30);
            // name.setY(50);
            // name.setFont(Font.font("CascadiaCode", 30));
            // name.setText("Tykeaboyloy ProjectFX");
            // primaryStage.setFullScreen(true);
            // primaryStage.setFullScreenExitHint("Press 'q' to exit fullscreen mode");
            primaryStage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}