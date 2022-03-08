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
public class MainWindowFormController {
    public AnchorPane mainPageContext;

    public void adminLogOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) mainPageContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/adminLoginForm.fxml"))));
    }

    public void receptionistLogOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) mainPageContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/receptionistLoginForm.fxml"))));
    }
}
