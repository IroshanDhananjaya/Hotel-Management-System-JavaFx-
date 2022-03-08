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
public class MealPlanFormController {
    public AnchorPane mealPlanContext;

    public void backToOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/roomReceptionistForm.fxml");
        Parent load = FXMLLoader.load(resource);
        mealPlanContext.getChildren().clear();
        mealPlanContext.getChildren().add(load);
    }
}
