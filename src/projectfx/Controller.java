package projectfx;

import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Controller {

    @FXML
    private Circle blue_circle;
    private double x;
    private double y;

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
