package model;

public class Vehicle {
    private String vehicleNumber;
    private String vehicleType;
    private String maxiumWeight;
    private String NumberOfPassenger;

    public Vehicle(String vehicleNumber, String vehicleType, String maxiumWeight, String numberOfPassenger) {
        this.setVehicleNumber(vehicleNumber);
        this.setVehicleType(vehicleType);
        this.setMaxiumWeight(maxiumWeight);
        this.setNumberOfPassenger(numberOfPassenger);
    }

    public Vehicle() {
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

    public String getMaxiumWeight() {
        return maxiumWeight;
    }

    public void setMaxiumWeight(String maxiumWeight) {
        this.maxiumWeight = maxiumWeight;
    }

    public String getNumberOfPassenger() {
        return NumberOfPassenger;
    }

    public void setNumberOfPassenger(String numberOfPassenger) {
        NumberOfPassenger = numberOfPassenger;
    }
}
