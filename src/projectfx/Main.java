package projectfx;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

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
    public void start(Stage primaryStage) throws SQLException {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("scenes/main.fxml"));
            primaryStage.setTitle("tk's projectFX");
            Scene scene = new Scene(root, 600, 400, Color.SKYBLUE);

            scene.getStylesheets().add(getClass().getResource("style/application.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws SQLException {
        ResultSet result = Database.get("select * from users");
        while (result.next())
            System.out.println(result.getString(1) + " is " + result.getInt(2));

        Application.launch(args);
    }
}