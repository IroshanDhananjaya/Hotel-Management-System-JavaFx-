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
public class RoomDeleteFormController {
    public AnchorPane deleteRoomContext;

    public void backToOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/roomForm.fxml");
        Parent load = FXMLLoader.load(resource);
        deleteRoomContext.getChildren().clear();
        deleteRoomContext.getChildren().add(load);
    }
}
