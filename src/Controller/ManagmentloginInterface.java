package Controller;

import com.jfoenix.controls.JFXPasswordField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class ManagmentloginInterface {
    public AnchorPane mngmentloginterface;
    public JFXPasswordField txtPassword;
    public Label lbError;

    public void cnslOnAction(ActionEvent actionEvent) {


    }

    public void lgnOnAction(ActionEvent actionEvent) throws IOException {
        if (txtPassword.getText().equals("111")) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../View/OnParking.fxml"));
            Parent parent = loader.load();
            OnParkingFormController controller = (OnParkingFormController) loader.getController();
            controller.loadData();

            mngmentloginterface.getScene().getWindow().hide();
            Scene scene = new Scene(parent);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

        }else {
            lbError.setText("Incorrect Password");
        }

    }
}
