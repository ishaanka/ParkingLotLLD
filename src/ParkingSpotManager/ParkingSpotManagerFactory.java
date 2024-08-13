package ParkingSpotManager;

import ParkingStrategy.IParkingStrategy;
import Vehicle.FourWheelerVehicle;
import Vehicle.IVehicle;
import Vehicle.TwoWheelerVehicle;

public class ParkingSpotManagerFactory {
    public IParkingSpotManager getParkingSpotManager(IVehicle vehicle, IParkingStrategy parkingStrategy) {
        if(vehicle instanceof TwoWheelerVehicle) {
            return new TwoWheelerParkingSpotManager(parkingStrategy);
        }
        else if(vehicle instanceof FourWheelerVehicle) {
            return new FourWheelerParkingSpotManager(parkingStrategy);
        }
        else {
            return null;
        }
    }
}
