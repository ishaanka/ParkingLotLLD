package Entrance;

import ParkingSpot.IParkingSpot;
import ParkingSpotManager.IParkingSpotManager;
import ParkingSpotManager.ParkingSpotManagerFactory;
import ParkingStrategy.IParkingStrategy;
import Ticket.Ticket;
import Vehicle.IVehicle;

public class Entrance {
    public ParkingSpotManagerFactory parkingSpotManagerFactory;
    public IParkingSpotManager parkingSpotManager;
    public IVehicle vehicle;

    public Entrance(IVehicle vehicle, IParkingStrategy parkingStrategy) {
        this.parkingSpotManagerFactory = new ParkingSpotManagerFactory();
        parkingSpotManager = this.parkingSpotManagerFactory.getParkingSpotManager(vehicle, parkingStrategy);
        this.vehicle = vehicle;
    }

    public Ticket createTicket(int entryTime) {
        IParkingSpot parkingSpot = findParkingSpot();
        return new Ticket(vehicle, entryTime, parkingSpot);
    }

    public IParkingSpot findParkingSpot() {
        return parkingSpotManager.parkingStrategy.getParkingSpot();
    }
}
