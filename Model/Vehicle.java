package Model;
public class Vehicle {
    int vid;
    VehicleType vehileType;

    public Vehicle(int vid, VehicleType vehileType) {
        this.vid = vid;
        this.vehileType = vehileType;
    }

    public int getVid() {
        return vid;
    }

    public void setVid(int vid) {
        this.vid = vid;
    }

    public VehicleType getVehileType() {
        return vehileType;
    }

    public void setVehileType(VehicleType vehileType) {
        this.vehileType = vehileType;
    }
}
