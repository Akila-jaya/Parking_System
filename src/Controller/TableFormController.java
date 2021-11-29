package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Driver;

import java.io.IOException;
import java.net.URL;

public class TableFormController {
    public AnchorPane Tables;

    public void VehicleTableOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../View/tm/VehicleTable.fxml"));
        Parent parent = loader.load();
        VehicleTableFormController controller = (VehicleTableFormController) loader.getController();
        controller.LoadVehicle();
        //controller.setAccountName("MR " + txtUsername.getText().toUpperCase());
        Tables.getScene().getWindow().hide();
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

    }

    public void DriverTableOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../View/tm/DriverTable.fxml"));
        Parent parent = loader.load();
        DriverTableFormController controller = (DriverTableFormController) loader.getController();
        controller.LoadVehicle();
        //controller.setAccountName("MR " + txtUsername.getText().toUpperCase());
        Tables.getScene().getWindow().hide();
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void BackOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../View/OnParking.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage)Tables.getScene().getWindow();
        window.setScene(new Scene(load));

    }
}
