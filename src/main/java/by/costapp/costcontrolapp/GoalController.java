package by.costapp.costcontrolapp;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import java.io.IOException;

public class GoalController {

    @FXML
    private TextField goalNameField;

    @FXML
    private TextField goalDescriptionField;

    @FXML
    private TilePane goalsContainer;

    @FXML
    public void createGoal() {
        String name = goalNameField.getText();
        String description = goalDescriptionField.getText();

        if (name.isEmpty() || description.isEmpty()) {
            // Можно добавить сообщение об ошибке
            return;
        }

        try {
            // Загрузим шаблон карточки
            FXMLLoader loader = new FXMLLoader(getClass().getResource("goalCard-view.fxml"));
            HBox goalCard = loader.load();

            // Получаем контроллер для карточки цели
            GoalCardController cardController = loader.getController();
            cardController.setGoalData(name, description);

            // Добавляем карточку в контейнер
            goalsContainer.getChildren().add(goalCard);

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Очищаем поля после создания
        goalNameField.clear();
        goalDescriptionField.clear();
    }
}