package model;

public class Driver {
         private String driverName;
         private String nIC;
         private String lNumber;
         private String address;

    public Driver() {
    }

    public Driver(String driverName, String nIC, String lNumber, String address, String contact) {
        this.driverName = driverName;
        this.nIC = nIC;
        this.lNumber = lNumber;
        this.address = address;
        this.contact = contact;
    }

    private String contact;


    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getnIC() {
        return nIC;
    }

    public void setnIC(String nIC) {
        this.nIC = nIC;
    }

    public String getlNumber() {
        return lNumber;
    }

    public void setlNumber(String lNumber) {
        this.lNumber = lNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}







