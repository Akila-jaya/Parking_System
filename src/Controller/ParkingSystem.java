package Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class ParkingSystem {


    public ComboBox<String> InParkingCombo;

    static ArrayList<String> LanguageBucket=new ArrayList<>();


    static{
        LanguageBucket.add("In Parking");
        LanguageBucket.add("On Parking");
    }

    public AnchorPane prkingSystem;

    public void initialize() {

        ObservableList<String> obList = FXCollections.observableArrayList();
        obList.addAll(LanguageBucket);

        InParkingCombo.setItems(obList);


    }


    public void LogOutOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../View/FirstInterface.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage)prkingSystem.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void AddVehicleOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../View/AddVehicle.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage)prkingSystem.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void AddDriverOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../View/AddDriver.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage)prkingSystem.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
