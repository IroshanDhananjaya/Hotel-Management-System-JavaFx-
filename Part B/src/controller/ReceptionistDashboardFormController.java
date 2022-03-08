package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

/**
 * @author : Dhananjaya
 * @since : 0.0.1
 **/
public class ReceptionistDashboardFormController {

    public AnchorPane receptionistMainDashboardContext;
    public AnchorPane receptionistDashboardContext;



   /* public void MailOnAction(ActionEvent actionEvent) {
    }

    public void custometMsgOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/customerForm.fxml");
        Parent load = FXMLLoader.load(resource);
        receptionistDashboardContext.getChildren().clear();
        receptionistDashboardContext.getChildren().add(load);
    }*/

    public void backToHomeOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) receptionistMainDashboardContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/mainWindowForm.fxml"))));
    }

    public void reserveRoomOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/roomReceptionistForm.fxml");
        Parent load = FXMLLoader.load(resource);
        receptionistDashboardContext.getChildren().clear();
        receptionistDashboardContext.getChildren().add(load);
    }

    public void CustomerOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/customerForm.fxml");
        Parent load = FXMLLoader.load(resource);
        receptionistDashboardContext.getChildren().clear();
        receptionistDashboardContext.getChildren().add(load);
    }
}
