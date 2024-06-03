package Model;

public class EntryGate {
    ParkingSpotController parkingSpotController;

    public EntryGate(ParkingSpotController parkingSpotController) {
        this.parkingSpotController = parkingSpotController;
    }

    public ParkingSpot findParkingSpot(Vehicle vehicle){
        ParkingSpot parkingSpot = parkingSpotController.findParkingSpot(vehicle);
        return parkingSpot;
    }

    public Ticket generateTicket(int id, int startTime, ParkingSpot parkingSpot, Vehicle vehicle){
        return new Ticket(id,parkingSpot,startTime,vehicle);
    }

    public void ParkVehicle(ParkingSpot parkingSpot, Vehicle vehicle){
        parkingSpotController.bookSpot(parkingSpot, vehicle);
    }
}
