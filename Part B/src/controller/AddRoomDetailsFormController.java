package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import model.Room;
import view.tm.RoomTM;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

/**
 * @author : Dhananjaya
 * @since : 0.0.1
 **/
public class AddRoomDetailsFormController {
    public AnchorPane addRoomContext;
    public JFXTextField txtRoomNumber;
    public JFXTextField txtRoomType;
    public JFXTextField txtAcType;
    public JFXTextField txtPerNight;
    public JFXTextField txtTelephone;
    public TableView tblRoomDetails;
    public TableColumn colRoomNum;
    public TableColumn colRoomType;
    public TableColumn colAcType;
    public TableColumn colperNight;
    public TableColumn colTelephone;

    static ArrayList<Room>roomArrayList=new ArrayList<>();

    public void initialize(){
        colRoomNum.setCellValueFactory(new PropertyValueFactory<>("roomNumber"));
        colRoomType.setCellValueFactory(new PropertyValueFactory<>("roomType"));
        colAcType.setCellValueFactory(new PropertyValueFactory<>("acType"));
        colperNight.setCellValueFactory(new PropertyValueFactory<>("perNight"));
        colTelephone.setCellValueFactory(new PropertyValueFactory<>("telephone"));
    }

    public void submitOnAction(ActionEvent actionEvent) {
        Room room=new Room(txtRoomNumber.getText(),txtRoomType.getText(),txtAcType.getText(),txtPerNight.getText(),txtTelephone.getText());
        if(roomArrayList.add(room)){
            loadAllRoomDetails();
            new Alert(Alert.AlertType.CONFIRMATION,"Saved", ButtonType.CLOSE).show();
        }else{
            new Alert(Alert.AlertType.WARNING,"TryAgain", ButtonType.CLOSE).show();
        }
    }

    public void cancelOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/roomForm.fxml");
        Parent load = FXMLLoader.load(resource);
        addRoomContext.getChildren().clear();
        addRoomContext.getChildren().add(load);
    }
    private void loadAllRoomDetails(){
        ObservableList<RoomTM>tmObservableList= FXCollections.observableArrayList();
        for (Room temp:roomArrayList) {
            tmObservableList.add(new RoomTM(temp.getRoomNumber(),temp.getRoomType(),temp.getAcType(),temp.getPerNight(),temp.getTelephone()));
        }
        tblRoomDetails.setItems(tmObservableList);

    }

    public void backToOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/roomForm.fxml");
        Parent load = FXMLLoader.load(resource);
        addRoomContext.getChildren().clear();
        addRoomContext.getChildren().add(load);
    }
}
