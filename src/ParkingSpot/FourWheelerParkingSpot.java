package ParkingSpot;

import Vehicle.IVehicle;

public class FourWheelerParkingSpot extends IParkingSpot {
    public FourWheelerParkingSpot(int price) {
        this.isEmpty = true;
        this.vehicle = null;
        this.price = price;
    }
    @Override
    public void parkVehicle(IVehicle vehicle) {
        this.vehicle = vehicle;
        this.isEmpty = false;
    }

    @Override
    public void removeVehicle() {
        this.vehicle = null;
        this.isEmpty = true;
    }
}
