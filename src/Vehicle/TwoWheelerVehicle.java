package Vehicle;

public class TwoWheelerVehicle extends IVehicle{
    public TwoWheelerVehicle(int vehicleNumber){
        this.vehicleType = VehicleType.TWO_WHEELER;
        this.vehicleNumber = vehicleNumber;
    }
}
