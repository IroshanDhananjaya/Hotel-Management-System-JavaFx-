package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * @author : Dhananjaya
 * @since : 0.0.1
 **/
public class customerFormController {
    public AnchorPane customerContext;

    public void backToOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) customerContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/receptionistDashboardForm.fxml"))));
    }
}
