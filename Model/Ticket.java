package Model;
public class Ticket {
    int tid;
    ParkingSpot parkingSpot;
    int startTime;
    Vehicle vehicle;

    public Ticket(int tid, ParkingSpot parkingSpot, int startTime, Vehicle vehicle) {
        this.tid = tid;
        this.parkingSpot = parkingSpot;
        this.startTime = startTime;
        this.vehicle = vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
