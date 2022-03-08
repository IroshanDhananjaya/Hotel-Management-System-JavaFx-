package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

/**
 * @author : Dhananjaya
 * @since : 0.0.1
 **/
public class checkRoomAvailabilityFormController {
    public AnchorPane roomAvailabilityContext;

    public void bactToOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/roomReceptionistForm.fxml");
        Parent load = FXMLLoader.load(resource);
        roomAvailabilityContext.getChildren().clear();
        roomAvailabilityContext.getChildren().add(load);
    }
}
