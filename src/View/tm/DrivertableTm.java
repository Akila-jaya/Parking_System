package View.tm;

import javafx.scene.control.Button;

public class DrivertableTm {
    private String name;
    private String nIC;
    private String drivingLicense;
    private String address;
    private String contact;
    private Button btn;

    public DrivertableTm() {
    }

    public DrivertableTm(String name, String nIC, String drivingLicense, String address, String contact, Button btn) {
        this.name = name;
        this.nIC = nIC;
        this.drivingLicense = drivingLicense;
        this.address = address;
        this.setContact(contact);
        this.btn = btn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getnIC() {
        return nIC;
    }

    public void setnIC(String nIC) {
        this.nIC = nIC;
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(String drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
