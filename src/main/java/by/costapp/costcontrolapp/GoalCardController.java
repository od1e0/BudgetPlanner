package by.costapp.costcontrolapp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class GoalCardController {

    @FXML
    private Label goalNameLabel;

    @FXML
    private ProgressBar progressBar;

    @FXML
    private HBox goalCard;

    public void setGoalData(String name, String description) {
        goalNameLabel.setText(name);
        progressBar.setProgress(0.0); // Изначальный прогресс
    }

    public void removeGoal() {
        if (goalCard != null && goalCard.getParent() != null) {
            ((javafx.scene.layout.Pane) goalCard.getParent()).getChildren().remove(goalCard);
        } else {
            System.out.println("goalCard или его родитель не инициализирован");
        }
    }
}
