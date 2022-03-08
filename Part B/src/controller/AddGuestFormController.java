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
public class AddGuestFormController {
    public AnchorPane addGuestContext;

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/roomReceptionistForm.fxml");
        Parent load = FXMLLoader.load(resource);
        addGuestContext.getChildren().clear();
        addGuestContext.getChildren().add(load);
    }
}
