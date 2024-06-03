package Model;

public class ParkingSpot {
    boolean isEmpty;
    VehicleType vehicleType;
    int price;

    public ParkingSpot(boolean isEmpty, int price, VehicleType vehicleType) {
        this.isEmpty = isEmpty;
        this.price = price;
        this.vehicleType = vehicleType;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
