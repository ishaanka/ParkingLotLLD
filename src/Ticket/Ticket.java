package Ticket;

import ParkingSpot.IParkingSpot;
import Vehicle.IVehicle;

public class Ticket {
    public IVehicle vehicle;
    public int entryTime;
    public IParkingSpot parkingSpot;

    public Ticket(IVehicle vehicle, int entryTime, IParkingSpot parkingSpot) {
        this.vehicle = vehicle;
        this.entryTime = entryTime;
        this.parkingSpot = parkingSpot;
    }
}
