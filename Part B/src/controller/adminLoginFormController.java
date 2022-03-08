package controller;

import com.jfoenix.controls.JFXTextField;
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
public class adminLoginFormController {
    public AnchorPane adminLoginContext;
    public JFXTextField txtAdminName;
    public JFXTextField txtAdminPassword;

    public void backToMainPageOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) adminLoginContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/mainWindowForm.fxml"))));
    }

    public void openAdminDashBoardOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) adminLoginContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/adminDashboardForm.fxml"))));
    }
}
