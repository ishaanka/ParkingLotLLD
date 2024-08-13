package Vehicle;

public class FourWheelerVehicle extends IVehicle{
    public FourWheelerVehicle(int vehicleNumber) {
        this.vehicleType = VehicleType.FOUR_WHEELER;
        this.vehicleNumber = vehicleNumber;
    }
}
