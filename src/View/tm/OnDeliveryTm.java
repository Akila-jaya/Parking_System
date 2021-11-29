package View.tm;

public class OnDeliveryTm {
    private String vehicleName;
    private String vehicleType;
    private String driveerName;

    public OnDeliveryTm() {
    }

    private String leftTime;

    public OnDeliveryTm(String vehicleName, String vehicleType, String driveerName, String leftTime) {
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

