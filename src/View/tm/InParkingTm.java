package View.tm;

public class InParkingTm {

    private String vehicleNumber;
    private String vehicleType;
    private String slot;
    private String time;

    public InParkingTm() {
    }



    public InParkingTm(String vehicleNumber, String vehicleType, String slot, String time) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.slot = slot;
        this.setTime(time);
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
