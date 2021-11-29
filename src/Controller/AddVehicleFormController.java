package Controller;

import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Vehicle;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;


public class AddVehicleFormController {
    public String vehicleType;

    public AnchorPane AddVehicle;
    public ComboBox<String> VehicleTypeCombo;

    static ArrayList<String> LanguageBucket=new ArrayList<>();
   static ArrayList<Vehicle> VehicleList=new ArrayList<>();


    static{
        LanguageBucket.add("Bus");
        LanguageBucket.add("Van");
        LanguageBucket.add("Cargo Lorry");
    }

    public JFXTextField VehicleNumber;
    public JFXTextField Weight;
    public JFXTextField passengers;

    public void initialize() {

      /*  ObservableList<String> obList = FXCollections.observableArrayList();
        obList.addAll(LanguageBucket);

        VehicleTypeCombo.setItems(obList);*/




        VehicleTypeCombo.getItems().addAll("Bus", "Van", "Cargo Lorry");
        VehicleTypeCombo.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            vehicleType=newValue.toString();

        });
    }

    public void BackOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../View/OnParking.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage)AddVehicle.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void AddvehicleOnAction(ActionEvent actionEvent) {
        Vehicle vehicle=new Vehicle(VehicleNumber.getText(),vehicleType,Weight.getText(),passengers.getText());
        VehicleList.add(vehicle);

    }
}
