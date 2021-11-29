package model;

public class OnDelivery {
    private String vehicleName;
    private String vehicleType;
    private String driveerName;
    private String leftTime;

    public OnDelivery() {
    }

    public OnDelivery(String vehicleName, String vehicleType, String driveerName, String leftTime) {
        this.setVehicleName(vehicleName);
        this.setVehicleType(vehicleType);
        this.setDriveerName(driveerName);
        this.setLeftTime(leftTime);
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getDriveerName() {
        return driveerName;
    }

    public void setDriveerName(String driveerName) {
        this.driveerName = driveerName;
    }

    public String getLeftTime() {
        return leftTime;
    }

    public void setLeftTime(String leftTime) {
        this.leftTime = leftTime;
    }
}
