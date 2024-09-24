package by.costapp.costcontrolapp;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class HelloController implements Initializable {
    private double x, y;

    @FXML
    private Hyperlink link;

    @FXML
    private TabPane tabPane;

    @FXML
    private Button closeButton;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        redirectToLoginView();
    }


    private void redirectToLoginView() {
        link.setOnMouseClicked(ev -> {
            tabPane.getSelectionModel().select(0);
        });
    }

    @FXML
    private void dragged(MouseEvent ev) {
        Stage stage = (Stage) tabPane.getScene().getWindow();
        stage.setX(ev.getScreenX() - x);
        stage.setY(ev.getScreenY() - y);
    }

    @FXML
    private void pressed(MouseEvent ev) {
        x = ev.getSceneX();
        y = ev.getSceneY();
    }

    @FXML
    private void closeApp() {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void handleLogin(ActionEvent event) {
        boolean loginSuccessful = true; // Предположим, что логин успешен

        if (loginSuccessful) {
            openMainWindow();
            closeCurrentWindow();
        }
    }

    private void openMainWindow() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("main-view.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setMaximized(true);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void closeCurrentWindow() {
        Stage stage = (Stage) tabPane.getScene().getWindow();
        stage.close();
    }
}