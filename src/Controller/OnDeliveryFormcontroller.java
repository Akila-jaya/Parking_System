package Controller;

import View.tm.OnDeliveryTm;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.OnDelivery;

import java.io.IOException;
import java.net.URL;

import static Controller.FirstInterface.DeliveryList;

public class OnDeliveryFormcontroller {
    public TableView OnDeliveryTable;

    public AnchorPane OnDeliveryAnchor;
    public TableColumn ColVehicleNumber;
    public TableColumn ColVehicleType;
    public TableColumn DName;
    public TableColumn lefttime;



    public void BackOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../View/OnParking.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage)OnDeliveryAnchor.getScene().getWindow();
        window.setScene(new Scene(load));
    }
    public void loadData(){
        ObservableList<OnDeliveryTm> tmObservableList = FXCollections.observableArrayList();

        for (OnDelivery temp:DeliveryList
        ) {
            tmObservableList.add(new OnDeliveryTm(temp.getVehicleName(),temp.getVehicleType(),temp.getDriveerName(),temp.getLeftTime()));
        }

        OnDeliveryTable.setItems(tmObservableList);

    }
    public void initialize() {
        ColVehicleNumber.setCellValueFactory(new PropertyValueFactory<>("vehicleName"));
        ColVehicleType.setCellValueFactory(new PropertyValueFactory<>("vehicleType"));
        DName.setCellValueFactory(new PropertyValueFactory<>("driveerName"));
        lefttime.setCellValueFactory(new PropertyValueFactory<>("leftTime"));
    }

}
