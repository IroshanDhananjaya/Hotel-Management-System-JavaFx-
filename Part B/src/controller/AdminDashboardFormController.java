package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

/**
 * @author : Dhananjaya
 * @since : 0.0.1
 **/
public class AdminDashboardFormController {
    public AnchorPane adminDashboardContext;
    public AnchorPane adminMainDashBoardContext;

    public void roomManageOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/roomForm.fxml");
        Parent load = FXMLLoader.load(resource);
        adminDashboardContext.getChildren().clear();
        adminDashboardContext.getChildren().add(load);
    }

    public void mealPackgeOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/mealPackageForm.fxml");
        Parent load = FXMLLoader.load(resource);
        adminDashboardContext.getChildren().clear();
        adminDashboardContext.getChildren().add(load);
    }

    public void backToMainPageOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) adminMainDashBoardContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/mainWindowForm.fxml"))));
    }

    public void adminDashboardOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) adminMainDashBoardContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/adminDashboardForm.fxml"))));
    }

    public void incomeReportOnAction(ActionEvent actionEvent) {
    }
}
