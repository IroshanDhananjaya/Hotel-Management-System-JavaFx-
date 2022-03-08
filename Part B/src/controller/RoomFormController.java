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
public class RoomFormController {
    public AnchorPane roomSettingContext;

    public void addRoomOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/addRoomDetails Form.fxml");
        Parent load = FXMLLoader.load(resource);
        roomSettingContext.getChildren().clear();
        roomSettingContext.getChildren().add(load);
    }

    public void editDeleteRoomOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/roomDeleteForm.fxml");
        Parent load = FXMLLoader.load(resource);
        roomSettingContext.getChildren().clear();
        roomSettingContext.getChildren().add(load);
    }
}
