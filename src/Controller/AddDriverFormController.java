package Controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Driver;
import model.Vehicle;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class AddDriverFormController {

    static ArrayList<Driver> DriverList=new ArrayList<>();



    public AnchorPane AddDriverAnchorpane;

    public JFXTextField DriverName;
    public JFXTextField NIC;
    public JFXTextField DrivingNo;
    public JFXTextField Address;
    public JFXTextField ContactNo;

    public void BackOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../View/OnParking.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage)AddDriverAnchorpane.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void AddDriveronAction(ActionEvent actionEvent) {
        Driver driver=new Driver(DriverName.getText(),NIC.getText(),DrivingNo.getText(),Address.getText(),ContactNo.getText());
        DriverList.add(driver);
    }
}
