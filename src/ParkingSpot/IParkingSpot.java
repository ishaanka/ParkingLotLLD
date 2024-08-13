package ParkingSpot;

import Vehicle.IVehicle;

public abstract class IParkingSpot {
    public int id;
    public IVehicle vehicle;
    public Boolean isEmpty;
    public int price;
    public abstract void parkVehicle(IVehicle vehicle);
    public abstract void removeVehicle();
}
