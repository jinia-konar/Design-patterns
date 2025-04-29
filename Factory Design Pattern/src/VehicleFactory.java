import vehicles.Bike;
import vehicles.Car;
import vehicles.Truck;
import vehicles.Vehicle;

public class VehicleFactory {

    public Vehicle getVehicle(VehicleType vehicleType) {
        return switch (vehicleType) {
            case CAR -> new Car();
            case BIKE -> new Bike();
            case TRUCK -> new Truck();
            case null, default -> throw new IllegalArgumentException("No valid vehicle type found");
        };
    }
}
