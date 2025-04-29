import vehicles.Vehicle;

public class VehicleFactory {

    /**
     * Without volatile:
     * When one thread initializes the singleton instance (instance = new VehicleFactory();),
     * the Java memory model does not guarantee that other threads will see the fully constructed object immediately.
     * This can lead to race conditions or other subtle issues like:
     *
     * With volatile:
     * Visibility: It ensures that any changes to the instance field are visible to all other threads immediately.
     * When one thread writes to instance, any other thread reading it will see the updated value (and the object fully constructed).
     */
    private static volatile VehicleFactory instance; //Used volatile because

    private VehicleFactory() {}

    public static VehicleFactory getInstance() {
        if (instance == null) {
            synchronized (VehicleFactory.class) {
                if (instance == null) {
                    instance = new VehicleFactory();
                }
            }
        }
        return instance;
    }

    public Vehicle getVehicle(VehicleType vehicleType) {
        if (vehicleType == null) {
            throw new IllegalArgumentException("No valid vehicle type found");
        }
        return vehicleType.getVehicle();
    }
}
