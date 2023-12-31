package pacman.Obstacle;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class BarObstacle extends Rectangle {

    public static double THICKNESS = 25;

    public BarObstacle(double x, double y, String orientation, double length) {
        this.setX(x);
        this.setY(y);

        if (orientation.equals("horizontal")) {
            this.setHeight(BarObstacle.THICKNESS);
            this.setWidth(length * BarObstacle.THICKNESS);
        } else {
            this.setHeight(length * BarObstacle.THICKNESS);
            this.setWidth(BarObstacle.THICKNESS);
        }

        this.setStroke(Color.DODGERBLUE);
        this.setStrokeWidth(4);
    }
}