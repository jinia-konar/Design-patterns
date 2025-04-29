import vehicles.Vehicle;

public class VehicleFactory {

    public Vehicle getVehicle(VehicleType vehicleType) {
        if (vehicleType == null) {
            throw new IllegalArgumentException("No valid vehicle type found");
        }
        return vehicleType.getVehicle();
    }
}
