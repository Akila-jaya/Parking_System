package Controller;

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
import model.Vehicle;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

import static Controller.AddVehicleFormController.VehicleList;

public class VehicleTableFormController {
    public AnchorPane VehicleTable;
    public TableColumn colVehicle;
    public TableColumn colVehicleType;
    public TableColumn colMaximumWeight;
    public TableColumn colNumberOfPassenger;
    public TableColumn colDelete;
    public TableView VehicleTbl;

    public void BackOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../View/Tables.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage)VehicleTable.getScene().getWindow();
        window.setScene(new Scene(load));
    }
    static ArrayList<Vehicle> studentList = new ArrayList();

        public void LoadVehicle(){

            ObservableList<VehicleTableTm> tmObservableList=FXCollections.observableArrayList();
            for (Vehicle temp:VehicleList
                 ) {
                Button btn=new Button("Delete");
                tmObservableList.add(new VehicleTableTm(temp.getVehicleNumber(),temp.getVehicleType(),temp.getMaxiumWeight(),temp.getNumberOfPassenger(),btn));
                btn.setOnAction((e)->{
                    VehicleList.remove(temp);
                    LoadVehicle();
                });


            }
               VehicleTbl.setItems(tmObservableList);


        }
            public void initialize(){
                colVehicle.setCellValueFactory(new PropertyValueFactory<>("vehicleNumber"));
                colVehicleType.setCellValueFactory(new PropertyValueFactory<>("vehicleType"));
                colMaximumWeight.setCellValueFactory(new PropertyValueFactory<>("maxweight"));
                colNumberOfPassenger.setCellValueFactory(new PropertyValueFactory<>("noOfPassenger"));
                colDelete.setCellValueFactory(new PropertyValueFactory<>("btn"));



            }


}
