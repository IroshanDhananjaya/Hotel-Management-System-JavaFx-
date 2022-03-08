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
public class RoomReceptionistFormController {
    public AnchorPane reserveContext;

    public void backToOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) reserveContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/receptionistDashboardForm.fxml"))));
    }

    public void roomAvailabilityOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/checkRoomAvailabilityForm.fxml");
        Parent load = FXMLLoader.load(resource);
        reserveContext.getChildren().clear();
        reserveContext.getChildren().add(load);
    }

    public void addGuestOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/addGuestForm.fxml");
        Parent load = FXMLLoader.load(resource);
        reserveContext.getChildren().clear();
        reserveContext.getChildren().add(load);
    }

    public void selectMealplanOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/mealPlanForm.fxml");
        Parent load = FXMLLoader.load(resource);
        reserveContext.getChildren().clear();
        reserveContext.getChildren().add(load);
    }

    public void BookingDetailsOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/bookingForm.fxml");
        Parent load = FXMLLoader.load(resource);
        reserveContext.getChildren().clear();
        reserveContext.getChildren().add(load);
    }
}
