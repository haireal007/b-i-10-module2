package btOnTap;

public class Hotel <Hotel> {
    private String roomType;
    private double roomRate;
    private String address;

    public Hotel() {
    }

    public Hotel(String roomType, double roomRate, String address) {
        this.roomType = roomType;
        this.roomRate = roomRate;
        this.address = address;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getRoomRate() {
        return roomRate;
    }

    public void setRoomRate(double roomRate) {
        this.roomRate = roomRate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "roomType='" + roomType + '\'' +
                ", roomRate=" + roomRate +
                ", address='" + address + '\'' +
                '}';
    }
}
