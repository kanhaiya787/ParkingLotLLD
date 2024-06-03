import Model.*;

import java.util.ArrayList;

public class ParkingSpotDriver {
    ParkingSpotController parkingSpotController;

    public ParkingSpotDriver() {
        initialize();
    }

    public void initialize(){
        ArrayList<ParkingSpot> parkingSpots = generateSpots();
        parkingSpotController = new ParkingSpotController(parkingSpots);

        Vehicle v1 = new Vehicle(1, VehicleType.TWO_WHEELER);
        Vehicle v2 = new Vehicle(2, VehicleType.FOUR_WHEELER);

        EntryGate entryGate = new EntryGate(parkingSpotController);
        try {

            ParkingSpot parkingSpot1 = entryGate.findParkingSpot(v1);
            ParkingSpot parkingSpot2 = entryGate.findParkingSpot(v2);

            Ticket bikeTicket = entryGate.generateTicket(1, 6, parkingSpot1, v1);
            Ticket carTicket = entryGate.generateTicket(2, 8, parkingSpot2, v2);

            entryGate.ParkVehicle(parkingSpot1, v1);
            entryGate.ParkVehicle(parkingSpot2, v2);

            ExitGate exitBike = new ExitGate(bikeTicket, parkingSpotController);
            ExitGate exitCar = new ExitGate(carTicket, parkingSpotController);

            int bikeCost = exitBike.calculateCost(bikeTicket);
            int carCost = exitCar.calculateCost(carTicket);

            System.out.println("Total amount for Vehicle with number: " + bikeTicket.getVehicle().getVid() + " is: " + bikeCost);
            System.out.println("Total amount for Vehicle with number: " + carTicket.getVehicle().getVid() + " is: " + carCost);

            exitBike.freeParkingSpot(parkingSpot1);
            exitCar.freeParkingSpot(parkingSpot2);
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }
    }

    public ArrayList<ParkingSpot> generateSpots(){
        ArrayList<ParkingSpot> parkingSpots = new ArrayList<>();

        for(int i=0;i<1;i++){
            parkingSpots.add(new TwoWhellerParkingSpot(true, 200, VehicleType.TWO_WHEELER));
            parkingSpots.add(new FourWheelerParkingSpot(true, 500, VehicleType.FOUR_WHEELER));
        }
        return parkingSpots;
    }

}
