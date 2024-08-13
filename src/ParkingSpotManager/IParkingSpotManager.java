package ParkingSpotManager;

import ParkingSpot.IParkingSpot;
import ParkingStrategy.IParkingStrategy;
import Vehicle.IVehicle;

import java.util.List;

public abstract class IParkingSpotManager {
    List<IParkingSpot> parkingSpots;
    public IParkingStrategy parkingStrategy;
    public abstract void addParkingSpot(IParkingSpot parkingSpot);
    public abstract void removeParkingSpot(IParkingSpot parkingSpot);
    public abstract void addParking(IParkingSpot parkingSpot, IVehicle vehicle);
    public abstract void removeParking(IParkingSpot parkingSpot, IVehicle vehicle);
}
