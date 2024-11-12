package by.costapp.costcontrolapp;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import java.io.IOException;

public class MainController {

    @FXML
    private StackPane contentPane;

    @FXML
    private void showDashboard() {
        loadView("dashboard-view.fxml");
    }

    @FXML
    private void showIncome() {
        loadView("income-view.fxml");
    }

    @FXML
    private void showExpenses() {
        loadView("expenses-view.fxml");
    }

    @FXML
    private void showCategory() {
       loadView("category-view.fxml");
    }

    @FXML
    private void showGoal() {
        loadView("goal-view.fxml");
    }

    private void loadView(String fxmlFile) {
        try {
            Parent view = FXMLLoader.load(getClass().getResource(fxmlFile));
            contentPane.getChildren().setAll(view);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void logout() {
        contentPane.getScene().getWindow().hide();
    }
}
