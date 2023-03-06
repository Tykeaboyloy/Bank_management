package projectfx.controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private Circle blue_circle;
    private double x;
    private double y;
    Parent root;
    Stage stage;
    Scene scene;

    public void switchToScene1(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../scenes/projectfx.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToScene2(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../scenes/scene2.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void handleMouseClick() {
        if (blue_circle.getFill().toString().equals("0x5ba5ebff")) {
            blue_circle.setFill(Color.valueOf("0xe48b7c"));
        } else {
            blue_circle.setFill(Color.valueOf("0x5ba5ebff"));
        }
    }

    public void up() {
        // System.out.println("UP button clicked");
        blue_circle.setCenterY(y--);
    }

    public void down() {
        // System.out.println("DOWN button clicked");
        blue_circle.setCenterY(y++);
    }

    public void right() {
        // System.out.println("RIGHT button clicked");
        blue_circle.setCenterX(x++);
    }

    public void left() {
        // System.out.println("LEFT button clicked");
        blue_circle.setCenterX(x--);
    }

}
