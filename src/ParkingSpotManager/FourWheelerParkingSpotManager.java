package ParkingSpotManager;

import ParkingSpot.IParkingSpot;
import ParkingStrategy.IParkingStrategy;
import Vehicle.IVehicle;

import java.util.ArrayList;

public class FourWheelerParkingSpotManager extends IParkingSpotManager {
    public FourWheelerParkingSpotManager(IParkingStrategy strategy) {
        this.parkingSpots = new ArrayList<IParkingSpot>();
        this.parkingStrategy = strategy;
    }
    public void addParkingSpot(IParkingSpot parkingSpot) {
        this.parkingSpots.add(parkingSpot);
    }
    public void removeParkingSpot(IParkingSpot parkingSpot) {
        this.parkingSpots.remove(parkingSpot);
    }
    public void addParking(IParkingSpot parkingSpot, IVehicle vehicle) {
        parkingSpot.parkVehicle(vehicle);
    }
    public void removeParking(IParkingSpot parkingSpot, IVehicle vehicle) {
        parkingSpot.removeVehicle();
    }
}
