package View.tm;

import javafx.scene.control.Button;

public class VehicleTableTm {
    private String vehicleNumber;
    private String vehicleType;
    private String maxweight;
    private String noOfPassenger;
    private Button btn;

    public VehicleTableTm() {
    }

    public VehicleTableTm(String vehicleNumber, String vehicleType, String maxweight, String noOfPassenger, Button btn) {
        this.setVehicleNumber(vehicleNumber);
        this.setVehicleType(vehicleType);
        this.setMaxweight(maxweight);
        this.setNoOfPassenger(noOfPassenger);
        this.setBtn(btn);
    }


    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getMaxweight() {
        return maxweight;
    }

    public void setMaxweight(String maxweight) {
        this.maxweight = maxweight;
    }

    public String getNoOfPassenger() {
        return noOfPassenger;
    }

    public void setNoOfPassenger(String noOfPassenger) {
        this.noOfPassenger = noOfPassenger;
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }
}
