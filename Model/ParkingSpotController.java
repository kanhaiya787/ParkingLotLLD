package Model;

import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.ParameterList;

import java.util.ArrayList;

public class ParkingSpotController {
    ArrayList<ParkingSpot> parkingSpots;

    public ParkingSpotController(ArrayList<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public ParkingSpot findParkingSpot(Vehicle vehicle){
        ParkingSpot foundParkingSpot = null;
        for(ParkingSpot parkingSpot: parkingSpots){
            if(parkingSpot.isEmpty() && parkingSpot.vehicleType == vehicle.getVehileType()){
                foundParkingSpot = parkingSpot;
            }
        }
        if(foundParkingSpot==null)
            throw new NullPointerException("No Free Parking Space");
        return foundParkingSpot;
    }


    public void bookSpot(ParkingSpot parkingSpot, Vehicle vehicle){
        parkingSpot.setEmpty(false);
    }

    public void removeSpot(ParkingSpot parkingSpot){
        parkingSpot.setEmpty(true);
    }
}
