package Controller;

import View.tm.InParkingTm;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Driver;
import model.InParking;
import model.OnDelivery;
import model.Vehicle;

import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import static Controller.AddDriverFormController.DriverList;
import static Controller.AddVehicleFormController.VehicleList;



public class FirstInterface {
    public AnchorPane FirstInterface;


    public ComboBox cmdLanguaes;

    static ArrayList<String> LanguageBucket = new ArrayList<>();
    static ArrayList<OnDelivery> DeliveryList = new ArrayList<>();




    public JFXTextField txtdate;
    public JFXTextField time;
    public ComboBox driver;
    public JFXTextField txtType;
    public String VehicleNumber;
    static ArrayList<InParking> inParkingTableList = new ArrayList();
    static String[][] parkingSlot = {{"Van", null}, {"Van", null}, {"Van", null}, {"Van", null}, {"CargoLorry", null}, {"CargoLorry", null}, {"CargoLorry", null}, {"CargoLorry", null}, {"CargoLorry", null}, {"CargoLorry", null}, {"CargoLorry", null}, {"Van", null}, {"Van", null}, {"Bus", null}};
    public Label labSlot;
    public JFXButton btnParkVehicle;
    public JFXButton btnOnDelivery;


    public static Scene getScene() {
        return null;
    }


    public void initialize() {


        ObservableList <String> tmVehicleObservableList = FXCollections.observableArrayList();
        for (Vehicle temp : VehicleList) {
            tmVehicleObservableList.add(temp.getVehicleNumber());
        }
        cmdLanguaes.setItems(tmVehicleObservableList);

        cmdLanguaes.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            String type = "None";
            for (Vehicle temp1 : VehicleList
            ) {
                if (newValue.equals(temp1.getVehicleNumber())) {
                    type = temp1.getVehicleType();
                }

            }
            txtType.setText(type);
            VehicleNumber = newValue.toString();

        });
        ObservableList <String> tmDriverObservableList = FXCollections.observableArrayList();
        for (Driver temp2 : DriverList
        ) {
            tmDriverObservableList.add(temp2.getDriverName());
        }
        driver.setItems(tmDriverObservableList);

        driver.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
        slot();
        });


        Thread clock = new Thread() {
            public void run() {
                for (; ; ) {
                    DateFormat dateFormat = new SimpleDateFormat("hh:mm a");
                    Calendar cal = Calendar.getInstance();

                    int second = cal.get(Calendar.SECOND);
                    int minute = cal.get(Calendar.MINUTE);
                    int hour = cal.get(Calendar.HOUR_OF_DAY);
                    //System.out.println(hour + ":" + (minute) + ":" + second);
                    String state = null;
                    if (hour >= 12) {
                        state = "PM";
                    } else {
                        state = "AM";
                    }
                    time.setText("    " + String.format("%02d", hour) + ":" + String.format("%02d", minute) + ":" + String.format("%02d", second) + " " + state);

                    try {
                        sleep(1000);
                    } catch (InterruptedException ex) {
                        //...
                    }
                }
            }
        };
        clock.start();

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        txtdate.setText(dateFormat.format(date));
    }

    //public ComboBox driver;
    public ComboBox<String> Driver;


    public void VehicleType(ActionEvent actionEvent) {

    }

    public void parkOnAction(ActionEvent actionEvent) {
        DeliveryList.removeIf(temp -> temp.getVehicleName().equals(cmdLanguaes.getSelectionModel().getSelectedItem().toString()));
        parkingSlot[Integer.parseInt(labSlot.getText()) - 1][1] = cmdLanguaes.getSelectionModel().getSelectedItem().toString();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy   HH:mm a");
        Date date = new Date();

        InParking park = new InParking(cmdLanguaes.getSelectionModel().getSelectedItem().toString(), txtType.getText(), labSlot.getText(), formatter.format(date));
        inParkingTableList.add(park);


    }

    public void managmentLogIn(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../View/ManagmentloginInterface.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) FirstInterface.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void slot() {
        for (int i = 0; i < parkingSlot.length; i++) {
            if (cmdLanguaes.getSelectionModel().getSelectedItem().toString().equals(parkingSlot[i][1])) {
                btnParkVehicle.setDisable(true);
                btnOnDelivery.setDisable(false);
                labSlot.setText(String.format("%02d", i + 1));
                return;

            } else {
                btnOnDelivery.setDisable(true);
                btnParkVehicle.setDisable(false);
                switch (txtType.getText()) {
                    case "Bus":
                        labSlot.setText("14");

                        break;
                    case "Van":
                        for (int j = 0; j < parkingSlot.length; j++) {
                            if (parkingSlot[j][0].equals("Van") && parkingSlot[j][1] == null) {
                                //parkingSlot[j][1]=cmbVehicle.getSelectionModel().getSelectedItem().toString();
                                labSlot.setText(String.format("%02d", j + 1));
                                break;
                            }
                        }
                        break;
                    case "CargoLorry":
                        for (int k = 0; k < parkingSlot.length; k++) {
                            if (parkingSlot[k][0].equals("Cargo Lorry") && parkingSlot[k][1] == null) {
                                //parkingSlot[k][1]=cmbVehicle.getSelectionModel().getSelectedItem().toString();
                                labSlot.setText(String.format("%02d", k + 1));
                                break;
                            }
                        }
                        break;
                }
            }
        }
    }

    public void DeliveryOnAction(ActionEvent actionEvent) {
        inParkingTableList.removeIf(temp -> temp.getVehicleNumber().equals(cmdLanguaes.getSelectionModel().getSelectedItem().toString()));
        parkingSlot[Integer.parseInt(labSlot.getText()) - 1][1] = null;

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy   HH:mm a");
        Date date = new Date();

        OnDelivery delivery = new OnDelivery(cmdLanguaes.getSelectionModel().getSelectedItem().toString(), txtType.getText(), driver.getSelectionModel().getSelectedItem().toString(), formatter.format(date));
        DeliveryList.add(delivery);

    }
}









