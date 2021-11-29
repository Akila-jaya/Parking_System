package Controller;

import View.tm.InParkingTm;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.InParking;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

import static Controller.FirstInterface.inParkingTableList;

public class OnParkingFormController {


    public ComboBox<String> OnParkingCombo;
    public TableView Onparking;
    public TableColumn vehicleNumber;
    public TableColumn vehicleType;
    public TableColumn driverName;
    public TableColumn leftTime;

    public void initialize() {

        OnParkingCombo.getItems().addAll("On Parking","On Delivery");
        OnParkingCombo.getSelectionModel().selectFirst();
        OnParkingCombo.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) ->{
            if(newValue.equals("On Delivery")){
                FXMLLoader loader = new FXMLLoader(getClass().getResource("../View/OnDelivery.fxml"));
                Parent parent = null;
                try {
                    parent = loader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                OnDeliveryFormcontroller controller = (OnDeliveryFormcontroller) loader.getController();
                controller.loadData();
                OnParkingAnchor.getScene().getWindow().hide();
                Scene scene = new Scene(parent);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();
            }

        } );

        vehicleNumber.setCellValueFactory(new PropertyValueFactory<>("vehicleNumber"));
        vehicleType.setCellValueFactory(new PropertyValueFactory<>("vehicleType"));
        driverName.setCellValueFactory(new PropertyValueFactory<>("slot"));
        leftTime.setCellValueFactory(new PropertyValueFactory<>("time"));


    }



    public AnchorPane OnParkingAnchor;


    public void addVehicleOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../View/AddVehicle.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage)OnParkingAnchor.getScene().getWindow();
        window.setScene(new Scene(load));

    }

    public void AddDriveronAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../View/AddDriver.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage)OnParkingAnchor.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void AddVehicleOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../View/AddVehicle.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage)OnParkingAnchor.getScene().getWindow();
        window.setScene(new Scene(load));

    }

    public void TableOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../View/Tables.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage)OnParkingAnchor.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void BackOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../View/FirstInterface.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage)OnParkingAnchor.getScene().getWindow();
        window.setScene(new Scene(load));
    }
    public void loadData(){
        ObservableList<InParkingTm> tmObservableList = FXCollections.observableArrayList();

        for (InParking temp:inParkingTableList
        ) {
            tmObservableList.add(new InParkingTm(temp.getVehicleNumber(),temp.getVehicleType(),temp.getSlot(),temp.getTime()));
        }

        Onparking.setItems(tmObservableList);

    }

}
