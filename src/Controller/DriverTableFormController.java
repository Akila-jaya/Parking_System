package Controller;

import View.tm.DrivertableTm;
import View.tm.VehicleTableTm;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Driver;
import model.Vehicle;

import java.io.IOException;
import java.net.URL;

import static Controller.AddDriverFormController.DriverList;


public class DriverTableFormController {


    public TableColumn colName;
    public TableColumn colNic;
    public TableColumn colDlicene;
    public TableColumn address;
    public TableColumn colContact;
    public TableColumn colDelete;
    public TableView DriverTbl;
    public AnchorPane DriverTable;

    public void BackOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../View/Tables.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage)DriverTable.getScene().getWindow();
        window.setScene(new Scene(load));


    }
    public void initialize(){
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colNic.setCellValueFactory(new PropertyValueFactory<>("nIC"));
        colDlicene.setCellValueFactory(new PropertyValueFactory<>("drivingLicense"));
        colContact.setCellValueFactory(new PropertyValueFactory<>("contact"));
        colDelete.setCellValueFactory(new PropertyValueFactory<>("btn"));
        address.setCellValueFactory(new PropertyValueFactory<>("address"));
    }

    public void LoadVehicle(){

        ObservableList<DrivertableTm> tmObservableList= FXCollections.observableArrayList();
        for (Driver temp:DriverList
        ) {
            Button btn=new Button("Delete");
            tmObservableList.add(new DrivertableTm(temp.getDriverName(),temp.getnIC(),temp.getlNumber(),temp.getAddress(),temp.getContact(),btn));
            btn.setOnAction((e)->{
                DriverList.remove(temp);
                LoadVehicle();
            });


        }
        DriverTbl.setItems(tmObservableList);


    }
}
