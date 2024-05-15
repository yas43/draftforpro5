package Models;

public class Firestations {
    String address;
    String station;

    public Firestations(String address, String station) {
        this.address = address;
        this.station = station;
    }

    public Firestations() {
    }

    public String getAddress() {
        return address;
    }

    public String getStation() {
        return station;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setStation(String station) {
        this.station = station;
    }

    @Override
    public String toString() {
        return "Models.Firestations{" +
                "address='" + address + '\'' +
                ", station='" + station + '\'' +
                '}';
    }
}
