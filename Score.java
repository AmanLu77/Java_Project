package pacman;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import pacman.Obstacle.BarObstacle;

public class Score {

    public Text score;
    public Text lifes;

    Score(Group root) {
        this.score = new Text(BarObstacle.THICKNESS * 2, BarObstacle.THICKNESS * 27, "SCORE: 0");
        this.lifes = new Text(BarObstacle.THICKNESS * 42, BarObstacle.THICKNESS * 27,"LIFES: 3");
        score.setFill(Color.WHITE);
        score.setFont(Font.font("Arial", FontWeight.BLACK, 30));

        lifes.setFill(Color.RED);
        lifes.setFont(Font.font("Arial", FontWeight.BLACK, 30));

        root.getChildren().add(score);
        root.getChildren().add(lifes);
    }
}