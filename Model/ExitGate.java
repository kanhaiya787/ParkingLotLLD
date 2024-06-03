package Model;

public class ExitGate {
    Ticket ticket;
    ParkingSpotController parkingSpotController;

    public ExitGate(Ticket ticket, ParkingSpotController parkingSpotController){
        this.ticket=ticket;
        this.parkingSpotController = parkingSpotController;
    }

    public int calculateCost(Ticket ticket){
        int currTime=10;
        int cost = ticket.parkingSpot.getPrice() * (currTime - ticket.startTime);
        return cost;
    }

    public void freeParkingSpot(ParkingSpot parkingSpot){
        parkingSpotController.removeSpot(parkingSpot);
    }
}
